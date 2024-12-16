/**
 * 
 */
package com.nelsont4.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.nelsont4.projectjsf.entity.Empleado;
import com.nelsont4.projectjsf.services.EmpleadoService;

/**
 * @author Nelson
 * Clase controller que se encarga de procesar la información para la pantalla principal.xhtml.
 */
@ManagedBean
/**
 * Matener información hasta que  nos pasemos a otra pantalla
 */
@ViewScoped
public class PrincipalController {
	
	/**
	 * lista de empleados para la tabla 
	 */
	private List<Empleado> empleados;
	/**
	 * Servicios con los metodos que realizan la logica de negocios de empleados.
	 */
	private EmpleadoService empleadoServices = new EmpleadoService(); 
	/**
	 * Metodo que se encarga de inicializar la información de la pantalla principal
	 * solo se ejeucta una vez
	 * Se ejecuta cunado se genera la pantalla
	 * para usar PostConstruct es necesario usar la dependencia javax.anotation-api
	 */
	@PostConstruct
	public void init() {
		/**
		 * metodo para inicializar cierta información
		 */
		this.consularEmpleados();
	}
	/**
	 * Metodo que consulta la lista de empleados.
	 */
	public void consularEmpleados() {
		this.empleados = this.empleadoServices.consultarEmpleados();
		
	}
	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
}
