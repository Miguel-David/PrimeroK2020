import javax.swing.*;
import java.util.Scanner;

public class NumerosHastaNegativo {
  // Pedir números hasta que se teclee uno
  // negativo, y mostrar cuántos números se han introducido.
  public static void main(String[] args) {
    //¿Vale el for? -->No. No sabemos los números que se van a introducir
    //Primera opción while
    Scanner sc=new Scanner(System.in);
    int contador=0;
    int numeroIntroducido=sc.nextInt();
    while(numeroIntroducido>=0 ){
      //Pidiendo numeros
      numeroIntroducido=sc.nextInt();
      contador++;
    }
    System.out.println("Has introducido " + contador + " numeros");

    //Otra forma do ..while
    contador=0;
    do{
      numeroIntroducido=sc.nextInt();
      contador++;
    } while(numeroIntroducido>=0);
    contador--;
    System.out.println("Has introducido " + contador + " numeros");




  }
}
