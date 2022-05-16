Feature: Validaciones.

@EnvioSolicitudFormulario
  Scenario: ROBOT Validacion de envio de solicitud por medio del formulario contactecnos
   Given ingreso al portal choucair
   When  acceder al formulario contactenos
   And   rellena formulario
			    |PruebaTest |12345678|test@test.com|Medellin|Reto|Esto es una prueba|
	 Then valida envio de formulario		
	 
@validacionCamposFormulario
   Scenario: ROBOT validar campos en el formulario de contactenos 
   Given ingreso al portal choucair
   When acceder al formulario contactenos
   And   rellena formulario
			    |PruebaTest |12345678||Medellin|Reto|Esto es una prueba|
   Then valida envio de formulario incorrecto			     	  
			    
@validacionMenus
	Scenario: ROBOT validar que cada unas de las opciones del menu se puedan acceder
		 Given ingreso al portal choucair
		 When acceder a la pestaña servicios
		 And acceder a la pestaña industrias
		 And acceder a la pestaña formacion
		 And acceder a la pestaña comunidad
		 And acceder a la pestaña empleos
		 When acceder a la pestaña contactenos
		       
		 
				    
			       
			    
      
   
   

