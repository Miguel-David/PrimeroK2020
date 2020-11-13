public class MaximoConPosicion {
  public static void main(String[] args) {
    //¿Cuál es el máximo (Número más alto) de un array y cuál es su posición?
    int[] vector={2,4,9,8,1,3,6,9,2,2,1,6,5};
    int maximo=vector[0];
    int posicionMaximo=0;

    //¿Vamos a modificar el array? -> NO
    //Necesitamos la i (posición) -> SI
    //Como alguna de las dos preguntas es SI, NO usamos el for each
    for (int i = 0; i < vector.length; i++) {
      if(vector[i]>maximo){
        maximo=vector[i];
        posicionMaximo=i;
      }
    }
    System.out.println("He calculado el máximo");
    UtilidadesArrays.marcaPosicion(vector,posicionMaximo);
    int aparicionesMaximo=0;
    for (int i:vector) {
      if(i==maximo){
        aparicionesMaximo++;
      }
    }
    int[] posicionesMaximo=new int[aparicionesMaximo];
    int posicionInsertarEnArrayMaximos=0;
    for (int i = 0; i < vector.length; i++) {
      if(vector[i]==maximo){
        posicionesMaximo[posicionInsertarEnArrayMaximos++]=i;
      }
    }
    System.out.println(UtilidadesArrays.mostrarArray(posicionesMaximo));
  }
}
