/**
 * 
 */
package com.nelsont4.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.nelsont4.projectjsf.entity.Empleado;

/**
 * @author Nelson
 * Clase que permite realizar la logica de negocio para empleados
 */
public class EmpleadoService {
	/**
	 * Metodo que permite consultar la lista de empleados de empresas de TI.
	 * @return {@link Empleado} Lista de empleados	
	 */
	public List<Empleado> consultarEmpleados() {
		/**
		 * Generar la lista de empleados a consultar
		 */
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("Lopez");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luis Jesus");
		empleadoMicrosoft.setPrimerApellido("Lopez");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("Lopez");
		empleadoApple.setSegundoApellido("Paniagua");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoApple);
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		
		return empleados;
	}
}
