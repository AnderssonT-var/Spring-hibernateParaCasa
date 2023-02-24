package com.distribuida.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.distribuida.entities.Factura;


@Repository
@Transactional
public class FacturaDAOImpl implements FacturaDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	@Transactional
	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("From Factura", Factura.class).getResultList();
	}

	@Override
	@Transactional
	public Factura findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Factura.class, id);
	}

	@Override
	@Transactional
	public void add(Factura factura) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(factura);
		
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Factura factura = session.get(Factura.class, id);
		session.delete(factura);
	}

	@Override
	@Transactional
	public List<Factura> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Factura> query = session.createQuery(
				
				"select fa"
				+ "from Factura fa"
				+ "where fa.fecha LIKE:busqueda"
				+ "or fa.totaNeto LIKE:busqueda"
				+ "or fa.iva LIKE:busqueda"
				+ "or fa.total LIKE:busquedax|"
				,Factura.class);
		query.setParameter("busqueda","%"+busqueda+"%");
		return query.getResultList();
	}



}
