public class MaximosPorFilas {
  public static void main(String[] args) {
    int[][] matriz={
            {1,2,6},
            {3,5,1},
            {6,3,2},
            {0,3,9}
    };
    int[] salida=new int[matriz.length];
    int ponerMaximo=0;
    for(int[] fila:matriz){
      //Algoritmo del máximo que me lo sé de memoria
      //Porque lo he escrito en papel 50 veces
      int maximo=fila[0];
      for(int numero:fila){
        if(numero>maximo){
          maximo=numero;
        }
      }
      salida[ponerMaximo++]=maximo;
    }



  }
}
