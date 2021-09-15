/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg11;

/**
 *
 * @author rodri
 */
public class Clase11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    /*Estructuras de control elementales:
     
    Las estructuras de control son mecanismos para hacer que se ejecuten diversos
        bloques.En un principio solo considerabamos tres estructuras:
        sucesion(bloque 1, luego bloque 2),alternativa(si condicion, entonces bloque-se-cumple
        si no ,bloque-no-se-cumple) e invocacion de procedimiento.
        La omision de ciclos for y while de nuestra metodologia a trabajar es de manera intencional.
        Veremos adaptaciones de estas contrucciones una vez que hayamos desarrollado lo basico.
        
        "Demostrar correccion"
        significa demostrar ciertos enunciados logicos acerca de un
        procedimiento.Al igual que una "garantia limitada", los enunciados se redactan con
        cautela de modo que no sean tan generales que la demostracion se vuelva muy dificil.
        
        Propuesta 3.9(Forma general de lema de correccion):
        si se cumplen todas las condiciones previas cuando se ingresa en el bloque
        se cumpliran todas las codiciones posteriores cuando se salga del bloque
        
        ej:
        suponiendo que un bloque se subdivide mediante la construccion de sucesion:
        bloque 1 luego bloque 2. Para demostrar la correccion del bloque
        basta con demostrar un lema que tiene esta forma:
        
        propuesta 3.10(Forma de lema de correccion para sucesion):
        1.Las condiciones previas del bloque implican las condiciones previas del bloque 1
        2.Las condiciones posteriores del bloque 1 implican las condiciones previas del bloque 2
        3.Las condiciones posteriores del bloque 2 implican las condiciones posteriores del bloque
        
        
        
        */
    }
    static public int factorial(int n){
        if(n<1)
            return 1;
        else
            return n*factorial(n-1);
    }
    static public int factorialn(int n){
        return factorial(n);
    }
    
}
