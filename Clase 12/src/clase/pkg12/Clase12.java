/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg12;

/**
 *
 * @author rodri
 */
public class Clase12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     /*Ordenamientos:
        1)Ordenamiento por insercion
        2)Divide y Venceras
        3)Quicksort
        4)Fusion de sucesiones ordenadas
        5)Mergesort
        6)Cotas inferiores para ordenar comparando claves
        7)Heapsort
        8)Comparacion de cuatro algoritmos para ordenar
        9)Shellsort
        10)Ordenamiento por base
        
        
        Detalle(java):Interfaz Comparable
        es posible escribir un procedimiento capaz de comparar una amplia variedad de tipos de 
        claves.El nombre de tipo clave se sustituira por la palabra reservada
        Comparable.
        
        
        
        -Todos los metodos de una interfaz tienen que ser implicitamente publicos 
         y abstractos
        -Cuando usar una clase abstracta y una interfaz?
            +Una clase abstracta cuando se necesita definir 
            una plantilla para un grupo de subclases
            +una interfaz cuando se debe definir un rol para otras clases
            independientemente del arbol de herencia de estas clases
        -Una interfaz es una clase 100% abstracta que solo tiene metodos abstractos
        -Una clase puede implentar cualquier cantidad de interfaces
        
        Diferencia entre clases e interfaz
        
        Clase                                           Interfaz
        ----------------------------        -------------------------------
        En clase, puede crear instancias        En una interfaz, no puede crear 
        de variables y crear objetos            variables ni objetos
        -------------------------------------------------------------------------
        La clase puede contener                 La interfaz no puede contener
        metodos concretos.                      Metodos concretos(con implementacion)
        -------------------------------------------------------------------------
        Los especificadores de acceso           En la interfaz solo se utiliza el 
        utilizados son:+,-,#                    Especificador #(public)

        */   


    /*
     Ordenamiento por insercion:
     Ordenamiento por insercion es un muy buen algoritmo de ordenamiento para comenzar
     porque la idea en la que se basa es natural y genreal, sus analisis de peor caso
     y comportamiento promedio son faciles de efectuar.
     
     La estrategia:
     partir de una sucesion E de n elementos en orden arbitrario.
     Supongase que hemos ordenado algun segmento inicial de la sucesion.
     se ordenan 5 elementos(es del ejemplo) del extremo izquierdo.
     El paso general consiste en incrementar la loingitud del segmento ordenado insertando el
     siguiente elemento en el lugar correcto.
     Sea x el siguiente elemento a insertar en el segmento ordenado, es decir, x al elemento
     de el extremo izquierdo  del segmento que aun no se examina.
     Primero hacemos a un lado a x(es decir lo copiamos a una variable local)
     dejando una vacante en su antigua posicion
     Luego comparamos repetidamente x con el elemento que esta inmediatamente a la izquierda de 
     la vacante y mientra x sea menor, pasaremos ese elemento a la vacante, dejando una vacante
     en el lugar donde estaba; es decir la vacante se desplaza una posicion a la izquierda.
     Este proceso se detiene cuando se acaban los elementos a la izquierda de la vacante actual
     o cuando el elemento que esta a la izquierda de la vacante actual es menor o igual que x.
     
     
     
     */
     
        
        
        
    }
    
}
