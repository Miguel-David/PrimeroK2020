public class BasicoMatrices {
  public static void main(String[] args) {
    int[][] matriz=new int[3][4]; //Tiene 3 filas y 4 columnas
    matriz[2][1]=43;
    char[][] chula={
            {'*','*','*','*','*','*','*'},
            {'*',' ',' ',' ',' ',' ','*'},
            {'*',' ',' ',' ',' ',' ','*'},
            {'*',' ',' ',' ',' ',' ','*'},
            {'*','*','*','*','*','*','*'}
    };
    int[][] aspa=new int[11][11];
    //aspa[1][3]=9;
    //Recorrer sin cambiar la matriz
    for (int[] fila:aspa) {
      for (int numero:fila) {
        System.out.print(numero+" ");
      }
      System.out.println();
    }
    //Recorrido cambiando la matriz
    //Queremos un aspa de 1s
    /*for (int fila = 0; fila < aspa.length; fila++) {
      for (int columna = 0; columna < aspa[fila].length; columna++) {
        if(fila==columna || aspa.length-fila-1==columna){
          aspa[fila][columna]=1;
        }
      }
      System.out.println();
    }
    */
    System.out.println("------------------------------------------");
    //Hacia abajo y derecha
    int fila1=0;
    int columna=0;
    for (int i = 0; i < aspa.length; i++) {
      aspa[fila1][columna]=1;
      fila1++;
      columna++;
    }

    //Hacia arriba y la derecha
    fila1= aspa.length-1;
    columna=0;
    for (int i = 0; i < aspa.length; i++) {
      aspa[fila1][columna]=1;
      fila1--;
      columna++;
    }

    for (int[] fila:aspa) {
      for (int numero:fila) {
        System.out.print(numero+" ");
      }
      System.out.println();
    }

  }
}
