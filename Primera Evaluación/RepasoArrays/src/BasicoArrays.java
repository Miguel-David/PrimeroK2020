public class BasicoArrays {
  public static void main(String[] args) {
    //Creación de arrays
    int[] numeros = new int[5]; //Importante. Tamaño fijo
    numeros[0] = 32;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 4;
    numeros[4] = 5;
    int[] otros = {4, 5, 6, 3, 9};
    otros[2] = 56;
    otros[0] = otros[3];
    //Sacar el último, el penúltimo, etc
    //El primero siempre es numeros[0];
    int posicionUltimo = numeros.length - 1;
    int posicionPenultimo = numeros.length - 2;
    //Poner un 42 en el último
    numeros[numeros.length - 1] = 42;
    //Recorrer un Array.
    //Para inicializar, for con i
    int numeroAInsertar = 2;
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = numeroAInsertar;
      numeroAInsertar = numeroAInsertar * 2;
    }
    //Si no necesitamos la i ni cambiamos el array usamos el foreach
    for (int n : numeros) {
      System.out.print(n + " ");
    }
    System.out.println();
    int[] original={1,2,3,4,5,6,7,8,9};
    int[] reves=invertir(original);
    for (int n : reves) {
      System.out.print(n + " ");
    }
    System.out.println();
    boolean[] respuestas={true,false,true,false};
    char[] letras={'a','b','c','d'};
    //NO OS HAGO LA PUÑETA

  }


  //Invertir un array
  //Método al que se le pasa un array y devuelve otro array con los números
  //en orden inverso.
  static int[] invertir(int[] vector){
    int[] salida=new int[vector.length];
    int poner=0;
    int obtener= vector.length-1;
    for (int i = 0; i < vector.length; i++) {
      salida[poner++]=vector[obtener--];
    }
    return salida;

    /*
    int[] salida=new int[vector.length];
    for (int i = vector.length-1; i >=0 ; i--) {
      salida[vector.length-i-1]=vector[i];
    }
    return salida;

     */
    /*LO ENTENDEMOS Y LO PENSAMOS NOSOTROS
    int[] salida=new int[vector.length];
    int ultimaPosicion=vector.length-1;
    int primeraPosicion=0;
    int posicionDeLaQueCojo=ultimaPosicion;
    int posicionEnLaQueEscribo=primeraPosicion;
    for (int i = 0; i < vector.length; i++) {
      salida[posicionEnLaQueEscribo]=vector[posicionDeLaQueCojo];
      posicionDeLaQueCojo--;
      posicionEnLaQueEscribo++;
    }
    return salida;

     */
  }

}
