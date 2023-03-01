package com.distribuida.dao;

import java.util.List;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Cliente;


@Repository
public class ClienteDAOImpl implements ClienteDAO{


	@Autowired
	private SessionFactory sessionFactory; 
	
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		List<Cliente> clientes = session.createQuery("select cl from Cliente cl",Cliente.class).getResultList();
		return clientes;
	}

	@Override
	@Transactional
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		Query query = session.createQuery("select cl from Cliente cl where idCliente = : keyID",Cliente.class);
		return session.get(Cliente.class, id);
	}

	@Override
	@Transactional
	public void add(Cliente cliente) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		session.save(cliente);	
	}

	@Override
	public void up(Cliente cliente) {
		// TODO Auto-generated method stub
	
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		
		Cliente cliente = session.get(Cliente.class,id);
		
		session.delete(cliente);
	}

	@Override
	@Transactional
	public List<Cliente> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		Query  query = session.createQuery(
			"Select CL "
				+" from Cliente CL"
				+" where CL.cedula LIKE : keybusqueda "
				+" or CL.nombre LIKE :keybusqueda "
				+" or CL.apellido LIKE : keybusqueda "
				+" or CL.edad LIKE : keybusqueda "
				+" or CL.fechaNacimiento LIKE : keybusqueda "
				+" or CL.direccion LIKE : keybusqueda "
				+" or CL.telefono LIKE : keybusqueda "
				+" or CL.correo LIKE : keybusqueda "

				, Cliente.class);
				
	query.setParameter("keybusqueda","%" +busqueda+"%");	
		return query.getResultList();
	}

	
	
}
