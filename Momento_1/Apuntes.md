Arreglos en java:
- ningun arreglo puede tener distintos tipos de datos dentro de si mismo.
- Los arreglos en cuestion de orden y posiciones siempre arrancan en cero.
- dentro del arreglo puedo tener el tipo de dato que yo quiera siempre y cuando solo se almacen un tipo de dato (como se dijo antes)

Ejemplo: Arreglo "A" de tipo int (enteros)

    A = 2 , 6 , 8 , 1 , 20 , 40 , 7, 3, 5
    posicion = 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8

Tamaño de arreglo: Cantidad de elementos que tiene al arreglo (9 en nuestro caso)
Ultima posicion del arreglo será: tamaño - 1

pequeño ejercicio

A[4]= 20  A[7]= 3  A[2]= 8  A[0]= 2  A[1]= 6  A[9]= Error  



11/02/2026


Clase de arreglos:

En la clase pasada se utilizó la forma-1 en la que sde definia el arreglo directamente con elementos
           Ejemplo: int[] a = {7, 2, 6, 1, 0, 3};

El tamaño del arreglo se obtiene con la palabra reservada "length"
           Ejemplo:
           
    For(int i = 0; i < a.length; i++){
    System.out.println("a[" + i + "]=" + a[i]);

Sumar todos los elementos del arreglo
           Ejemplo:

    int total = 0;
    for(int i = 0; i < a.length; i++){
    total += a[i]{
    }
    System.out.println("la suma de los elementos del arreglo a es: " + total);




