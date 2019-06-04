package com.fullmon.model;

public class User 
{
	private int idClientes;
	private String nombreUsuario;
	private String apellidosUsuario;
	private String correoUsuario;
	private String pwdUsuario;
	private boolean admin;
	
	public User()
	{}

	public User(int idClientes, String nombreUsuario, String apellidosUsuario, String correoUsuario, String pwdUsuario,
			boolean admin) {
		super();
		this.idClientes = idClientes;
		this.nombreUsuario = nombreUsuario;
		this.apellidosUsuario = apellidosUsuario;
		this.correoUsuario = correoUsuario;
		this.pwdUsuario = pwdUsuario;
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "User [idClientes=" + idClientes + ", nombreUsuario=" + nombreUsuario + ", apellidosUsuario="
				+ apellidosUsuario + ", correoUsuario=" + correoUsuario + ", pwdUsuario=" + pwdUsuario + ", admin="
				+ admin + "]";
	}

	public int getIdClientes() {
		return idClientes;
	}

	public void setIdClientes(int idClientes) {
		this.idClientes = idClientes;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidosUsuario() {
		return apellidosUsuario;
	}

	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public String getPwdUsuario() {
		return pwdUsuario;
	}

	public void setPwdUsuario(String pwdUsuario) {
		this.pwdUsuario = pwdUsuario;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	
}
