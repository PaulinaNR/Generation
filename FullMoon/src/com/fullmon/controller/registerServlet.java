package com.fullmon.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fullmon.model.User;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		User miUsuario = new User();
		miUsuario.setNombreUsuario(request.getParameter("txtNombre"));
		miUsuario.setApellidosUsuario(request.getParameter("txtApellido"));
		miUsuario.setCorreoUsuario(request.getParameter("txtEmail"));
		miUsuario.setPwdUsuario(request.getParameter("txtPassword"));
		miUsuario.setAdmin(false);
		
		/*
		response.getWriter().append("Nombre: " + miUsuario.getNombre());
		response.getWriter().append(" Apellido: " + miUsuario.getApellido());
		response.getWriter().append(" Email: " + miUsuario.getEmail());
		response.getWriter().append(" Password: " + miUsuario.getPassword());
		response.getWriter().append(" RePassword:" + miUsuario.getRepassword());
		*/
		
//		if(request.getParameter("txtRepetirPassword") == request.getParameter("txtPassword"))
//		{
			Properties props = new Properties();
			String nombreArchivo = "config.properties";
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nombreArchivo);
			
			if(inputStream!=null) {
				props.load(inputStream);
			}
			else {
				throw new FileNotFoundException("Property file '" + nombreArchivo + "' no se encontro en el classpath");
			}
			
			
			
			String urlServidor = props.getProperty("urlServidor");
			String usuario = props.getProperty("usuario");
			String password = props.getProperty("password");
			String sentenciaSQL = props.getProperty("sentenciaINSERTusuario");
	//		sentenciaINSERTusuario = INSERT INTO usuarios VALUES (0,?,?,?,?,?)
			
			Connection conn = null;
			PreparedStatement pstmnt = null;
			int nRegistros = 0;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
				conn = DriverManager.getConnection(urlServidor, usuario, password);
				pstmnt = conn.prepareStatement(sentenciaSQL);
				
				pstmnt.setString(1, miUsuario.getNombreUsuario());
				pstmnt.setString(2, miUsuario.getApellidosUsuario());
				pstmnt.setString(3, miUsuario.getCorreoUsuario());
				pstmnt.setString(4, miUsuario.getPwdUsuario());
				pstmnt.setBoolean(5, miUsuario.isAdmin());
				
				nRegistros = pstmnt.executeUpdate();
				
				if(nRegistros>0) 
				{
					request.getRequestDispatcher("principal2.jsp").forward(request, response);
					PrintWriter out = response.getWriter();
			        out.println("<html><body>");
			        out.println("<script type=\"text/javascript\">");
			        out.println("alert('Usuario creado con exito' + miUsuario.getNombreUsuario())");
			        out.println("</script>");
			        out.println("</body></html>");
				}
				else 
				{
					response.getWriter().append("Error al crear Usuario");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			/*
			response.setContentType("application/json");
			Gson objGson = new Gson();
			String miJson;
			miJson = objGson.toJson(miUsuario);
			
			objGson.toJson(miJson);
			
			response.getWriter().append(miJson);
			response.getWriter().append(objGson.toJson(miJson));
			*/
//		}
//		else
//			response.getWriter().append("Error al crear Usuario");
	}

}
