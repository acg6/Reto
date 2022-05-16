package com.choucair.reto.definition;

import com.choucair.reto.steps.CreacionBusinessUnitSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CreacionBusinessUnitDefinition {

	@Steps
	CreacionBusinessUnitSteps creacionbusinessunitsteps;

	@When("^voy a la seccion de unidades de negocio$")
	public void voy_a_la_seccion_de_unidades_de_negocio() {
		creacionbusinessunitsteps.seccion_unidad_negocio();
	}

	@When("^le asigno un nombre \"([^\"]*)\"$")
	public void le_asigno_un_nombre(String dato) {
		creacionbusinessunitsteps.agregar_unidad_negocio(dato);

	}

}
