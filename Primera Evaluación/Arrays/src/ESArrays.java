public class ESArrays {
  //Hacer un método auxiliar que señale una posición en un Array
  public static void main(String[] args) {
    int[] vector={3,2,5,7,8,0,1};
    System.out.println(senyalaPosicion(vector, 3));
    System.out.println(senyalaPosicion(vector, 6));
    System.out.println(senyalaPosicion(vector, 2));

    int[] posiciones={1,3,6};
    System.out.println(senyalaPosicion(vector, posiciones));
    /*
    Salida:
    Array: {3, 2, 5, 7, 8, 0, 1}
                     ⇧
     */

  }

  private static String senyalaPosicion(int[] vector, int[] posiciones){
    String salida=vectorCadena(vector)+"\n";
    salida+="        ";
    boolean[] tieneFlecha=new boolean[vector.length];
    for (int i = 0; i < posiciones.length; i++) {
      int posicionAMarcar=posiciones[i];
      tieneFlecha[posicionAMarcar]=true;
    }
    for (boolean tiene:tieneFlecha) {
      salida+=tiene?"⇧  ":"   ";
    }
    return salida;
  }

  private static String senyalaPosicion(int[] vector, int i) {
    String salida=vectorCadena(vector)+"\n";
    salida+="        ";
    for (int j = 0; j < i; j++) {
      salida+="   ";
    }
    salida+="⇧";
    return salida;
  }

  private static String vectorCadena(int[] vector) {
    String salida="Array: {";
    //Unimos todo con comas
    for (int i:vector) {
      salida+=i+", ";
    }
    //Problema: Tenemos una coma de más
    salida=salida.substring(0,salida.length()-2);
    salida+="}";
    return salida;
  }
}
