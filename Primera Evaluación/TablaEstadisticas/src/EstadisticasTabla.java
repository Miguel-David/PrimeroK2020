public class EstadisticasTabla {
  static int[][] sumasParciales(int[][] tabla){
    int[][] salida=new int[tabla.length+1][tabla[0].length+1];
    for (int i = 0; i < tabla.length; i++) {
      for (int j = 0; j < tabla[i].length; j++) {
        salida[i][j]=tabla[i][j];
      }
    }
    for (int i=0;i<tabla.length;i++) {
      int[] filaActual=tabla[i];
      int acumulador=0;
      for (int numero:filaActual) {
        acumulador+=numero;
      }
      salida[i][salida[0].length-1]=acumulador;
    }
    for (int columna=0;columna<salida[0].length;columna++) {
      int acumulador=0;
      for (int i = 0; i < tabla.length; i++) {
        acumulador+=salida[i][columna];
      }
      salida[salida.length-1][columna]=acumulador;
    }
    return salida;
  }
}
