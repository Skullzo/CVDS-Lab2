# CVDSLab02
Laboratorio 2 de la materia CVDS

## Preguntas laboratorio

### 1. ¿Cuál es su mayor utilidad?

Manejar la creacion, los informes y la documentacion de un proyecto a partir de una pieza central de informacion
Fragmento consultado en [Apache Maven Project](https://maven.apache.org/)

### 2. Fases de Maven

Las fases de Maven son las siguientes:
 1. Validar: Revisar si toda la información necesaria para el constructor esta disponible
 2. Compilar: Compilar el codigo base
 3. Compilar-test: Compilar los test del codigo base
 4. Test: Compilar pruebas de Unidad
 5. Package: Paquete del codigo compilado en el formato seleccionado (jar, entre otros)
 6. Test de Integración: Procesa y despliega el paquetesi necesita correr pruebas de integracion
 7. Instalación: Instala el paquete en un repositorio local
 8. Despliegue: Copiar el paquete en un repositorio local
s
Fragmento consultado en [BaelDung](https://www.baeldung.com/maven-goals-phases)

### 3. Ciclo de vida de la construcción
Maven se basa en el concepto central de un ciclo de vida de construcción. Lo que esto significa es que el proceso para construir y distribuir un artefacto en particular (proyecto) está claramente definido.
Para la persona que crea un proyecto, esto significa que solo es necesario aprender un pequeño conjunto de comandos para construir cualquier proyecto Maven, y el POM se asegurará de que obtenga los resultados que desea.
Hay tres ciclos de vida de compilación integrados: ```default```, ```clean``` y ```site```.
- **Default:** El ciclo de vida **default** maneja la implementación de su proyecto, gestionando la construcción y despliegue del proyecto.
- **Clean:** El ciclo de vida **clean** maneja la limpieza del proyecto, eliminando todos los archivos generados en el proceso de construcción y despliegue.
- **Site:** El ciclo de vida **site** maneja la creación de la documentación del sitio de su proyecto.

### 4. Para que sirven los plugins en Maven

Es donde se realiza parte de la "acción real", los plugins se utilizan para: crear archivos jar, crear archivos war, compilar código, código de prueba unitaria, crear documentación del proyecto, y así sucesivamente. Casi cualquier acción que pueda pensar en realizar en un proyecto se implementa como un complemento de Maven.

Fragmento consultado en [Apache Maven Project](https://maven.apache.org/guides/introduction/introduction-to-plugins.html#:~:text=In%20other%20words%2C%20plugins%20are,implemented%20as%20a%20Maven%20plugin.)

### 5. Qué es y para qué sirve el repositorio Maven Central


Son cientos o quizás miles de librerías que podemos utilizar para múltiples propósitos y Maven se encarga de aprovechar los recursos que ya existen de la mejor forma para lograr los objetivos propuestos.
Es un repositorio que contiene **cientos de librerías constantemente actualizadas** por sus creadores y sirve para que todos los usuarios  puedan buscar versiones recientes o antiguas de un códido dado y agregarlas a su proyecto de manera autómatica (sin que el usuario tenga que hacer más que definir sus dependencias).

## Crear un Proyecto con Maven

En esta imagen creamos el proyecto Maven de forma interactiva, la cual vamos a usar
```
mvn archetype:generate
```
<img  src="https://github.com/JuanMunozD/CVDS1/blob/master/JuanMunoz/img/7agosto.png">

En esta imagen creamos el proyecto Maven con parametros definidos
```
mvn archetype:generate -DgropuId=edu.eci.cvds -DartifactId=Patterns -DarchetypeArtifactId=maven-archetype-quickstart -Dpackage=edu.eci.cvds.patterns -DinteractiveMode=false
```

<img  src="https://github.com/JuanMunozD/CVDS1/blob/master/JuanMunoz/img/7agosto.png">

Y aqui podemos observar el arbol

<img  src="https://github.com/JuanMunozD/CVDS1/blob/master/JuanMunoz/img/7agosto.png">

## Ajustar algunas configuraciones en el proyecto

Editamos el archivo en el editor de codigo Visual Studio Code

<img  src="https://github.com/JuanMunozD/CVDS1/blob/master/JuanMunoz/img/7agosto.png">

## Compilar y Ejecutar

Se ejecuto el comando 

```
mvn package
```

Y obtuvimos el siguiente resultado

<img  src="https://github.com/JuanMunozD/CVDS1/blob/master/JuanMunoz/img/7agosto.png">
<img  src="https://github.com/JuanMunozD/CVDS1/blob/master/JuanMunoz/img/7agosto.png">

