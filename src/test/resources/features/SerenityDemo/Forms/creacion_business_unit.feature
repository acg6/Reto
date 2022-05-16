Feature: El sistema debe permitir autenticacion de un usuario para que este pueda crear unidadades de negocio
         y demas funciones del sitio.

@BusinessUnit
  Scenario: creacion de una unidad de negocio
   Given accedo al formulario del login
   When  diligencio el formluario del login con usuario "admin" y pass "serenity"
   And   voy a la seccion de unidades de negocio
   And   le asigno un nombre "unidad3"
      
   
   

