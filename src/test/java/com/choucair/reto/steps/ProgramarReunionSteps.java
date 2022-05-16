package com.choucair.reto.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindAll;

import com.choucair.reto.pageobjects.ProgramarReunionPage;
import com.choucair.reto.utilities.AccionesWeb;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;

public class ProgramarReunionSteps {

	ProgramarReunionPage programarreunionpage;
	AccionesWeb accionesweb;

	@Step
	public void seccion_reunion() {
		accionesweb.bordearElemento(programarreunionpage.btnMeetingMenu);
		accionesweb.click(programarreunionpage.btnMeetingMenu, false);
		accionesweb.bordearElemento(programarreunionpage.btnMeetingSubMenu);
		accionesweb.click(programarreunionpage.btnMeetingSubMenu, false);
		accionesweb.bordearElemento(programarreunionpage.btnNewMeeting);
		accionesweb.click(programarreunionpage.btnNewMeeting, false);
		Serenity.takeScreenshot();
	}

	@Step
	public void diligenciar_formulario(List<List<String>> data, int id) {
		accionesweb.bordearElemento(programarreunionpage.txtMeetingName);
		nombre_meeting(data.get(id).get(0).trim());
		accionesweb.bordearElemento(programarreunionpage.txtMeetingNumber);
		number_meeting(data.get(id).get(1).trim());
		accionesweb.bordearElemento(programarreunionpage.btnSaveMeeting);
		accionesweb.click(programarreunionpage.btnSaveMeeting, false);
		accionesweb.espera_implicita(4);
	}

	@Step
	public void validar_reunion() {
		accionesweb.bordearElemento(programarreunionpage.lblOrdenarLista);
		accionesweb.ordenar_lista(programarreunionpage.lblOrdenarLista);
		Serenity.takeScreenshot();
		By nombre = By.xpath("(//div[@class='slick-cell l1 r1']/a)[1]");
		By numero= By.xpath("(//div[@class='slick-cell l2 r2'])[1]");
		accionesweb.validar_reunion("Reunion",nombre);
		accionesweb.validar_reunion("123434545", numero);
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Step
	public void datos_formulario(String dato) {
		accionesweb.clear_sendKeys(programarreunionpage.txtMeetingName, dato);
		accionesweb.clear_sendKeys(programarreunionpage.txtMeetingNumber, dato);
		accionesweb.click(programarreunionpage.btnCloseNameType, false);
		accionesweb.click(programarreunionpage.BtnNombreTipoM, false);
		accionesweb.clear_sendKeys(programarreunionpage.txtNombreNewMeetingType, dato);
		accionesweb.click(programarreunionpage.btnNewNameMeetingType, false);
		accionesweb.click(programarreunionpage.slTypeMeeting, false);
		programarreunionpage.slTypeMeeting.selectByVisibleText(dato);
		accionesweb.clear_sendKeys(programarreunionpage.dtMeetingStart, dato);
		accionesweb.clear_sendKeys(programarreunionpage.dtMeetingEnd, dato);
		accionesweb.clear_sendKeys(programarreunionpage.slUnit, dato);
		programarreunionpage.slUnit.selectByVisibleText(dato);
	}

	
	/*
	 * @Step public void diligenciar_formulario(List<List<String>> data, int id) {
	 * for(int i=0;i<=3;i++) { datos_formulario(data.get(id).get(i).trim()); }
	 * accionesweb.click(programarreunionpage.btnSaveMeeting, false);
	 * accionesweb.espera_implicita(2); }
	 */
	@Step
	public void nombre_meeting(String dato) {
		accionesweb.clear_sendKeys(programarreunionpage.txtMeetingName, dato);

	}

	@Step
	public void number_meeting(String dato) {
		accionesweb.clear_sendKeys(programarreunionpage.txtMeetingNumber, dato);

	}

	@Step
	public void type_meeting(String dato) {
		accionesweb.click(programarreunionpage.slTypeMeeting, false);
		programarreunionpage.slTypeMeeting.selectByVisibleText(dato);
	}

	@Step
	public void date_start(String dato) {
		accionesweb.clear_sendKeys(programarreunionpage.dtMeetingStart, dato);

	}

	@Step
	public void date_End(String dato) {
		accionesweb.clear_sendKeys(programarreunionpage.dtMeetingEnd, dato);

	}

	@Step
	public void unit(String strUnidad) {
		//accionesweb.click(programarreunionpage.slUnit, false);
		programarreunionpage.slUnit.click();
		String strNombreUnidad = Serenity.sessionVariableCalled("VS_BusinessUnit");
		accionesweb.click(programarreunionpage.strXptOpcionUnidad.replace("REEMPLAZAR",strNombreUnidad), false);
		
	  //	accionesweb.clear_sendKeys(programarreunionpage.slUnit, strUnidad);
		//programarreunionpage.slUnit.selectByVisibleText(strUnidad);
		//accionesweb.clear_sendKeys(programarreunionpage.slUnitSearch, strNombreUnidad);
		//accionesweb.click(programarreunionpage.slUnit, false);
		// programarreunionpage.slUnit.selectByVisibleText(strUnidad);
	}

}
