# Parcial 1 Arep  :rocket:

En este repositorio se encontrará una solución al Parcial 1 de arep, se implementó
una "calculadora" en heroku con un cliente java para pruebas, esta calculadora
tiene las siguientes funcionalidades:
  
 - Ordenar un conjunto de numeros con el algoritmo bubble sort.
 - Calcular el promedio de un conjunto de numeros
 - Calcular la sumatoria de un conjunto de numeros

## Getting Started

Aplicación

![](https://media.discordapp.net/attachments/352624122301513730/751500769210925096/unknown.png?width=532&height=475)

Bubble Sort

![](https://media.discordapp.net/attachments/352624122301513730/751501821792747601/unknown.png?width=815&height=475)

La aplicación esta desplegada en heroku en el siguiente link
[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://parcial-alejandrobohorquez.herokuapp.com/)

Las siguientes instrucciones le darán una guia de como desargar
y correr el repositorio localmente

### Pre requisitos

- Java SE Development Kit 8
- Java SE Runtime Environment 8
- Maven para compilar el proyecto
- Heroku cli si desea correr un servidor localmente.
- Git para clonar el repositorio



### Installing

Clonaremos el repositorio con el siguiente comando

```
git clone https://github.com/AlejandroBohal/Parcial1-Arep
cd /Parcial1-Arep
```

Compilaremos el proyecto con el siguiente comando
```
mvn package
```
Para correr el cliente Java ejecutaremos el siguiente comando:
```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.clients.JavaClient"
```

Para correr el servidor ejecutaremos el siguiente comando:
```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.sparkframework.SparkAServer"
```

Para correr un servidor local deberá modificar la siguiente parte 
del código en el archivo que se encuentra en el directorio
/src/main/resources/js/action.js descomentar linea 5 y comentar linea 6


![](https://media.discordapp.net/attachments/352624122301513730/751503820751634542/unknown.png?width=1026&height=403)
```
 heroku local web
```

Puede acceder al servidor desde:

http://localhost:36000


## Corriendo las prueabs

Las pruebas se automatizaron con Junit y se corren con 
el siguiente comando:

```
mvn test
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* Build to Heroku
    [![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://parcial-alejandrobohorquez.herokuapp.com/)


## Documentación

Website de la documentacion
https://alejandrobohal.github.io/Parcial1-Arep/

Generar javadoc con:

```
mvn javadoc:javadoc
```

## Author

* **Sergio Alejandro Bohorquez Alzate** 
Estudiante eci

## Licensia

This project is licensed under the GNU v3.0 - see the [LICENSE.md](LICENSE.md) file for details
