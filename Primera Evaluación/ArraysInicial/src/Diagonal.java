public class Diagonal {
  //Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos
  // de la diagonal principal sean 1 y el resto 0.


  public static void main(String[] args) {
    int[][] tabla=Diagonal.diagonal(40);


    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        System.out.print(tabla[i][j]+" ");
      }
      System.out.println();
    }
  }

  private static int[][] diagonal(int tamanyo) {
    int[][] salida=new int[tamanyo][tamanyo];
    for (int i = 0; i < salida.length; i++) {
      for (int j = 0; j < salida[i].length; j++) {
        if(i==j){
          salida[i][j]=1;
        }
      }
    }


    return salida;
  }


}
