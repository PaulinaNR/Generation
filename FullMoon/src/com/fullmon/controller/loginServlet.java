package com.fullmon.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import com.fullmon.model.User;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		User miUsuario = new User();
		miUsuario.setNombreUsuario(request.getParameter("txtUserLogin"));
		miUsuario.setPwdUsuario(request.getParameter("txtPwdLogin"));
		
		Properties props = new Properties(); 
		String nombreArchivo = "config.properties";

		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nombreArchivo);
		if(inputStream != null)
			props.load(inputStream);
		else
			throw new FileNotFoundException("Property file '" + nombreArchivo + "' No se encontró en el classpath");
				
		String urlServidor = props.getProperty("urlServidor");
		String usuario = props.getProperty("usuario");
		String pass = props.getProperty("password");
		String sentenciaSQL = props.getProperty("sentenciaLOGIN");
		
		Connection conn = null;
		PreparedStatement pstmnt = null;
		ResultSet nRegistros = null;
		
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			conn = DriverManager.getConnection(urlServidor, usuario, pass);
			
			pstmnt = conn.prepareStatement(sentenciaSQL);
			pstmnt.setString(1, miUsuario.getNombreUsuario());
			pstmnt.setString(2, miUsuario.getPwdUsuario());
			
			nRegistros = pstmnt.executeQuery(); 
			
			if(nRegistros.next())
			{	
				miUsuario.setIdClientes(nRegistros.getInt("idClientes"));
				miUsuario.setApellidosUsuario(nRegistros.getString("apellidosUsuario"));
				miUsuario.setCorreoUsuario(nRegistros.getString("correoUsuario"));
				miUsuario.setAdmin(nRegistros.getBoolean("nivelUsuario"));	
				
				/*
				HttpSession session = request.getSession(true);
				session.setAttribute("idClientes", miUsuario.getIdClientes());
				session.setAttribute("nombreUsuario", miUsuario.getNombreUsuario());
				*/
//				ADMIN
				if(miUsuario.isAdmin() == true) 
				{
//					session.setAttribute("privilegeUser", miUsuario.isAdmin());
//					RequestDispatcher dis = request.getRequestDispatcher ("CrudStatements/update.jsp"); 
//					dis.forward(request, response);
//								ESTE ES EL CHIDO SOLO CAMBIAR LA PARTE "PAGINA DE ADMINISTRADOR"			
//					request.getRequestDispatcher("PAGINA DE ADMINISTRADOR").forward(request, response);
					response.getWriter().append("eres ADMIN");
				}
//				CLLIENT
				else
				{
//					session.setAttribute("privilegeUser", miUsuario.isAdmin());
					request.getRequestDispatcher("principal2.jsp").forward(request, response);
				}
			}				
			else
				response.getWriter().append("Error al logearse");
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
