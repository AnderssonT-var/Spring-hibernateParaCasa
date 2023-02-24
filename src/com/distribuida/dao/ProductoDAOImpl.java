package com.distribuida.dao;

import java.util.List;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.distribuida.entities.Producto;


@Repository
public class ProductoDAOImpl implements ProductoDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		List<Producto> productos = session.createQuery("select pr from Producto pr",Producto.class).getResultList();	
		return productos;
	}

	@Override
	@Transactional
	public Producto findOne(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		Query query = session.createQuery("select pr from Producto pr where idProducto = : keyID",Producto.class);
		query.setParameter("keyID", id);
		
		return (Producto) query.getSingleResult();
	}

	@Override
	public void add(Producto producto) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		session.save(producto);
	}

	@Override
	public void up(Producto producto) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("update Producto set nombre=:nombre, descripcion=:descripcion, precio=:precio, stock=: stock where idProducto=:id_producto");
		query.setParameter("nombre", producto.getNombre());
		query.setParameter("descripcion", producto.getDescripcion());
		query.setParameter("precio", producto.getPrecio());
		query.setParameter("stock", producto.getStock());
		query.setParameter("id_producto", producto.getIdProducto());
		
		query.executeUpdate();
		
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete Producto where idProducto=:id");
		query.setParameter("id",id);
		query.executeUpdate();
		
	}
	

	@Override
	public List<Producto> findAll(String busqueda) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		Query <Producto> query = session.createQuery(
			"Select PR"
				+"from Producto PR"
				+"where PR.nombre LIKE : keyBusqueda "
				+"or PR.descripcion LIKE :keyBusqueda "
				+"or PR.precio LIKE keyBusqueda "
				+"or PR.stock LIKE : keyBusqueda "
				, Producto.class);
				
	query.setParameter("busqueda","%" +busqueda+"%");	
		return query.getResultList();
	}

	@Override
	public void add1(Producto producto) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(producto);
	}

}
