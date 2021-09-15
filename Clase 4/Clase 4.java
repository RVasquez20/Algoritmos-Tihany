//Analisis y probelmas de algoritmos
//
//1)Correccion
//2)Cantidad de trabajo Realizado
//3)Cantidad De Espacio Usado
//4)Sencillez y claridad
//5)Optimidad
//
//
//Ejercicio:Hallar el elemento mas grande de un arreglo
//Problema:hallar el elemento mas grande en un arreglo de n numeros,suponiendo que los datos son de tipo float
//
//Clase del algoritmo:Algoritmo que pueda comparar y copiar numeros de tipo float, pero no efectuar otras operaciones con ellos
//
//Operacion Basica:Coparacion de un elemento del arreglo con otro objeto tipo float.Podria ser otro elemento del arreglo o una variable almacenada
//
//Cota Superior:Suponiendo que los numeros estan en el arreglo llamado E . El algoritmo siguiente halla el maximo
//
//Entrada:n numero de elementos,E arreglo definido de numeros
//Salida:Devuelve el numero mas grande
//
//valores=    1,  4 , 3 , 2 
//posiciones= 0   1   2   3
//
//
//n=numero de elementos, E arreglo que contendra a los elementos
//n   =    n.Length();
//
1)Inicio
2)float hallarMax(n,E)
3)float max=E[0]
4)for(indice=1;indice<n;indice++)
5)if(max<E[indice])
6)max=E[indice]
7)return max;
8)Fin
