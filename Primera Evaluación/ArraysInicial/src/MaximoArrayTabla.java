public class MaximoArrayTabla {
  public static void main(String[] args) {
    //¿Cuál es el máximo (Número más alto) de un array?
    int[] vector={2,4,5,8,1,3,6,9,2,30,1,6,5};
    int maximo=vector[0];

    //¿Vamos a modificar el array? -> NO
    //Necesitamos la i (posición) -> NO
    //Como es que NO a las dos preguntas, for each
    for (int numeroQueCogeEnCadaVuelta:vector) {
      if(numeroQueCogeEnCadaVuelta>maximo){
        maximo=numeroQueCogeEnCadaVuelta;
      }
    }
    System.out.println("El máximo es " + maximo);
  }
}
