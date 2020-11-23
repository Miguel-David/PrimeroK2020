public class NumerosCrecientesTabla {
  public static void main(String[] args) {
    int[][] tabla=new int[5][6];
    //El recorrido de inicilizar me los sé de memoria
    //He cogido un folio en blanco
    //Y lo he escrito 50 veces.
    //He escrito:
    //for(int i=0;i<tabla.length;i++){
    //  for(int j=0;j<tabla[i].length;j++){
    //       Hago cosicas. Y tengo la i que es la fila y la j que es la columna
    //  }
    //  Termina una fila (viene bien para Poner retornos de carro, por ejemplo
    //}
    int primeroFila=0;
    for (int i = 0; i < tabla.length; i++) {
      int numeroColumna=primeroFila;
      for (int j = 0; j < tabla[i].length; j++) {
        tabla[i][j]=numeroColumna++;
      }
      primeroFila++;
    }
  }
}
