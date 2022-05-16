package com.choucair.reto.definition;

import java.util.List;

import com.choucair.reto.steps.ProgramarReunionSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ProgramarReunionDefinition {

	@Steps
	ProgramarReunionSteps programarreunionsteps;

	@Then("^voy a seccion de reuniones$")
	public void voy_a_seccion_de_reuniones() {
		programarreunionsteps.seccion_reunion();
	}

	@Then("^Diligencio el formulario para programar una reunion con la unidad de negocio creada$")
	public void diligencio_el_formulario_para_programar_una_reunion_con_la_unidad_de_negocio_creada(DataTable datos) {
		List<List<String>> data = datos.raw();
		programarreunionsteps.unit(null);

		for (int i = 1; i < data.size(); i++) {
           programarreunionsteps.diligenciar_formulario(data, i);
		}
	}

	@Then("^valido que la reunion haya sido programada\\.$")
	public void valido_que_la_reunion_haya_sido_programada() {
		programarreunionsteps.validar_reunion();
	}

}
