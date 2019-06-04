package com.fullmon.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


@WebServlet("/PagarServlet")
public class PagarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String salida = "chido";
		String url = "jdbc:mysql://localhost:3306/e_comerce?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "cohort13";
		String password = "root";


		String nombre = request.getParameter("total");
		//String queryInsert = "insert into e_comerce.venta (fechaVenta, DireccionFactura_idDireccionFactura, FormasPAgo_idFormaPago, Clientes_idClientes)\r\n" + 
		//		"values (\"2019-05-31\", 1, 1, 2);";
		String queryInsert = "insert into e_comerce.venta (fechaVenta, DireccionFactura_idDireccionFactura, FormasPAgo_idFormaPago, Clientes_idClientes)\r\n" + 
				"values (\"2019-05-31\", 1, 1, 2);";
		
		
		Connection conn = null;
		PreparedStatement pstmnt = null;
		int nRegistro = 0;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
			conn = DriverManager.getConnection(url,usuario,password);
			pstmnt = conn.prepareStatement(queryInsert);
			
			nRegistro = pstmnt.executeUpdate();
			if(nRegistro>0)
			{
				response.getWriter().append("<p>Registro exitoso</p>");
			}
			else
			{
				response.getWriter().append("<p>Registro fallido</p>");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				pstmnt.close();
				conn.close();
			} 
			catch (SQLException ex) 
			{
				ex.printStackTrace();
			}
		}
		/*response.getWriter().append(salida);
		
		
		RequestDispatcher updatePage = request.getRequestDispatcher("hecho.jsp");

		updatePage.forward(request, response);*/
	}

}
