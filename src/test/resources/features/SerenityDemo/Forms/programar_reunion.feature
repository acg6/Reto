Feature: El sistema debe permitir programar una nueva reunion con una unidad de negocio creada anteriormente
@NewMeeting
  Scenario: programar una reunion
   Given accedo al formulario del login
   When  diligencio el formluario del login con usuario "admin" y pass "serenity"
   And   voy a la seccion de unidades de negocio
   And   le asigno un nombre "unidad3"
   Then  voy a seccion de reuniones
   And   Diligencio el formulario para programar una reunion con la unidad de negocio creada
        |Meeting Name |Meeting Number|
        |Reunion      | 123434545    |
     #     |Meeting Name |Meeting Number|unit   |
     #    |Reunion      | 123434545    |unidad3|
   And   valido que la reunion haya sido programada.  
      
   
   

