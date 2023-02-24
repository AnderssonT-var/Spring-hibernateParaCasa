package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		List<Cliente> clientes = clienteDAO.findAll();
	
		for(Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		
	}

}
