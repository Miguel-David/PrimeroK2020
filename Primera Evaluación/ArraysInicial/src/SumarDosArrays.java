import java.util.Scanner;

public class SumarDosArrays {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("¿Cuántos números tiene el array?");
    int tamanyo=sc.nextInt();
    System.out.println("Primer Array:");
    int[] primero=UtilidadesArrays.pideArrayTeclado(sc,tamanyo);
    System.out.println("Has introducido: " + UtilidadesArrays.mostrarArray(primero));
    System.out.println("Segundo Array:");
    int[] segundo=UtilidadesArrays.pideArrayTeclado(sc,tamanyo);
    System.out.println("Has introducido: " + UtilidadesArrays.mostrarArray(segundo));
    int[] suma=UtilidadesArrays.sumaArrays(primero,segundo);
    System.out.println("Suma:"+UtilidadesArrays.mostrarArray(suma));
  }
}
