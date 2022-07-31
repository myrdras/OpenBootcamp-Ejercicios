# Arquitectura limpia

La arquitectura limpia tiene como objetivo la separación de dependencias. Está separación se 
logra dividiendo el software en capas. Todas tienen al menos una capa para la lógica del 
negocio y otra para la interfaz gráfica. Las 4 capas principales son:

1. ### Entidades:  
   Las entidades encapsulan la lógica de negocio de todo el proyecto. Una entidad puede ser
un objeto con métodos o puede ser un conjunto de estructuras y funciones de datos.  
   Son los que tienen menos probabilidades de cambiar cuando algo externo cambia. 
<ins>Ej:</ins> no esperaría que estos objetos se vean afectados por un cambio en la 
navegación de la página o la seguridad.
2. ### Casos de uso:  
   El software de esta capa contiene reglas comerciales específicas de la aplicación. 
Encapsula e implementa todos los casos de uso del sistema. 
<ins>Ej:</ins> los métodos concretos de cada clase
3. ### Controladores o Adaptadores de Interfaz:  
   El software en esta capa es un conjunto de adaptadores que convierten los datos obtenidos
en las capas exteriores al formato más conveniente para los casos de uso y entidades. Además, 
se adaptarán al marco de persistencia que se esté utilizando. Ningún código interno de este 
círculo debería saber nada sobre la base de datos.
4. ### Todo lo demás (Frameworks y drivers):  
   La capa más externa generalmente se compone de marcos y herramientas como la base de 
datos, el marco web, etc. Generalmente, no escribe mucho código en esta capa aparte del 
código adhesivo que se comunica con el siguiente círculo hacia adentro.\
   &nbsp;

La arquitectura limpia implementa los principios SOLID.

- **S = Single Responsibility Principle (SRP)**  
   Una clase, componente o servicio es responsable de una sola cosa.
- **O = Open/Closed Principle (OCP)**  
   Las entidades tienen que estar abiertas a la hora de responder, pero cerradas a la hora 
de modificarlas.
- **L = Liskov Substitution Principle (LSP)**  
   Una clase se tiene que poder sustituir por la clase padre. Y si no se puede realizar esto,
el programa falla. Y, si falla, es que se está violando el principio.
- **I = Interface Segregation Principle (ISP)**  
   Una clase no debe depender de una interfaz que no va a utilizar. La clase solo debe 
implementar la interfaz o interfaces que sean coherentes con su clase.  
  <ins>Ej:</ins> Si tengo la interfaz pájaro con el método volar y comer. No la vamos a 
implementar en una clase perro, ya que los perros no vuelan.
- **D = Dependency Inversion Principle (DIP)**  
   Las dependencias se tienen que abstraer. Un módulo de alto nivel no debe depender de un 
módulo de bajo nivel. Esto quiere decir que, vamos a intentar implementar métodos abstractos 
de forma genérica en lugar de acceder a un método concreto de la clase hija.  
  <ins>Ej:</ins> Si tengo una base de datos MySQL y tengo que cambiarla a PostgreSQL tendría
que escribir una nueva clase para mi nueva base de datos y cambiar la instanciación de mi
objeto. Porque todos los métodos y las propiedades deberían seguir inalteradas.

La arquitectura limpia debe ser implementada siempre en la medida de lo posible, intentando 
cumplir todos los principios SOLID.

Con ello, conseguiremos un código mínimamente acoplado, que será mucho más fácil de leer, 
reparar, mantener y mejorar, aunque no sea por el mismo programador, o incluso siéndolo, 
facilitará sustancialmente el trabajo del mismo.