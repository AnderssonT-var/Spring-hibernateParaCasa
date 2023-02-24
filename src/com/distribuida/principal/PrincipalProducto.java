package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;


import com.distribuida.entities.Producto;
import com.distribuida.service.ProductoService;


public class PrincipalProducto {
	public static void main (String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ProductoService ProductoService = context.getBean("productoServiceImpl",ProductoService.class);
		
		List<Producto> Productos = ProductoService.findAll();

		Producto Producto = ProductoService.findOne(1);
		
		
//	ProductoService.add("Mango","1kg de Mango",0.75,300);
		
//	ProductoService.up(21,"Mango","Medio kilo de Mango",0.75,150);
	
 // ProductoService.del(22);	
	
//	ProductoService.findAll("10");
		
		for(Producto item : Productos) {
			System.out.println(item);
		
		}
	}
}
