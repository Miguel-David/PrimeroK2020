public class Tabla {
  public static void main(String[] args) {
    int[][] tablaRara;
    tablaRara=new int[4][];
    tablaRara[0]=new int[3];
    tablaRara[1]=new int[5];
    tablaRara[2]=new int[2];
    tablaRara[3]=new int[3];
    int[] pp={43,2,3,43,43,45,54,3,32,8};
    char[][] sopaLetra= {
            { 'P','C','X','T','A'},
            { 'P','C','X','T','A'},
            { 'P','C','X','T','$'},
    };
    System.out.println(sopaLetra[2][4]);
    for (char[] fila:sopaLetra) {
      for (char letra:fila) {
        System.out.print(letra);
      }
      System.out.println();
    }
    for (int i = 0; i < sopaLetra.length; i++) {
      for (int j = 0; j < sopaLetra[i].length; j++) {
        System.out.print("(" + i + "," + j + "):" + sopaLetra[i][j]+"  ");
      }
      System.out.println();
      System.out.println();
    }
  }
}
