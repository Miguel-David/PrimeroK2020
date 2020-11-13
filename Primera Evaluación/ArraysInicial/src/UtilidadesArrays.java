import java.util.Scanner;

public class UtilidadesArrays {
  static String mostrarArray(int[] vector){
    String salida="Array: [";
    for (int i = 0; i < vector.length-1; i++) {
      salida+=vector[i]+", ";
    }
    salida+=vector[vector.length-1]+"]";
    return salida;
  }
  static int[] sumaArrays(int[] primero, int[] segundo){
    int[] salida=new int[primero.length];
    for (int i = 0; i < salida.length; i++) {
      salida[i]=primero[i]+segundo[i];
    }
    return salida;
  }
  static int[] pideArrayTeclado(Scanner sc,int tamanyo){
    int[] salida=new int[tamanyo];
    for (int i = 0; i < tamanyo; i++) {
      salida[i]=sc.nextInt();
    }
    return salida;
  }
  static void marcaPosicion(int[] array,int posicion){
    System.out.println(mostrarArray(array));
    System.out.print("        ");
    for (int i = 0; i < posicion; i++) {
      System.out.print("   ");
    }
    System.out.println("☝");
  }
  static void marcaPosicion(int[] array,int[] posicion){
    System.out.println(mostrarArray(array));
    System.out.print("        ");
    for (int i = 0; i < posicion[0]; i++) {
      System.out.print("   ");
    }
    System.out.println("☝");
  }

  public static void main(String[] args) {
    int[] pp={1,2,5,4,1,0,6};
    marcaPosicion(pp,0);
  }
}
