public class Marco {
  //Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0
  // salvo los de los bordes que
  //deben ser 1. Mostrarla.
  //11111111
  //10000001
  //10000001
  //10000001
  //10000001
  //11111111
  public static void main(String[] args) {
    int[][] tabla=Marco.marco(8,6);
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        System.out.print(tabla[i][j]+" ");
      }
      System.out.println();
    }
  }

  static int[][] marco(int filas, int columnas) {
    int[][] salida=new int[filas][columnas]; //Lo rellena de ceros
    //Fila de arriba
    for (int columna = 0; columna < salida[0].length; columna++) {
      salida[0][columna]=1;
    }
    //Fila de abajo
    for (int columna = 0; columna < salida[salida.length-1].length; columna++) {
      salida[salida.length-1][columna]=1;
    }

    for (int fila = 0; fila < salida.length; fila++) {
      salida[fila][0]=1; //Primera columna
      salida[fila][salida[fila].length-1]=1; //última columna
    }

    return salida;
  }
}
