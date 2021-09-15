Mejoras al algoritmo de quicksort 
y
Ordenamiento pequenio

Mejoras al algoritmo de quicksort 
  +seleccion del pivote
  En ambas estrategias el elemento que esta en el primer lugar se intercambia con el elemento pivote antes de hacer la llamada a la funcion partir.
---------------------------------------------------------------------------------------------------
  Otra estrategia para encontrar el elemento pivote ademas de la que vimos en la clase pasada es :
  escoger una posicion al azar y convertirla en pivote.

  Ejemplo escoger al azar:

  1 2 8 9 5 4 12 7 0 54 70
  0 1 2 3 4 5  6 7 8 9  10
  i=4
  E[i].clave=5;
 
  5 2 8 9 1 4 12 7 0 54 70

----------------------------------------------------------------------------------------------------
  otra estrategia para seleccionar el pivote es que sea la media de las claves de los elementos,
  es decir E[(primero+ultimo)/2].

  1 2 8 9 5 4 12 7 0 54 70
  4 2 8 9 5 1 12 7 0 54 70
------------------------------------------------------------------------------------------------------
Ordenamiento pequenio

quicksort(elemento E,int primero, int ultimo){
  if(ultimo-primero<pequenio){
    elementoPivote=E[primero];
    pivote=elementoPivote.clave;
    int puntoPartir=partir(E,pivote,pimero,ultimo);
    E[puntoPartir]=elementoPivote;
    quicksort(E,primero,puntoPartir-1);
    quicksort(E,puntoPartir+1,ultimo);
  }else{
  //recomendacion usar ordenamiento por insercion
  insercion(E,primero,ultimo);
  }
}

