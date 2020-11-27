import java.util.Arrays;

public class QuitarElementoArray {
  public static void main(String[] args) {
    int[] array={1,2,4,5,7,9,3,2,0};
    System.out.println(Arrays.toString(array));
    int[] quitadoEl4=quitar(array,1);
    System.out.println(Arrays.toString(quitadoEl4));
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
  }

  private static int[] quitar(int[] array, int numeroMalvado) {
    int contadorBuenos=0;
    for (int numero:array) {
      if(numero!=numeroMalvado) contadorBuenos++;
    }
    int[] salida=new int[contadorBuenos];
    int lugarInsercionBuenos=0;
    for (int n:array) {
      if(n!=numeroMalvado){
        salida[lugarInsercionBuenos]=n;
        System.out.println("He puesto en " + lugarInsercionBuenos);
        lugarInsercionBuenos++;
      }
    }
    return salida;
  }
}
