# ClientTest
Rest client test for API


Para que funcionen los jars en Intellij:
  * Click en File
  * Click en Project Structure
  * Click en Modules
  * Click en +
  * Buscar el projecto, seleccionar carpeta lib
  * Click Ok y Apply
  
Esto hace que se puedan usar los JARs dentro de la carpeta lib

---------------------------------------------------------------
Testear tus DTOs
---------------------------------------------------------------
Abrir eclipse e importar el projecto de SD2021, luego seguir estos pasos:
  * Click derecho en el proyecto 
  * Seleccionar Export > JAR
  * Seleccinar la carpeta del proyecto, luego deseleccionar todo (queremos asegurarno de que NADA este seleccionado por defecto que pueda romper el jar)
  * Expandir la carpeta src y buscar los paquetes de los dtos, se veria asi "com.protectionapp.sd2021.dto.user" 
  * Seleccionar todos los paquetes de dto que desees usar
  * Te va a pedir que selecciones el archivo de destino de tu JAR, selecciona la carpeta lib de este proyecto, busca protectionapp-2021.jar
  * Acepta cuando pregunta si queres sobreescribir
  * Fijate en tu proyecto de ClientTest si se actualizo protectionapp-2021.jar
  
Basicamente queremos que crear un JAR con todos los dto que tenemos. 
  
