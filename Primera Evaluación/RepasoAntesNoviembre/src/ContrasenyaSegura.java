import java.util.Scanner;

public class ContrasenyaSegura {
  //Pedir contraseña hasta que tenga más de 6 caracteres
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Contraseña?");
    String pass=sc.nextLine();
    while(pass.length()<6){
      if(pass.length()<6){
        System.out.println("Corta");
      }
      pass=sc.nextLine();
    }
    //Do
    System.out.println("Contraseña?");
    do{
      pass=sc.nextLine();
      if(pass.length()<6){
        System.out.println("Corta");
      }
    } while(pass.length()<6);

  }
}
