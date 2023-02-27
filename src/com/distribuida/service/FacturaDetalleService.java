package com.distribuida.service;

import java.util.List;

import com.distribuida.entities.FacturaDetalle;

public interface FacturaDetalleService {
	
	public List<FacturaDetalle> findAll();
	
	public FacturaDetalle finOne(int id);
	
	public void add(FacturaDetalle facturaDetalle);
	
	void up(FacturaDetalle facturaDetalle);
	
	public void delete(int id);
	
	public void add(int cantidad,double subtotal, int id_factura, int id_producto);
	public void up(int id_detalle_factura,int cantidad,double subtotal, int id_factura, int id_producto);


}
