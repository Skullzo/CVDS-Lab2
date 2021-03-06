# Laboratorio 2

## Preguntas del laboratorio

### 1. ¿Cuál es su mayor utilidad?

Manejar la creación, los informes y la documentación de un proyecto a partir de una pieza central de información.

Fragmento consultado en [Apache Maven Project](https://maven.apache.org/)

### 2. Fases de Maven

Las fases de Maven son las siguientes:
 1. Validar: Revisar si toda la información necesaria para el constructor esta disponible.
 2. Compilar: Compilar el código base.
 3. Compilar-test: Compilar los tests del código base.
 4. Test: Compilar pruebas de Unidad.
 5. Package: Paquete del código compilado en el formato seleccionado (jar, entre otros).
 6. Test de Integración: Procesa y despliega el paquete si necesita correr pruebas de integración.
 7. Instalación: Instala el paquete en un repositorio local.
 8. Despliegue: Copiar el paquete en un repositorio local.

Fragmento consultado en [BaelDung](https://www.baeldung.com/maven-goals-phases)

### 3. Ciclo de vida de la construcción

Maven se basa en el concepto central de un ciclo de vida de construcción. Lo que esto significa es que el proceso para construir y distribuir un artefacto en particular (proyecto) está claramente definido.
Para la persona que crea un proyecto, esto significa que solo es necesario aprender un pequeño conjunto de comandos para construir cualquier proyecto Maven, y el POM se asegurará de que obtenga los resultados que desea.
Hay tres ciclos de vida de compilación integrados: ```default```, ```clean``` y ```site```.
- **Default:** El ciclo de vida **default** maneja la implementación de su proyecto, gestionando la construcción y despliegue del proyecto.
- **Clean:** El ciclo de vida **clean** maneja la limpieza del proyecto, eliminando todos los archivos generados en el proceso de construcción y despliegue.
- **Site:** El ciclo de vida **site** maneja la creación de la documentación del sitio de su proyecto.

Fragmento consultado en [Apache Maven Project](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)

### 4. ¿Para qué sirven los plugins en Maven?

Es donde se realiza parte de la "acción real", los plugins se utilizan para: crear archivos jar, crear archivos war, compilar código, código de prueba unitaria, crear documentación del proyecto, y así sucesivamente. Casi cualquier acción que pueda pensar en realizar en un proyecto se implementa como un complemento de Maven.

Fragmento consultado en [Apache Maven Project](https://maven.apache.org/guides/introduction/introduction-to-plugins.html#:~:text=In%20other%20words%2C%20plugins%20are,implemented%20as%20a%20Maven%20plugin.)

### 5. ¿Qué es y para qué sirve el repositorio Maven Central?

Son cientos o quizás miles de librerías que podemos utilizar para múltiples propósitos y Maven se encarga de aprovechar los recursos que ya existen de la mejor forma para lograr los objetivos propuestos.
Es un repositorio que contiene **cientos de librerías constantemente actualizadas** por sus creadores y sirve para que todos los usuarios puedan buscar versiones recientes o antiguas de un código dado y agregarlas a su proyecto de manera automática (sin que el usuario tenga que hacer más que definir sus dependencias).

## Crear un Proyecto con Maven

En esta imagen creamos el proyecto Maven de forma interactiva, la cual vamos a usar
```
mvn archetype:generate
```
<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/PrimeraParteInteractiva.png">

En esta imagen creamos el proyecto Maven con parámetros definidos
```
mvn archetype:generate -DgropuId=edu.eci.cvds -DartifactId=Patterns -DarchetypeArtifactId=maven-archetype-quickstart -Dpackage=edu.eci.cvds.patterns -DinteractiveMode=false
```

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/PrimerParte.PNG">

Y aquí podemos observar el árbol

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/Tree.PNG">

## Ajustar algunas configuraciones en el proyecto

Editamos el archivo en el editor de código Visual Studio Code

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/Pom.PNG">

## Compilar y Ejecutar

Se ejecutó el comando 

```
mvn package
```

Y obtuvimos el siguiente resultado

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/CompilarParte1.PNG">
<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/CompilarParte2.PNG">

Buscamos cual es el objetivo del parámetro package

El objetivo del parámetro package es empaquetar el código compilado en su formato distribuible, como un JAR.

Otros parámetros son: **mvn clean** (Borra todos los .class y .jar generados), **mvn compile** (Compila el proyecto) **mvn site** (Genera documentación html del proyecto) 

**-u** (actualiza las librerías desde el Central)


Ejecutamos el código con 
```
mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App"
```

Y tuvimos como resultado

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/PruebaHelloWorld.PNG">

Después de modificar el App.Java obtuvimos

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/PruebaHelloJuan.PNG">

Este es el resultado final del código en App.Java

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/CodigoFinalAppJava.PNG">

Para obtener el resultado de nombre y apellido, se manda el argumento entre comillas simples para evitar que se tome como dos argumentos

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/PruebaHelloNombreApellido.PNG">


## Hacer el esqueleto de la aplicación

Como nos indica el laboratorio creamos los dos paquetes .shapes y .shapes.concrete

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/PaquetesIniciales.PNG">

A su vez creamos la interfaz necesaria

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/Interfaz1.PNG">

Y la enumeración con los parámetros Triangle, Quadrilateral, Pentagon, Hexagon

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/Enumeracion.PNG">

Se crearon las cuatro clases estipuladas en la enumeración

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/ClasesNecesarias.PNG">

Y su clase Main para el manejo del programa

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/MainShape.PNG">

El paso que seguía era utilizar el patrón fabrica y el switch-case para crear Shape Factory, esto con el fin de eliminar un acoplamiento directo de la clase main con otras

En switch-case, se puede tener de dos formas, creando un nuevo objeto dentro de cada caso, o haciendo lo que se muestra en la imagen donde es necesario un break, para que el código no tome siempre el valor de Hexagon

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/ShapeFactory.PNG">

El siguiente y último paso del laboratorio era ejecutar la clase ShapeMain usando el plugin exec de Maven para obtener resultados

### Primera ejecución

La primera ejecución es sin parámetros, al realizar la ejecución observamos que el main pedía argumentos necesariamente para poder funcionar

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/ShapeNoParam.PNG">

### Segunda ejecución

La segunda ejecución es con la cadena "qwerty", al realizar la ejecución observamos que el parámetro no es un parámetro valido dentro de la enumeración, el cual los rechaza

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/ShapeQwerty.PNG">

### Tercera ejecución

La tercera ejecución es con la cadena "pentagon", al realizar la ejecución observamos que el parámetro no es un parámetro valido, aun existiendo un parámetro Pentagon dentro de las enumeraciones que tenemos; esto es causado por que Java es sensible a las mayúsculas y minúsculas dentro de sus parámetros

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/Shapepentagon.PNG">

### Cuarta ejecución

La última ejecución es la única que sirve dentro de las cuatro, dado que cumplen todos los requisitos para el uso.

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/ShapeHexagon.PNG">
