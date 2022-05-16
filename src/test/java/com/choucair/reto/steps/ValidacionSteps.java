package com.choucair.reto.steps;

import java.util.List;

import com.choucair.reto.pageobjects.ValidacionPage;
import com.choucair.reto.utilities.AccionesWeb;

import net.thucydides.core.annotations.Step;

public class ValidacionSteps {
	
	ValidacionPage loginserenitypageobject;
	AccionesWeb accionesWeb;
	
	@Step
	public void open() {
		accionesWeb.abrirURL("https://www.choucairtesting.com/");
		accionesWeb.espera_implicita(2);
		accionesWeb.tomarEvidencia();
		
	}
	
	@Step
	public void seleccionarOpcionMenu() {
		accionesWeb.bordearElemento(ValidacionPage.getStrOpcionElegida());
		accionesWeb.clickBoton(ValidacionPage.getStrOpcionElegida());
		accionesWeb.tomarEvidencia();
	}
	
	@Step
	public void completarFormulario(List<List<String>> data, int id) {
		accionesWeb.escribirTexto(ValidacionPage.getStrInputNombre(),data.get(id).get(0));
		accionesWeb.escribirTexto(ValidacionPage.getStrWhatsapp(),data.get(id).get(1));
		accionesWeb.escribirTexto(ValidacionPage.getStrCorreo(),data.get(id).get(2));
		accionesWeb.escribirTexto(ValidacionPage.getStrCiudad(),data.get(id).get(3));
		accionesWeb.escribirTexto(ValidacionPage.getStrEmpresa(),data.get(id).get(4));
		accionesWeb.seleccionarOpcion(ValidacionPage.getStrInteres(), "Servicios y Productos");
		accionesWeb.escribirTexto(ValidacionPage.getStrMensaje(),data.get(id).get(5));
		accionesWeb.tomarEvidencia();
		accionesWeb.bordearElemento(ValidacionPage.getBtnEnviar());
		accionesWeb.clickBoton(ValidacionPage.getBtnEnviar());
		accionesWeb.tomarEvidencia();
	}
	
	@Step
	public void validarEnvioFormulario() {
		String strMensaje=accionesWeb.extraerTextodeLabel(ValidacionPage.getLblMensaje());
		System.out.println(strMensaje);
		accionesWeb.validarTextoDeUnElemetoContieneTexto(strMensaje, "The form was sent successfully.");
		accionesWeb.tomarEvidencia();
	}
	

}