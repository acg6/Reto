Feature: Validaciones.

@EnvioSolicitudFormulario
  Scenario: ROBOT Validacion de envio de solicitud por medio del formulario contactecnos
   Given ingreso al portal choucair
   When  accedo al formulario contactenos
   And   rellena formulario
			    |PruebaTest |12345678|test@test.com|Medellin|Reto|Esto es una prueba|
	 Then valida envio de formulario		    
			    
      
   
   

