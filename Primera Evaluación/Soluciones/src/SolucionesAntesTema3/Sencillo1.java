package SolucionesAntesTema3;

import javax.swing.*;

public class Sencillo1 {
  public static void main(String[] args) {

    int primerNumero=Integer.parseInt(JOptionPane.showInputDialog("Dime el primer número"));
    int segundoNumero=Integer.parseInt(JOptionPane.showInputDialog("Dime el segundo número"));
    int tercerNumero=Integer.parseInt(JOptionPane.showInputDialog("Dime el tercer número"));
    String salida="Al revés son: "+tercerNumero+", "+segundoNumero+" y "+primerNumero;
    JOptionPane.showMessageDialog(null,salida);
  }
}
