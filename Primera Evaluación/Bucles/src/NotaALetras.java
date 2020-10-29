import javax.swing.*;
import java.util.Scanner;

public class NotaALetras {
  //Pide una nota en número y la devuelve en palabra
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Dime la nota");
    int numero=sc.nextInt();
    System.out.println("Has escrito el " + numero);
    if(numero<5){
      System.out.println("insuficiente");
    } else if(numero==5){
      System.out.println("sufi");
    } else if(numero==6){
      System.out.println("bien");
    } else if(numero==7 || numero==8){
      System.out.println("notable");
    } else {
      System.out.println("sobresaliente");
    }
  }
}
