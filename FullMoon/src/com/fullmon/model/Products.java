package com.fullmon.model;

public class Products 
{
	private int idProducto;
	private String nombreProducto;
	private String fotoProducto;
	private double precioProducto;
	private String descripcionProducto;
	private int cantidadPoducto;
	private String categoriaProducto;
	
	public Products()
	{}

	public Products(int idProducto, String nombreProducto, String fotoProducto, double precioProducto,
			String descripcionProducto, int cantidadPoducto, String categoriaProducto) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.fotoProducto = fotoProducto;
		this.precioProducto = precioProducto;
		this.descripcionProducto = descripcionProducto;
		this.cantidadPoducto = cantidadPoducto;
		this.categoriaProducto = categoriaProducto;
	}

	@Override
	public String toString() {
		return "Products [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", fotoProducto="
				+ fotoProducto + ", precioProducto=" + precioProducto + ", descripcionProducto=" + descripcionProducto
				+ ", cantidadPoducto=" + cantidadPoducto + ", categoriaProducto=" + categoriaProducto + "]";
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getFotoProducto() {
		return fotoProducto;
	}

	public void setFotoProducto(String fotoProducto) {
		this.fotoProducto = fotoProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public int getCantidadPoducto() {
		return cantidadPoducto;
	}

	public void setCantidadPoducto(int cantidadPoducto) {
		this.cantidadPoducto = cantidadPoducto;
	}

	public String getCategoriaProducto() {
		return categoriaProducto;
	}

	public void setCategoriaProducto(String categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}
	
	
}
