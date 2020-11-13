import java.util.Scanner;

public class ParesEnArray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("¿Cuántos números tiene el array?");
    int tamanyo=sc.nextInt();
    System.out.println("Array:");
    int[] array=UtilidadesArrays.pideArrayTeclado(sc,tamanyo);
    int numeroPares=0;
    for (int i:array) {
      if(i%2==0){
        numeroPares++;
      }
    }
    System.out.println("Hay " + numeroPares + " pares en " + UtilidadesArrays.mostrarArray(array));
  }
}
