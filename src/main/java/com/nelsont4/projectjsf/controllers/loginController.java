/**
 *
 */
package com.nelsont4.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;

/**
 * @author: Nelson Clase que permite controlar el funcionamineto de pantalla
 *          login.html
 */
@ManagedBean
public class loginController {

	/**
	 * Usuario que ingresa al login
	 */
	private String usuario;

	/**
	 * Contrseña que ingresa
	 */
	private String password;

	/**
	 * Metodo principal que permite ingresar a la pantalla principal del proyecto
	 */

	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		if (usuario.equals("Nelson") && password.equals("1234")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formlogin:idUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no existe", ""));
				e.printStackTrace();
			}
			
		} else {
			/**
			 * FaceContext es propio de JSF nececita un id para el mensaje
			 */
			FacesContext.getCurrentInstance().addMessage("formlogin:idUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos", ""));
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
