package com.fullmon.model;

public class Producto {

	private int idProducto;
	private String nombre;
	private String uri;
	private String precio;
	private int cantidad;
	private String categoria;
	
	public Producto()
	{
		
	}
	
	public Producto(int idProducto, String nombre, String uri, String precio, int cantidad, String categoria)
	{
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.uri = uri;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

}
