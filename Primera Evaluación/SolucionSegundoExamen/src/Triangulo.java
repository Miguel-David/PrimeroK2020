import java.util.Scanner;

public class Triangulo {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Número de filas");
    int numFilas=sc.nextInt();
    int espacios=numFilas-1;
    int asteriscos=1;
    for (int i = 0; i < numFilas; i++) {
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < asteriscos; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      System.out.println();
      espacios--;
      asteriscos++;
    }
  }
}
