/*1) Busqueda Secuencial , no ordenado
 *
 * Entradas: E,n,K donde E es un arreglo con n entradas(indexadas 0...,n-1) y K es el elemento buscado, Por sencillez supongamos que K
 * y los elementos de E son enteros lo mismo que n.
 *
 * Salida: Devuelve la respuesta, la ubicacion de K en E(-1 si no se encuentra K)
 * 
 * */

public void main(){
  //numero de elemento -1
//		0,1, 2
int []Arreglo={12,23,21};
int CantidadDeElementos=Arreglo.Length();
int K=23;
int posicion=BusquedaS(Arreglo,CantidadDeElementos,K);
}


//Algoritmo hecho:
int BusquedaS(int []E,int n,int K)
1.)INICIO	
2.)int indice=0,respuesta=0;
3.)respuesta=-1;//suponer que no se encontro
4.)for(indice=0,indice<n;indice++)
5.)if(K==E[indice])
6.)respuesta=indice; //Exito
7.)break;
//Continuar el ciclo
8.)return respuesta
9.)FIN  
  
