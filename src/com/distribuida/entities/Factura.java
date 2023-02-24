package com.distribuida.entities;


//import java.text.SimpleDateFormat;
import java.util.Date;

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

import com.distribuida.principal.DatosEmpresa;

@Component
@Entity
@Table(name="Factura")
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idFactura")
	private int idFactura;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "totalNeto")
	private double totalNeto;
	@Column(name = "iva")
	private double iva;
	@Column(name = "total")
	private double total;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Id_Cliente")
	private Cliente cliente;
	//private DatosEmpresa datosEmpresa;
	 
	public Factura() {}
	 
	@Autowired	
	public Factura(Cliente cliente) {
		
		this.cliente = cliente;
	}
	
	
	public Factura (int idFactura,Date fecha,double totalNeto,double iva,double total) {
	
		this.idFactura=idFactura;
		this.fecha=fecha;
		this.totalNeto=totalNeto;
		this.iva=iva;
		this.total=total;
	}
	

	
	public void setIdFactura(int idFactura) {
		this.idFactura=idFactura;
		
	}
	public int getIdFactura() {
		return idFactura;
	}
	
	public void setFecha(Date fecha) {
		this.fecha=fecha;
		
	}
	public Date getFecha() {
		return fecha;
	}
	
	public void setTotalNeto(double totalNeto) {
		this.totalNeto=totalNeto;
	}
		
	public void setTotalNeto(Double totalNeto) {
		this.totalNeto = totalNeto;
	}
	
	public void setTotalNeto(Double subtotal,Boolean bool) {
		this.totalNeto = totalNeto+ subtotal;
	}
		
	
	public double getTotalNeto() {
		return totalNeto;
	}
	
	public void setIva(double iva) {
		this.iva=iva;
		
	}
	public double getIva() {
		return iva;
	}
	
	public void setTotal(double total) {
		this.total=total;
		
	}
	public double getTotal() {
		return total;
	}
	 
	
	
	public DatosEmpresa getDatosEmpresa() {
		return datosEmpresa;
	}

	@Autowired
	public void setDatosEmpresa(DatosEmpresa datosEmpresa) {
		this.datosEmpresa = datosEmpresa;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", fecha=" + fecha + ", totalNeto=" + totalNeto + ", iva=" + iva
				+ ", total=" + total + ", clientes=" + clientes + ",\n datosEmpresa=" + datosEmpresa + "]";
	}

	
	
	

}
