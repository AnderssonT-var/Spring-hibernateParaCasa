package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Factura;

public interface FacturaDAO {
	
	//CRUD BASICO : (CREATE, READ, UPDATE,
	public List<Factura> findAll();
	
	public Factura findOne(int id);
		
	public void add(Factura factura);
	
	//public void up(çugggg gUgggg);
	public void del(int id);
	
	
	public List<Factura> findAll(String busqueda);
	
}