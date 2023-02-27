package com.distribuida.entities;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Component
@Entity
@Table(name = "DetalleFacturas")
public class FacturaDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detalle_factura")
	private int id_detalle_factura;
	@Column(name = "cantidad")
	private int cantidad;
	@Column(name = "subtotal")
	private double subtotal;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "factura")
	private Factura factura;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "producto")
	private Producto producto;
	
	  
	public FacturaDetalle() {}
	
	public FacturaDetalle(Producto producto) {
		this.producto=producto;
	}


	public FacturaDetalle(int id_detalle_factura,int cantidad,double subtotal) {
		this.id_detalle_factura=id_detalle_factura;
		this.cantidad=cantidad;
		this.subtotal=subtotal;			
}
	
	
	public FacturaDetalle(int cantidad,double subtotal) {
		this.cantidad=cantidad;
		this.subtotal=subtotal;			
}
	
	
	
	public void setid_detalle_factura(int id_detalle_factura) {
		this.id_detalle_factura=id_detalle_factura;
		
	}
	public int getid_detalle_factura() {
		return id_detalle_factura;
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

	
	public Factura getFactura() {
		return factura;
	}

	@Autowired
	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "DetalleFactura [id_detalle_factura=" + id_detalle_factura + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", producto=" + producto + "]";
	}

	
}
