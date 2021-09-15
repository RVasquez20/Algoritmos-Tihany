/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg10;

import java.util.Arrays;

/**
 *
 * @author rodri
 */
public class Clase10 {
static int indice=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*Envolturas para procedimientos recursivos:
        Es comun que en una tarea tenga partes que solo deban ejecutarse una vez 
        al principio y o al final. En tales casos se necesita un procedimiento
        no recursivo que prepare las cosas y luego invoque al procedimiento recrusivo, y
        talvez efectue tareas finales una vez que ese procedimiento retorne.
        LLamamos a un procedimiento no recursivo de este tipo como "Envoltura del procedimiento recursivo"
        A veces la envoltura se limita a inicializar un argumento adicional para el procedimiento
        recursivo. por ejemplo:
        
        Busqueda binaria necesita una envoltura para efectuar la primera invocacion
        con todo el arreglo como intervalo. la envoltura puede ser simplemente:

        */
      int[]numeros={1,2,5,4,6,3,9,8,7,12,54,21,11,20,22};
                  //0,1,2,3,4,5,6,7,8,9, 10,11,12,13
      //1,2,3,4,5 ,6,7,8,9,10
      //0,1,2,3,4  5,6,7,8,9
      int k=7,indice=0;
      Arrays.sort(numeros);
      indice=busquedaOrdenada(numeros,numeros.length,k);
      if(indice==-1){
          System.out.println("No se encuentra");
      }else{
          System.out.println("Si esta el numero en la posicion "+indice+"="+numeros[indice]);
      }
      
        
    }
    /*12,14,2,1,65*/
    /*primero=0,ultimo=length, k=2*/
    public static int busquedaBinaria(int [] E,int primero,int ultimo, int k){
        
        if(ultimo<primero){
            indice=-1;
        }else{
            int medio=(primero+ultimo)/2;
            if(k==E[medio]){
                indice=medio;
            }else if(k<E[medio]){
                indice=busquedaBinaria(E,primero,medio-1,k);
            }else{
                indice=busquedaBinaria(E,medio+1,ultimo,k);
            }
        }
        return indice;
    }
    //Envoltura
    public static int busquedaOrdenada(int [] E,int n, int k){
       return busquedaBinaria(E,0,n-1,k); 
    }
    
}
