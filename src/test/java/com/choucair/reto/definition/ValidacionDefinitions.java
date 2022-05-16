package com.choucair.reto.definition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.choucair.reto.pageobjects.ValidacionPage;
import com.choucair.reto.steps.ValidacionSteps;
import com.choucair.reto.utilities.AccionesWeb;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ValidacionDefinitions {
	public static WebDriver driver;
	AccionesWeb accionesWeb;
	@Steps
	ValidacionSteps validacionSteps;
	
	@Given("ingreso al portal choucair")
	public void ingresarAPortalChoucair() {
		validacionSteps.open();
	}

	@When("acceder al formulario contactenos")
	public void accederFormularioContactenos() {
		validacionSteps.seleccionarOpcionMenu();
	}
	
	@When("acceder a la pestana contactenos")
	public void accederPestanaContacto() {
		validacionSteps.accederPestanaContacto();
	}
	
	@When("acceder a la pestana servicios")
	public void accederPestanaServicios() {
		validacionSteps.accederPestanaServicios();
	}
	
	@When("acceder a la pestana industrias")
	public void accederPestanaIndustrias() {
		validacionSteps.accederPestanaIndustrias();
	}
	
	@When("acceder a la pestana formacion")
	public void accederPestañaFormacion() {
		validacionSteps.accederPestanaFormacion();
	}
	
	@When("acceder a la pestana comunidad")
	public void accederFormularioComunidad() {
		validacionSteps.accederFormularioComunidad();
	}
	
	@When("acceder a la pestana empleos")
	public void accederFormularioNosotros() {
		validacionSteps.accederFormularioEmpleos();
	}
	
	@When("rellena formulario")
	public void completarFormulario(DataTable datos) {
		List<List<String>> data = datos.raw();
		for (int i = 0; i < data.size(); i++) {
			validacionSteps.completarFormularioValidar(data, i);
			}
	}
	
	@When("valida envio de formulario")
	public void validarEnvioFormulario() {
		validacionSteps.validarEnvioFormulario();
	}
	
	@When("valida envio de formulario incorrecto")
	public void validarEnvioFormularioIncorrecto() {
		validacionSteps.validarEnvioFormularioIncorrecto();
	}



}
