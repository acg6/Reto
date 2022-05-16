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
	ValidacionSteps loginserenitysteps;
	
	@Given("ingreso al portal choucair")
	public void ingresarAPortalChoucair() {
	    loginserenitysteps.open();
	}

	@When("accedo al formulario contactenos")
	public void accederFormularioContactenos() {
		loginserenitysteps.seleccionarOpcionMenu();
	}
	
	@When("rellena formulario")
	public void completarFormulario(DataTable datos) {
		List<List<String>> data = datos.raw();
		for (int i = 0; i < data.size(); i++) {
			loginserenitysteps.completarFormulario(data, i);
			}
	}
	
	@When("valida envio de formulario")
	public void validarEnvioFormulario() {
		loginserenitysteps.validarEnvioFormulario();
	}



}
