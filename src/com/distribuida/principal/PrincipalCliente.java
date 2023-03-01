package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Cliente;
import com.distribuida.service.ClienteService;

public class PrincipalCliente {
	public static void main (String[] args) {
		


	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	ClienteService ClienteService = context.getBean("clienteServiceImpl",ClienteService.class);
	
	List<Cliente> Clientes = ClienteService.findAll();
	
	
	
	
	
//	Cliente cliente = ClienteService.findOne(1);
		
//	ClienteService.add("777777777","nombre7","apellido7",77,new Date(),"direccion7","telefono7","correo7");
	
//	ClienteService.up(40,"","","",26,new Date(), "77","77","77");

//  ClienteService.del(40);	
	
	List<Cliente> Cliente1 =ClienteService.findAll("21");
	
	for(Cliente item : Cliente1) {
		System.out.println(item);
	
	}
	
	
	}
}