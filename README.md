## AREP-2021 Service Facade and Client
Este proyecto es la parte de la fachada y del cliente del proyecto de la calculadora de trigonometria


### Prerequisitos

- Maven: Esta es la herramienta encargada de la creacion del proyecto y ayuda a manejar la despedencias del mismo
- Git: Software de control de versiones.
- JDK: Es la herramienta que sirve para desarrollar en java, versiones de este programa desde la 8 en adelante.

### Instalacion

 Para poder instalar el programa debe clonar este repositorio en su computador, esto lo puede hacer con el sigueinte comando.
 >https://github.com/DavidAndresHerrera/FacadeAndClient

 antes de clonar el proyecto en su maquina local verifique la ubicacion donde quiere dejar el proyecto.
 
### Ejecucion y empaquetado

Para empaquetar y ejecutar el programa usando maven ingresa el siguiente comando dentro de la carpeta Media_DsvEstandar-app
> mvn package

### Ejecucion de pruebas

Despues de empaquetado el programa y saber que esta corriendo de manera correcta ingresa el sigueitne comando
> mvn test

### Funcionamieto 

Desde la clase ServiceFacade se llama a la clase ServiceFacadeOperation para que esta haga una consulta a la aplicacion de TRigCalculadora

para el funcionamiento utilice este link    https://servicefacade.herokuapp.com/Operaciones?operacion=sin&dato=2, tenga en cuenta que si quiere cambiar de operacion solo es cambiar el dato de operacion por tan o cos, y si quiere cambiar el valor solo es cambiar el que esta definido por otro
para el funcionamiento del cliente toca ejecutar la siguiente linea java -cp target/ServiceFacade-1.0-SNAPSHOT.jar edu.escuelaing.arep.Cliente

>  [![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://servicefacade.herokuapp.com/Operaciones?operacion=sin&dato=2)

### Licencia
GNU General Public License v3.0 

### Autor 

#### David Andres Herrera Moya 
