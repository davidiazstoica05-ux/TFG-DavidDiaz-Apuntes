

-El color claro queda más profesional. crear un dashboard puede ser muy buena idea

-En repartidores se debería de poder filtrar por zona para ver que no haya sobrecarga

-Otra forma que me gusta mucho es el dashboard a la izquierda tal que así:

![[vista4dashboardLateral.png]]

El login debería de tener una pestaña donde puedas intercalar entre operador o admin. 
concepto: 



![[LoginConceptual.png]]
 *Es solo un concepto debido a que depende de lo complicado que sea incorporarlo de esta forma*

Como solo necesito gestionar los repartidores y los envíos. He pensado en crear un maximo de tres pestañas. 
En una se encontrarian los repartidores, en otra los envios y quien los está llevando 
una menu home con dashboard donde salgan todos los repartidores y donde se pueda filtrar por nombre, por ruta, por peso. 

Dentro de cada menú podrían haber submenus para otras cosas, por ejemplo, en envios podría haber un submenu que sea estado de los paquetes

La zona de admin estaría quizas bien que tuviese una pestaña de más donde tenga los ajustes necesarios, Por ejemplo: 
* Poder cambiar el precio del peso del paquete
* Poder asignarle rutas a diferentes riders, pero que si dos riders tienen la misma ruta no puedan hacerlo *Aqui tengo que darle una vuelta a como haría esto de que dos riders no tengan la misma ruta ¿En zona o en ruta?. En el ejercicio dice zona*

* Dos funcionalidades mas a adición. 



## Diferentes Menús

Habrá tres menús: 

1. Home: Aquí se encontrara un breve información de todo. Sobre los repartidores, los pedidos y el tiempo estimado y que se pueda filtrar por nombre, o por peso
2. Repartidores: En la ultima vista se puede ver mas o menos la idea, pero creo que sería mejor idea poner solo el tiempo restante en lugar de una barra de tiempo (Depende de la velocidad que llevemos en el trabajo) Bootstrap tiene una forma de poner la barra de progresión . 
   Tendrá dos submenú. Uno en el que muestre los activos y otro en el que muestre los no activos.
   Quizás es buena idea que cuando un repartidor termine su recorrido el Dashboard se ponga en gris y al lado salgan una x en rojo (para eliminar) y un símbolo para ver el recorrido y el tiempo en el que lo ha hecho. Una vez descartado el rider se pasara automáticamente a no activo.  Así podría cumplir el requisito de que no se puede tener varios a la vez (¿Más de dos?). 
3. Envíos: Cuando entras sale una lista de todos los envíos donde puedas ordenar por peso, fecha entrega, zona o repartidor. Tendría un circulo a la derecha que te diría si esta entregado o si fue fallida. Esto se podría hacer con una tabla y que la logica de filtrado resida en los td, como vi en las practicas  
   Sería algo asi: ![[PlantillaMenú.png]]

- Pensar en si es mejor que la zona de admin sea cambiar la plantilla añadiendole menús o crear una zona completa para el que quizas es mas vistos y se nota mas la diferencia 
- En el home quiero poner un panel de resumen diario, donde pongan los ultimos envios, los envios realizados hoy, los que estan en ruta y los entrgados y que te diga cuantos repartidores hay activos y cuantos paquetes le quedan por entregar 


## Cosas a preguntar

1. Tengo que crear también una pestaña donde se pueda gestionar la ruta de los riders 
2. ¿Qué diferencia debería de tener el admin con el operador? ¿Hay usuario?
3. ¿El control de carga/peso que es en realidad? ¿ Es un control donde el rider no puede llevar más de x peso? . ¿Es el peso del paquete, y el operador o admin puede darlos de alta? 
