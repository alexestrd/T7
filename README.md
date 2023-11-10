Segun los descrito en el documento word tenemos tres pasos

1.-Hacer las modificaciones necesarias en el sql de la consulta inicial para que el resultado sea la estructura mostrada en el archivo json_resultado.json 
Esa parte la tenemos en la carpeta de prueba tecnica en donde hay dos documentos .sql extras 
en donde en uno se relizo este paso de una forma y en la segunda es otra opcion

2.-Crear una función en el lenguaje de su preferencia que procese el json de entrada (json_entrada.json) y transforme su estructura a la misma que se tiene en el json resultado (json_resultado.json).
En este paso lo relize con Java SpringBoot en donde por medio de pruebas de postman relize las pruebas del llenado y 
de generar un jason igual al de Json_resultado y en esta parte tambien genere una conexion a una BD de MySQL la cual pueden importar desde un rachivo que esta dentro de la carpeta 
Prueba tecnica con el nombre de T7.sql

3.-Posteriormente con esa misma data del json_resultado.json crear una función que genere una tabla con la siguiente estructura
En esta parte lo relize con Angular para la generacion de la tabla y tambien use Bootstrap en donde importe directamente el json_resultado
pero de igual manera pude haber generado una connexion con la api ya que no es un problema mayor
y si le dan el comando ng s pueden levantar la aplicacion para que la puedan ver.
