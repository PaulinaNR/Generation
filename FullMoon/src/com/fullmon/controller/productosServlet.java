package com.fullmon.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.fullmon.model.Producto;


@WebServlet("/productosServlet")
public class productosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList <ArrayList<Producto>> listaProductos = new ArrayList<ArrayList<Producto>>();
		
		String url = "jdbc:mysql://localhost:3306/e_comerce?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "cohort13";
		String password = "root";
		
		//Declaramos e inicializamos los objetos de conexion
		Connection conn = null;
		Statement stmnt = null;
		ResultSet rs = null;

		int numProductos[] = new int[2];
		String varProductos[] = new String[4];
		
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, usuario, password);

            stmnt = conn.createStatement();
	        rs = stmnt.executeQuery("select * from productos;");
	        
	        for(int con = 0;rs.next();con++)
            {
	        	if(con%8==0)
	        	{
	        		listaProductos.add(new ArrayList<Producto>());
	        	}
	        	numProductos[0] = rs.getInt("idProducto");
	        	varProductos[0] = rs.getString("nombreProducto");
	        	varProductos[1] = rs.getString("fotosProducto");
	        	varProductos[2] = rs.getString("precioProducto");
	        	numProductos[1] = rs.getInt("cantidadProducto");
	        	varProductos[3] = rs.getString("categoriaProducto");
	        	
	        	listaProductos.get(con/8).add(new Producto(numProductos[0], varProductos[0], varProductos[1]
	        			, varProductos[2], numProductos[1], varProductos[3]));
            	
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
        finally
		{
			try 
			{
				rs.close();
				stmnt.close();
				conn.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		

		Gson objGson = new Gson();
		String miJson;
		miJson = objGson.toJson(listaProductos);
		response.getWriter().append(miJson);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
