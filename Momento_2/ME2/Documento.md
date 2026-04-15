Los arreglos generan un registro basado en que los contenedores son objetos que cuentan con un Id peso y una reswpectiva prioridad, de manera que se pueda cumplir con las exigencias del codigo.

Luego se toma los contenedores para ponerlos en una matris de dos dimensiones encargfadads der organixzarlos y ubicarlos en una determinada posicion, si no hay espacios en la matriz manda el aviso.

Despues de eso a las cajas que tienen prioridad van a una cola y se agrupan junto con las otras para tenerlas separadas de las que no cuentan con esta condicion, las primeras en llegar salen primero bajo la logica de las colas.


Ahora con la grua y el sistema de apilado ponemos las cajas con la condicion de que a una caja no se le puede poner otra mas pesada encima, y tambien se utiliza una pila auxiliar encargada de tomar las cajas de arriba en caso de que uan de las de abajo este dañada, tipo, pasar de una pila a otra para acceder a los contenedores de la mitad.
