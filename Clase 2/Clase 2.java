//TDA -> Tipos de datos Abstractos
class Fecha{
  public Año año;
  public int mes,dia;
  
  public static class Año{
    public int numero;
    public boolean esBisiesto;

    public static Año copy(Año a){
      Año a2=new Año();
      a2.numero=a.numero;
      a2.esBisiesto=a1.esBisiesto;
      return a2;
    }
  }

  //Se copian los valores y no la referencia a la direccion
      public static Fecha copy(Fecha f){
	Fecha f2=new Fecha();
	f2.año=Año.copy(f.año); //Clase Organizadora
	f2.mes=f.mes;
	f2.dia=f.dia;
	return f2;
      }

      public static int sigloPorOmision;

}


/**
 * Se omitiran los delimitadores de bloque {} Los limites de los bloques se indicaran con sangria
 * Se omite la palabra STATIC en las declaraciones de metodos.
 * Todos los metodos declarados en los Ejemplos son static.
 * La plabra clave static sí aparece cuando se necesita para definir campos en el obeto y clases internas
 * se omiten los calificadores de nombre de la clase en las invocaciones de metodos. Por ejemplo se podría escribir x=cons(z,x) cuando la sintaxis
 * de java exige x=ListaInt.cons(z,x)
 * se omiten las plabras clave que sirven para controlar la visibilidad : (Modificadores de acceso) public,protected,private.Si se colocan todos los archivos
 * relacionados con un programa dado en que el mismo directorio se hace innecesario ocuparse de cuestiones de acceso
 */
