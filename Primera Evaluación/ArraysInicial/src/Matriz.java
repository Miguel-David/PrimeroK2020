public class Matriz {
  public static void main(String[] args) {
    int filas=4;
    int columnas=6;
    int[][] tabla=new int[filas][columnas];
    tabla[1][4]=9;
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        System.out.print(tabla[i][j]+" ");
      }
      System.out.println();
    }
  }
}
