package com.choucair.reto.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProgramarReunionPage extends PageObject {

	// opcion Meeting
	@FindBy(xpath = "(//A[@href='javascript:;'])[13]")
	public WebElementFacade btnMeetingMenu;

	// opcion Meeting
	@FindBy(xpath = "//A[@href='/demo/Meeting/Meeting']")
	public WebElementFacade btnMeetingSubMenu;

	// Boton nueva reunion
	@FindBy(xpath = "//div[@class='button-outer']")
	public WebElementFacade btnNewMeeting;

	// Nombre de la reunion
	@FindBy(name = "MeetingName")
	public WebElementFacade txtMeetingName;

	// select tipo reunion
	@FindBy(id = "select2-drop-mask")
	public WebElementFacade slTypeMeeting;

	// Nuevo nombre del tipo de renion
	@FindBy(xpath = "(//B)[8]")
	public WebElementFacade BtnNombreTipoM;

	// txt nombre del tipo de reunion
	@FindBy(xpath = "//INPUT[@id='StartSharp_Meeting_MeetingTypeDialog41_Name']")
	public WebElementFacade txtNombreNewMeetingType;

	// boton guardar nuevo nombre tipo de meeting
	@FindBy(xpath = "(//SPAN[@class='button-inner'])[16]")
	public WebElementFacade btnNewNameMeetingType;

	// Fecha inicial
	@FindBy(xpath = "//INPUT[@id='StartSharp_Meeting_MeetingDialog14_MeetingName']")
	public WebElementFacade dtMeetingStart;

	// Fecha final
	@FindBy(id = "StartSharp_Meeting_MeetingDialog37_EndDate")
	public WebElementFacade dtMeetingEnd;

	@FindBy(xpath = "(//a[@href='javascript:void(0)'])[8]")
	public WebElementFacade slUnit;

	@FindBy(xpath = "//IFRAME[@id='rel_xpath_popup']")
	public WebElementFacade slUnitSearch;

	// boton guardar reunion
	@FindBy(xpath = "//DIV[@class='tool-button save-and-close-button icon-tool-button']")
	public WebElementFacade btnSaveMeeting;

	// boton guardar reunion
	@FindBy(xpath = "(//ABBR[@class='select2-search-choice-close'])[6]")
	public WebElementFacade btnCloseNameType;

	// boton guardar reunion
	@FindBy(xpath = "//INPUT[@id='StartSharp_Meeting_MeetingDialog14_MeetingNumber']")
	public WebElementFacade txtMeetingNumber;

	// boton guardar reunion
	@FindBy(xpath = "//div[@class='ui-widget-content slick-row even']//div//following::div//a[text()='Reunion']")
	public WebElementFacade validarReunion;
	
	public String strXptOpcionUnidad="(//div[@class='select2-result-label' and contains(text(),'REEMPLAZAR')])[1]";
	
	// boton guardar reunion
	@FindBy(xpath = "//SPAN[@class='slick-column-name'][text()='ID']")
	public WebElementFacade lblOrdenarLista;
		

}
