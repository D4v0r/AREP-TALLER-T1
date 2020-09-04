# Taller de verificación de conocimientos técnicos

## Requerimientos
1. Construir un servicio WEB (puede usar Spark o Sockets) que reciba una lista de números y retorne una estructura JSON con: La lista de números ordenada. Para probar, y para ver como el browser arma el query, puede usar una cadena puede enviarla en un solo campo con valores separados por comas. Ayuda: use un form html con un solo campo.
2. Usted debe implementar el ordenamiento por medio de bubble sort. Piense que este algoritmo se podría user para objetos de otro tipo.
3. Su diseño debe soportar la composición de nuevas operaciones sobre la lista para modificar servicios existentes o componer nuevos servicios. Por ejemplo, piense que en el futuro podemos solicitar que se creen nuevos servicios sobre la lista aumentando el API web, es decir,  debe ser fácilmente extensible.
4. Agregue una operaciónes para calcular la sumatoria  y el promedio de la lista y modifique su programa para que la estructura Json contenga estos valores.
5. El diseño del servidor debe tener en cuenta buenas prácticas de diseño OO.
6. Despliegue el servicio en Heroku.
7. Construya un cliente JAVA para probar el servicio en heroku.
8. El cliente y el servidor debe entregarlos en un proyecto estructurado con Maven.
9. El cliente debe traer "quemada" en el código fuente la url de su aplicación desplegada en Heroku.

## Comenzando

### Prerrequisitos
+ Java 8 SE JDK 
+ Maven
+ Git

### Instalación
Primero debemos clonar este repositorio con el siguiente comando:

`````
git clone https://github.com/D4v0r/AREP-TALLER-T1
`````

Ahora debemos dirigirnos al directorio donde fue clonado el respositorio ejecutar una consola de comandos y compilar el proyecto con el siguiente comando:

````
mvn package
````


### Documentación

Para generar la documentación en su máquina puede ejecutar el siguiente comando:
```
$ mvn javadoc: javadoc
$ mvn javadoc:jar
$ mvn javadoc:aggregate
$ mvn javadoc:aggregate-jar
$ mvn javadoc:test-javadoc
$ mvn javadoc:test-jar
$ mvn javadoc:test-aggregate
$ mvn javadoc:test-aggregate-jar
```

### Despliegue

La aplicación web se encuentra desplegada en Heroku:

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://rocky-ocean-55000.herokuapp.com/)


## Desarrollo

Este proyecto fue desarrollado con:
+ Java 8
+ Spark
+ Maven
+ Heroku

## Autor

>Davor Javier Cortés Cardozo
>
>Estudiante de la Escuela Colombiana de Ingeniería Julio Garavito

## Licencia

Este proyecto está licenciado bajo la GNU General Public License v3.0, para más información ver la [LICENCIA](LICENSE.txt).
