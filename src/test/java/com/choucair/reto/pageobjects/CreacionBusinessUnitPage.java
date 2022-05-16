package com.choucair.reto.pageobjects;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreacionBusinessUnitPage extends PageObject {

	// opcion Organization del menu
	@FindBy(xpath = "(//A[@href='javascript:;'])[14]")
	public WebElementFacade hrefOrganization;

	// opcion BusinessUnit
	@FindBy(xpath = "//A[@href='/demo/Organization/BusinessUnit']")
	public WebElementFacade hrefBusinessUnit;

	// boton new business unit
	@FindBy(xpath = "(//SPAN[@class='button-inner'])[1]")
	public WebElementFacade btnNewBusinessUnit;

	// txt Nombre unidad de negocio
	@FindBy(name = "Name")
	public WebElementFacade txtNombreUnidadNegocio;

	// boton guardar unidad de negocio
	@FindBy(xpath = "//DIV[@class='tool-button save-and-close-button icon-tool-button']")
	public WebElementFacade btnGuardarUnidad;

	// Validar unidad de negocio
	@FindBy(xpath = "// *[text()='unidad1']")
	public WebElementFacade lblUnidad;
	
	


}
