public class SumarDosArrays {
  //Hacer un método al que se le pasan dos arrays del mismo tamaño y
  // devuelve un otro array las sumas de los elementos en la misma posicion
  /* Le paso
      3,4,5,0,0,0,1
      1,2,1,1,1,2,3
      Devuelve
      4,6,6,1,1,2,4
   */
  public static void main(String[] args) {
    int[] p={3,4,5,0,0,0,1};
    int[] q={1,2,1,1,1,2,3};
    imprimeArray(p);
    imprimeArray(q);
    imprimeArray(sumaDosArrays(p,q));
  }

  static void imprimeArray(int[] array){
    String salida="";
    for (int i:array) {
      salida+=i+" ";
    }
    System.out.println(salida);
  }

  static int suma(int uno,int otro){
    return uno+otro;
  }

  static int[] sumaDosArrays(int[] uno,int[] otro){
    int[] vectorSuma=new int[uno.length];
    for (int i = 0; i < vectorSuma.length; i++) {
      vectorSuma[i]=uno[i]+otro[i];
    }
    return vectorSuma;
  }
}
