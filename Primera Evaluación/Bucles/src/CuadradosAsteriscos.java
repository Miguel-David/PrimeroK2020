import javax.swing.*;

public class CuadradosAsteriscos {
  public static void main(String[] args) {
    //Hacer un cuadrado de 5x5 con asteriscos
    System.out.println("*****\n*****\n*****\n*****\n*****");
    System.out.println("----------------------------");
    //Mejora
    System.out.println("*****");
    System.out.println("*****");
    System.out.println("*****");
    System.out.println("*****");
    System.out.println("*****");
    System.out.println("----------------------------");
    //Otra mejora
    for(int i=0;i<5;i++){
      System.out.println("*****");
    }
    System.out.println("----------------------------");
    //Siguiente mejora
    int numeroFilas=5;
    for(int i=0;i<numeroFilas;i++){
      System.out.println("*****");
    }
    System.out.println("----------------------------");
    //Siguiente mejora
    numeroFilas=5;
    for(int i=0;i<numeroFilas;i++){
      for(int j=0;j<5;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    //Siguiente mejora
    numeroFilas=5;
    int numeroColumnas=5;
    for(int i=0;i<numeroFilas;i++){
      for(int j=0;j<numeroColumnas;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    //Programa bueno
    numeroFilas=Integer.parseInt(JOptionPane.showInputDialog("Filas?"));
    numeroColumnas=Integer.parseInt(JOptionPane.showInputDialog("Columnas?"));
    for(int i=0;i<numeroFilas;i++){
      for(int j=0;j<numeroColumnas;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
