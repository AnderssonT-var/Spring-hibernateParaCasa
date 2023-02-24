package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class DetalleFactura {
	private int idDetalleFactura;
	private int cantidad;
	private double subtotal;
	
	@Autowired
	private Producto producto;
	
	  
	public DetalleFactura() {}
	
	public DetalleFactura(Producto producto) {
		this.producto=producto;
	}


	public DetalleFactura(int idDetalleFactura,int cantidad,double subtotal) {
		this.idDetalleFactura=idDetalleFactura;
		this.cantidad=cantidad;
		this.subtotal=subtotal;
			
}
	public void setIdDetalleFactura(int idDetalleFactura) {
		this.idDetalleFactura=idDetalleFactura;
		
	}
	public int getIdDetalleFactura() {
		return idDetalleFactura;
	}
	public void setCantidad(int cantidad) {
		this.cantidad=cantidad;
		
	}
	public int getCantidad() {
		return cantidad;
	}
	
	public void setSubtotal(double subtotal) {
		this.subtotal=subtotal;
		
	}
	public double getSubtotal() {
		return subtotal;
	}
	
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "DetalleFactura [idDetalleFactura=" + idDetalleFactura + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", producto=" + producto + "]";
	}

	
}
