/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg7;

/**
 *
 * @author rodri
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Marcos de activacion e invocadores de prodedimiento recursivas
       /*
       La unidad basica de almacenamiento para la invocacion de un procedimiento
       individual durante la ejecucion se denomina marco de arctivacion.El marco de activacion 
       proporciona el espacio para guardar las variables locales del procedimiento, incluido el valor
       devuelto si es que el procedimiento devuelve un valor.
       Tambien proporciona espacio de almacenamiento para otras necesidades contables, como la 
       direccion de retorno, que indica cual instruccion debera ejecutar el programa
       una vez salga de este procedimiento.
       Con esto logramos tener un marco de refencia en el que el procedimiento se ejecuta unicamente durante
       esta invocacion.
       
       Ejemplo:
      
       */
       
       Ejemplo1();//Marco de referencia-Marco de Activacion
        System.out.println("Fin de Ejemplo 1");//Marco de Activacion
        
        /*
        El compilador genera codigo para asignar espacio en una region de la memoria 
        llamada pila de marcos(que a menudo se abrevia a solo pila), como parte del codigo
        que implementa una invocacion de procedimiento. Se hace referencia a este espacio con un registro
        especial llamado apuntador de marco,de modo que, mientras se ejecuta esta invocacion de procedimiento
        se sepa donde estan almacenadas las variables locales, los parametros de entrada
        y el valor devuelto.
        
        Cada invocacion de procedimiento activa tiene un marco de activacion unico.
        */
         Ejemplo1();//direccion de memoria 1
          Ejemplo2();//direccion de memoria 2
          
    }
  
    public static void Ejemplo1(){
        System.out.println("Hola mundo");
    }
     public static void Ejemplo2(){
        System.out.println("Hola mundo");
    }
     //0.1.1.2.3.5.8.13
     public static int Fibonacci(int n){
         int f,f1,f2;
         if(n<2){
             f=n;
         }else{
             f1=Fibonacci(n-1);
             f2=Fibonacci(n-2);
             f=f1+f2;
             
         }
         return f;
     }
     public static int FibonacciMetodo2(int n){
     return n<2 ?  n : FibonacciMetodo2(n-1)+FibonacciMetodo2(n-2);
     }
     
     //Ejemplo de if abreviado
     //Ejemplo si un numnero es positivo o negativo
     public static String Ejemplo3(int n){
         /*
         if(n>0){
         System.out.println("Es Positivo");
         }
         else{
         System.out.println("Es Negativo");
         }
         */
         //Primero la condicion
         //?=Si la condicion se cumple se ejecuta lo que este a la derecha antes de los dos puntos
         //:= else
         
         return n>0 ? "Es Positivo" :"Es Negativo";
     }
     
}
