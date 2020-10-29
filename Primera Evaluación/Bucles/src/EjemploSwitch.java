import java.util.Scanner;

public class EjemploSwitch {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Dime una nota");
    int nota=sc.nextInt();
    String salida="";
    switch(nota){
      case 1:
        salida="uno";
        break;
      case 2:
        salida="dos";
        break;
      case 3:
        salida="tres";
        break;
      case 4:
        salida="cuatro";
        break;
      case 5:
        salida="cinco";
        break;
      default:salida="no reconocido";
    }

    //Devolver la nota en nota escrita
    String notaEscrita="";
    switch(nota){
      case 0:
      case 1:
      case 2:
      case 3:
      case 4: notaEscrita="Insuficiente";
      break;
      case 5: notaEscrita="Suficiente";
      break;
      case 6: notaEscrita="Bien";
      break;
      case 7:
      case 8: notaEscrita="Notable";
      break;
      case 9:
      case 10:notaEscrita="Sobresaliente";
      break;
      default:notaEscrita="No reconocido";
      break;
    }
    String pp="";
    //NO hacer, que se lía y no se entiende
    switch(nota){
      case 0:
      case 1:
        System.out.println("El número es muy pequeñito.");
      case 2:
      case 3:
        System.out.println("El número es menor que 4");
        break;
      default:pp+="Y lo he entendido";
    }

    System.out.println("La nota es: "+salida);
    System.out.println("La nota escrita es: " + notaEscrita);
  }
}
