package com.choucair.reto.steps;

import com.choucair.reto.pageobjects.CreacionBusinessUnitPage;
import com.choucair.reto.utilities.AccionesWeb;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class CreacionBusinessUnitSteps {
	
	CreacionBusinessUnitPage creacionbusinessunitPage;
	AccionesWeb accionesweb;
	
	@Step
	public void seccion_unidad_negocio() {
		accionesweb.bordearElemento(creacionbusinessunitPage.hrefOrganization);
		accionesweb.click(creacionbusinessunitPage.hrefOrganization, false);
		accionesweb.bordearElemento(creacionbusinessunitPage.hrefBusinessUnit);
		accionesweb.click(creacionbusinessunitPage.hrefBusinessUnit, false);
		Serenity.takeScreenshot();

	}
	
	@Step
	public void agregar_unidad_negocio(String strUnidadNegocio) {
		accionesweb.bordearElemento(creacionbusinessunitPage.btnNewBusinessUnit);
		accionesweb.click(creacionbusinessunitPage.btnNewBusinessUnit, false);
		accionesweb.bordearElemento(creacionbusinessunitPage.txtNombreUnidadNegocio);
		accionesweb.clear_sendKeys(creacionbusinessunitPage.txtNombreUnidadNegocio, strUnidadNegocio);
		accionesweb.bordearElemento(creacionbusinessunitPage.btnGuardarUnidad);
		accionesweb.click(creacionbusinessunitPage.btnGuardarUnidad, false);
		Serenity.setSessionVariable("VS_BusinessUnit").to(strUnidadNegocio);
		//String strNombreUnidad=Serenity.sessionVariableCalled("VS_BusinessUnit");
		accionesweb.espera_implicita(2);

	}
	
	@Step
	public void validar_creacion_unidad() {
		
	}

}
