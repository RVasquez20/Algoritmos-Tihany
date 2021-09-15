/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg9;

/**
 *
 * @author rodri
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     * Arbol de activacion:
     * 
     * Se crea un arbol de activacion para llevar o crear un registro permanente de todas las invocaciones de 
     * procedimientos que se efectuaron durante la ejecucion de un algoritmo.
     */
    public static void main(String[] args) {
        /*
        Sugerencia para recursion: Metodo 99
        en el desarrollo avanzado de algoritmos , la recursion es una tecnica de 
        disenio indispensable, un tratamiento a fondo del disenio recursivo
        rebasa el alcance de los algoritmos en general.
        Indentificaremos alguna "unidad de medida" para el tamanio del problema que nuestra fucnion
        o procedimiento tratara de resolver. Luego imaginamos que nuestra tarea consiste
        en escribir un procedimiento digamos p, que resolvera problemas
        de todos los tamanios entre 0 y 100. Esto implica que al diseniar la solucion podremos
        suponer que el tamanio del problema es cuando mas 100.
        Ademas imaginamos que se nos permite invocar una subrutina dada, de nombre p99
        que hace exactamente lo que se supone que hace nuestro procedimiento, y tiene la misma rubrica de
        tipo, con la excepcion de que su condicion previa es que el tamanio del problema es de 0 a 99.
        Podemos usar esta subrutina sin tener que escribir el codigo correspondiente.
        Una segunda sugerencia es identificar claramente el caso no recursivo del problema.
        ya que nos conviene mas hacerlo lo mas pequenio posible
        Nuestro procedimiento casi siempre iniciara con una prueba en caso de que no sea recursivo, ]
        este tambien es llamado caso base;
        
        Una ultima estipulacion es que resulta demasiado costoso determinar si el problema
        alimentado a p(procedimiento que lo soluciona) tiene un tamanio de exactamente 100.
        En cambio es factible determinar si su tamanio es 0, o cualquier constante pequenia.
        
        Ahora bien el Metodo 99 consiste en encontrar una forma de escribir p 
        invocando a p99 siempre que se necesite. Desde luego si p detecta un caso
        facil no necesitara dicha invocacion.La idea clave es que cuando p detecte
        un caso que no puede resolver de inmediato tiene que crear un subproblema para resolverlo con
        p99 el cual satisface tres condiciones:
        
        1.El tamanio del subproblema es menor que el del problema de p
        2.El tamanio del subproblema no es menor que el minimo(0 en esta explicacion)
        3.El subproblema satisface todas las demas condiciones previas de p99
        (que son iguales a las condiciones previas de p)
        
        Para aplicar el metodo 99 , imaginemos que solo tenemos que preocuparnos por
        listas que contienen 100 elementos o menos, y que se nos da borrar99.
        Es evidente que , si podemos eliminar un elemento(supongamos el primero)
        de L, podriamos dejar que borrar99 se encargue del resto(resto(L)).
        No sabemos cuantos elementos hay en resto(L), pero adoptamos una actitud positiva.
        Si hay cuando mas 100 elementos en L, podemos invocar a borrar99 y su hay mas no nos importa
        que suceda porque solo se nos pidio hhacer que borrar funcionara con una lista de 100
        elementos o menos.
        
        Asi hemos llegado al siguiente procedimiento de Metodo 99 para implementar borrar

        */
     
    }
       public int  borrar(int L,int x){
        return 0;
    }
}
