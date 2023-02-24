package com.distribuida.entities;

import org.springframework.stereotype.Component;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Component
@Entity
@Table(name="Clientes")
public class Cliente{
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Cliente")
	private int idCliente;
	@Column(name="cedula")
	private String cedula;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
	@Column(name="edad")
	private int edad;
	@Column(name="fecha_nac")
	private Date fechaNacimiento;
	@Column(name="direccion")
	private String direccion;
	@Column(name="telefono")
	private String telefono;
	@Column(name="correo")
	private String correo;

  
public Cliente() {}
		
		
public Cliente(String cedula, String nombre, String apellido, int edad, Date fechaNacimiento, String direccion,String telefono,String correo) {
	this.cedula = cedula;
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.fechaNacimiento = fechaNacimiento;
	this.direccion = direccion;
	this.telefono= telefono;
	this.correo = correo;
}


public Cliente(int idCliente, String cedula, String nombre, String apellido, int edad, Date fechaNacimiento,String direccion,String telefono, String correo) {

	this.idCliente = idCliente;
	this.cedula = cedula;
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.fechaNacimiento = fechaNacimiento;
	this.direccion = direccion;
	this.telefono= telefono;
	this.correo = correo;
}



public int getIdCliente() {
	return idCliente;
}


public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
}


public String getCedula() {
	return cedula;
}


public void setCedula(String cedula) {
	this.cedula = cedula;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellido() {
	return apellido;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}




public Date getFechaNacimiento() {
	return fechaNacimiento;
}


public void setFechaNacimiento(Date fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public String getCorreo() {
	return correo;
}


public void setCorreo(String correo) {
	this.correo = correo;
}


@Override
public String toString() {
	return "Cliente [idCliente=" + idCliente + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
			+ ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", correo="
			+ correo + "]";
}






}
