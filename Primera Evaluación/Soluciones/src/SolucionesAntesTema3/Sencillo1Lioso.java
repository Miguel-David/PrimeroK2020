package SolucionesAntesTema3;

import javax.swing.*;

public class Sencillo1Lioso {
  public static void main(String[] args) {
    //¿Tienen que ser int?
    String primeraEntrada= JOptionPane.showInputDialog("¿Qué va a ser lo primero?");
    String segundaEntrada= JOptionPane.showInputDialog("¿Qué va a ser lo segundo?");
    String terceraEntrada= JOptionPane.showInputDialog("¿Qué va a ser lo último?");
    //Primera opción
    JOptionPane.showMessageDialog(null,terceraEntrada);
    JOptionPane.showMessageDialog(null,segundaEntrada);
    JOptionPane.showMessageDialog(null,primeraEntrada);

  }
}
