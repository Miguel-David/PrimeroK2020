public class MaximoEnTabla {
  public static void main(String[] args) {
    int[][] numeros={
            {4,5,6,7,3,5},
            {9,8,4,3,5,2},
            {1,2,3,4,5,2}
    };
    //Hallar el máximo (9)
    int maximo=numeros[0][0];
    for(int[] fila:numeros){
      for(int i:fila) {
        if (i > maximo) {
          maximo = i;
        }
      }
    }
    System.out.println(maximo);
  }
}
