import java.util.Scanner;

public class LecturaTeclado {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce un número");
    int numero=sc.nextInt();
    System.out.println("Has introducido el " + numero);
    System.out.println("Introduce otro número");
    int numero2=sc.nextInt();
    System.out.println("Has introducido el " + numero2);
    sc.nextLine();
    System.out.println("Introduce  tu nombre");
    String nombre=sc.nextLine();
    System.out.println("Hola, " + nombre);
  }
}
