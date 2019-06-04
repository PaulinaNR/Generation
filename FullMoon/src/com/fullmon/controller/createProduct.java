package com.fullmon.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fullmon.model.Products;

@WebServlet("/createProduct")
public class createProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   {
	   
	   Products miProducto = new Products();
	   miProducto.setNombreProducto(request.getParameter("txtNombreProducto"));
	   miProducto.setCantidadPoducto(Integer.parseInt(request.getParameter(("txtCantidadPoducto"))));
	   miProducto.setCategoriaProducto(request.getParameter("txtCategoriaProducto"));
	   miProducto.setDescripcionProducto(request.getParameter("txtDescipcionProduco"));
	   miProducto.setPrecioProducto(Integer.parseInt(request.getParameter("txtPrecioProducto")));
	   miProducto.setFotoProducto(request.getParameter("txtFotoProducto"));
	   
	   Properties props = new Properties();
	   String nombreArchivo = "config.properties";
	  
	   InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nombreArchivo);
	   if(inputStream != null)
		   props.load(inputStream);
	   else
		  throw new FileNotFoundException("Property file '" + nombreArchivo + "' No se econtró en el classpath");
		
	   String urlServidor = props.getProperty("urlServidor");
	   String usuario = props.getProperty("usuario");
	   String pass = props.getProperty("password");
	   String sentenciaSQL = props.getProperty("sentenciaINSERTproducto");
	  
	   Connection conn = null;
	   PreparedStatement pstmnt = null;
	   int nRegistros = 0;
	  
	   try {	
		   Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
		   conn = DriverManager.getConnection(urlServidor, usuario, pass);
		  
		   pstmnt = conn.prepareStatement(sentenciaSQL);
		   pstmnt.setString(1, miProducto.getNombreProducto());
		   pstmnt.setString(2, miProducto.getFotoProducto());
		   pstmnt.setDouble(3, miProducto.getPrecioProducto());
		   pstmnt.setString(4, miProducto.getDescripcionProducto());
		   pstmnt.setInt(5, miProducto.getCantidadPoducto());
		   pstmnt.setString(6, miProducto.getCategoriaProducto());
		  
		   nRegistros = pstmnt.executeUpdate();
		  
		   if(nRegistros>0)
			   response.getWriter().append("Registro creado!");
		   else
			   response.getWriter().append("Error al cargar registro");
			} catch (Exception e) {
			e.printStackTrace();
			}
			try {
				pstmnt.close();
				conn.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}			  
		  
  }
				  
}


