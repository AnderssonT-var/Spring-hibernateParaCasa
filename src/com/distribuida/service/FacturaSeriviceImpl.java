package com.distribuida.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Factura;

@Service
public class FacturaSeriviceImpl implements FacturaService {
	
	
	@Autowired
	private FacturaDAO facturaDAO;
	
	@Autowired
	private ClienteDAO clienteDAO;
	

	@Override
	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		return facturaDAO.findAll();
	}

	@Override
	public Factura findOne(int id) {
		// TODO Auto-generated method stub
		return facturaDAO.findOne(id);
	}

	@Override
	public void add(Date fecha, double total_neto, double iva, double total, int id_cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Factura> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}



}
