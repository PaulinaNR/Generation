package com.fullmon.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.fullmon.model.Producto;



@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList <String[]> listaProductos = new ArrayList<String[]>();
		
		String url = "jdbc:mysql://localhost:3306/e_comerce?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "cohort13";
		String password = "root";
		
		//Declaramos e inicializamos los objetos de conexion
		Connection conn = null;
		Statement stmnt = null;
		ResultSet rs = null;
		String[] info;

		int numProductos[] = new int[2];
		String varProductos[] = new String[4];
		
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, usuario, password);

            stmnt = conn.createStatement();
	        rs = stmnt.executeQuery("SELECT * FROM e_comerce.carrito;");
	        
	        for(int con = 0;rs.next();con++)
            {
        		info = new String[4];
        		info[0] = rs.getString("nombreProducto");
        		info[1] = rs.getString("precioProducto");
        		info[2] = rs.getString("cantidadProducto");
        		info[3] = rs.getString("fotosProducto");
	        	
	        	listaProductos.add(info);
            	
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
