package com.distribuida.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDAO clienteDAO;
	
	
	
	@Override
	@Transactional
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteDAO.findAll();
	}

	@Override
	@Transactional
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		return clienteDAO.findOne(id);
	}

	@Override
	public void add(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteDAO.add(cliente);
	}



	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		clienteDAO.del(id);
	}

	@Override
	public List<Cliente> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return clienteDAO.findAll(busqueda);
	}

	@Override
	@Transactional
	public void add(String cedula, String nombre, String apellido, int edad, Date fechaNacimiento, String direccion,
			String telefono, String correo) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente(cedula,nombre,apellido,edad,fechaNacimiento,direccion,telefono,correo);
		clienteDAO.add(cliente);
		
	}

	@Override
	@Transactional
	public void up(int idCliente, String cedula, String nombre, String apellido, int edad, Date fecha, String direccion,
			String telefono, String correo) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente(idCliente,cedula,nombre,apellido,edad,fecha,direccion,telefono,correo);
		clienteDAO.add(cliente);
		
		
		
	}

}
