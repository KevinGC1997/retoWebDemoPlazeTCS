RetoDemoPlaze
Descripción
Este proyecto de automatización utiliza Serenity BDD con el patrón Screenplay para realizar pruebas a la interfaz web de la pagina demoplaze.com, contemplando escenario E2E de todo el flujo de compras, hasta finalizar el mismo.

Pre-requisitos
Asegúrate de tener instalados los siguientes componentes antes de ejecutar el proyecto:

Java 8 u 11: Puedes descargar Java en https://www.java.com/es/download/.


IntelliJ

Gradle: En la versión gradle-7.4-bin.zip

Paquetes utilizados en el patrón Screenplay
Este proyecto utiliza el patrón Screenplay para mejorar la legibilidad y la mantenibilidad de las pruebas. Los principales paquetes utilizados son:


questions: Contiene clases que permiten generar preguntas necesarias para las validaciones obteniendo valores necesarios directamente desde la interfaz web. con el proposito de que la misma prueba validar que este correcto el flujo.

tasks: Contiene clases que definen tareas completas, que tienen como objetivo ejecutar la secuencia de pasos necesarios para todo el flujo completo

userInterface: contiene las constantes de los identificadores de los elementos de la interfaz con los que vamos a interactuar directamente en la automatizacion.

Interactions: contiene las clases de las tareas segmentadas o necesarias que tienen como proposito dividir las tareas del paquete task.

utils: Contiene clases para generar utilidades en las interacciones, con el propósito de ejecutar funciones específicas.

runners: Contiene las clases que permiten ejecutar los features.

stepsdefinitions: Contiene las clases que implementan los pasos definidos en los features.

features: Contiene las historias de usuario en lenguaje Gherkin.

Instalación
Para ejecutar este proyecto en tu máquina local, debes: Clona este repositorio en tu máquina local utilizando Git:

git clone https://github.com/KevinGC1997/retoWebDemoPlazeTCS.git

Ejecución por consola
Para ejecutar las pruebas localmente por medio de la terminal, con este comando:

gradle clean test aggregate