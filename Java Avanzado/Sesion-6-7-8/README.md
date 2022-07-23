## Patrones creacionales

Los Patrones creacionales son aquellos que nos permiten crean objetos. Estos patrones encapsulan el procedimiento de creación de un objecto y suelen trabajar mediante interfaces:

- **Factory Method**  Proporciona una interfaz que permite crear objectos en una superclase, pero delega su implementación y alteración de los objectos en las subclases.
- **Abstract Factory**  Proporciona una interfaz que permite generar grupos de objectos relacionados, pero sin especificar sus clases concretas ni su implementación.
- **Builder**  Permite construir objetos complejos paso a paso, separando la creación de dicho objeto de su estructura. De esta forma podemos utilizar el mismo proceso de construcción para obtener diferentes tipos y representaciones de un objecto.
- **Singleton**  Este patrón asegura que una clase solo tiene una instancia posible, a la cual se puede acceder de forma global.
- **Prototype**  Permite copiar o clonar un objeto sin necesidad de que nuestro código dependa de sus clases.



## Patrones estructurales

Los patrones estructurales nos especifican como los objetos y las clases se relacionan entre ellos para formar estrucutras más complejas, de forma que estas sean flexibles y eficientes. Se basan en la herencia para definir interfaces y obtener nuevas funcionalidades:

- **Adapter**  Se trata de un patrón estrucutural que permite colaborar entre sí a dos objetos con interfaces incompatibles, mediante un intermediaroi con el que se comunican e interactúan.
- **Bridge**  En este patrón se desacopla una abstracción de su implementación, de forma que puedan evolucionar independientemente.
- **Composite**  Permite crear objetos con estructura en forma de árbol, y luego trabajar con dichas estructuras como si fueran objetos individuales. En este caso todos los elementos de la estructura utilizan la misma interfaz.
- **Decorator**  Este patrón permite añadir nuevas funcionalidades a un objeto (introuciendo este objeto en un ‘envoltorio’ que contiene las nuevas funcionaliades) sin modificar el comportamiento de objetos del mismo tipo.
- **Facade**  Proporciona una interza simplificada a una estructura compleja (como una librería o un conjunto cmplejo de clases).
- **Flyweight**  Se trata de un patrón que permite ahorrar memoria RAM, ya que hace que muchos objetos compartan propiedades comunes en un mismo objeto, en vez de mantener estas propiedades en todos y cada uno de los objetos.
- **Proxy**  Es un objeto que actúa como una versión simplificzda del original. Un proxy controla en acceso al objeto original, lo que nos permite realizar algunas tareas antes o después deacceder a dicho objeto. Este patrón suele utilizarse en la conexiones a internet, el acceso a los ficheros del dispositivo, etc. Es decir procesos costosos, y permite reducir el coste y la complejidad.



## Patrones de comportamiento

Son los más numerosos, se centran en la comunicación entre objetos y se encargan de gestionar algoritmos, relaciones y responsabilidades entre dichos objetos:

- **Chain of Responsibility**  Permite pasar peticiones a través de una cadena de receptores. Cada uno de estos receptores puede procesar la petición o pasársela al siguiente. De esta forma se desacopla al emisor del receptor final de la petición original.
- **Command**  Transforma una petición en un objeto que encapsula la acción y la información que necesita para ejecutarla.
- **Interpreter**  Se trata de un patrón que, dado un lenguaje, define una representación para su gramática y el mecanismo para evaluarla.- Iterator. Permite circular a través de los elementos de una colección sin exponer su representación (listas, pilas, árbol…).
- **Mediator**  Restringe las comunicaciones directas entre objetos y fuerza la comunicación a través de un único objeto, que actúa de mediador.
- **Memento. Permite guardar y restaurar a un estado previo un objeto sin necesdiad de revelar los detalles de su implementación.
- **Observer**  Permite establecer un mecanismo de suscripción para notificar a diferentes objetos de los eventos que se producen en el objeto que observan.
- **State**  Permite a un objeto cambiar su comportamiento cuando cambia su estado interno. Da la impresión de que hubiera cambiado su clase.
- **Strategy**  Permite definir que, de una familia de algoritmos, podamos seleccionar uno de ellos en tiempo de ejecución para realizar cierta acción.
- **Template method**  Este patrón define el esqueleto de una algoritmo en una superclase, pero permite a las subclases redefinir algunois métodos sin cambiar su estrucutra.
- **Visitor**  Permite separar los algoritmos de los objetos con los que operan.