import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Relacionales {
  public static void main(String[] args) {
    //Pregunta la edad y di si es mayor de edad
    int edad=Integer.parseInt(JOptionPane.showInputDialog("¿Edad?"));
    boolean esMayorDeEdad=edad>=18;
    String salida=esMayorDeEdad?"Es mayor de edad":"Es menor";
    JOptionPane.showMessageDialog(null,salida);
    //Pregunta el número de hijos
    //Si tiene más de dos, monovolumen
    //Si tiene menos o dos, ferrari
    int numeroHijos=Integer.parseInt(JOptionPane.showInputDialog("¿Hijos?"));
    boolean familiaNumerosa=numeroHijos>2;
    String coche=familiaNumerosa?"Monovolumen":"Ferrari";
    JOptionPane.showMessageDialog(null,coche);
  }
}
