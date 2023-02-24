package com.distribuida.service;

import java.util.List;

import com.distribuida.dao.ProductoDAO;
import com.distribuida.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoDAO productoDAO;
	
	@Override
	@Transactional
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return productoDAO.findAll();
	}

	@Override
	@Transactional
	public Producto findOne(int id) {
		// TODO Auto-generated method stub
		return productoDAO.findOne(id);
	}

	@Override
	public void add(Producto producto) {
		// TODO Auto-generated method stub
		productoDAO.add(producto);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		productoDAO.del(id);
	}

	@Override
	public List<Producto> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return productoDAO.findAll(busqueda);
	}

	@Override
	@Transactional
	public void add(String nombre, String descripcion, double precio, int stock) {
		// TODO Auto-generated method stub
		Producto producto = new Producto(nombre,descripcion,precio,stock);
		productoDAO.add(producto);
	}

	@Override
	@Transactional
	public void up(int idProducto, String nombre, String descripcion, double precio, int stock) {
		// TODO Auto-generated method stub
		Producto producto = new Producto(idProducto,nombre,descripcion,precio,stock);
		productoDAO.add(producto);
	}

}
