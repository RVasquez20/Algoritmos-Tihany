Algoritmo de QuickSort:

void quickSort(Elementos[] E,int pimero, int ultimo){
  if(primero < ultimo){
    Elemento elementoPivote = E[Primero];
    Clave pivote = elementoPivote.clave;
    int puntoPartir = partir(E,pivote,primero,ultimo);
    E[puntoPartir] = elementoPivote;
    quickSort(E,primero,puntoPartir-1);
    quickSort(E,puntoPartir+1,ultimo);
  }/*
  else{
   Elemento elementoPivote = E[primero];
    Clave pivote = elementoPivote.clave;
    int puntoPartir = partir(E,pivote,primero,ultimo);
    E[puntoPartir] = elementoPivote;
    quickSort(E,primero,puntoPartir-1);
    quickSort(E,puntoPartir+1,ultimo);
3,5,33,1,8,12,4,23,8

  }

*/
  return;
}

int partir(Elementos[] E, Clave Pivote, int primero, int ultimo){
int bajo, alto;
bajo = primero;
alto = ultimo;

  while(bajo < alto){
    int vacanteAlta = extenderRegionGrande(E, pivote, bajo, alto);
    int vacanteBaja = extenderReginChica(E , pivote, bajo+1, vacanteAlta);
    bajo = vacanteAlta;
    alto = vacanteAlta-1;
  }
return bajo;//Este es puntoPartir
}


int extenderRegionGrande(Elementos[] E, Clave pivote, int vacBaja, int alto){
int vacAlta, actual;
vacAlta = vacBaja; //suponiendo un fracaso debido a clave<pivote
actual = alto;

  while(actual > vacBaja){
      if(E[actual].clave < pivote){
	  E[vacBaja] = E[actual];//exito
	  vacAlta = actual;
	  break;
      }
  }
actual--;//Seguir buscando
return vacAlta;

}

int extenderRegionCicha(Elementos[] E, Clave pivote, int bajo, int vacAlta){
int vacBaja, actual;
vacBaja = vacAlta; //suponiendo un fracaso debido a clave pivote
actual = bajo;

  while(actual < vacAlta){
      if(E[actual].clave >= pivote){
	  E[vacAlta] = E[actual];//exito
	  vacBaja = actual;
	  break;
      }
  }
actual--;//Seguir buscando
return vacBaja;
}

smallSort



