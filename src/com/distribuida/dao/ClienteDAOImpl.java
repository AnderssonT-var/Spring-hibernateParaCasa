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
		
		return session.createQuery("from Cliente",Cliente.class).getResultList();
	}

	@Override
	@Transactional
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.get(Cliente.class, id);
	}

	@Override
	@Transactional
	public void add(Cliente cliente) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		session.saveOrUpdate(cliente);	
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
		Query <Cliente> query = session.createQuery(
			"Select CL"
				+"from Cliente CL"
				+"where CL.cedula LIKE : keyBusqueda "
				+"or CL.nombre LIKE :keyBusqueda "
				+"or CL.apellido LIKE keyBusqueda "
				+"or CL.edad LIKE : keyBusqueda "
				+"or CL.fechaNacimiento LIKE : keyBusqueda "
				+"or CL.direccion LIKE : keyBusqueda "
				+"or CL.telefono LIKE : keyBusqueda "
				+"or CL.correo LIKE : keyBusqueda "

				, Cliente.class);
				
	query.setParameter("busqueda","%" +busqueda+"%");	
		return query.getResultList();
	}

	
	
}
