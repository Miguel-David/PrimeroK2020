package SolucionesAntesTema3;

import javax.swing.*;

public class TablaMultiplicar {
  public static void main(String[] args) {
    int numeroTabla=Integer.parseInt(JOptionPane.showInputDialog("Dime un número"));
    String salida="<html><pre style='font-size:24px'>";
    salida+=numeroTabla +"x 1 = "+numeroTabla+"<br>";
    salida+=numeroTabla +"x 2 = "+numeroTabla*2+"<br>";
    salida+=numeroTabla +"x 3 = "+numeroTabla*3+"<br>";
    salida+=numeroTabla +"x 4 = "+numeroTabla*4+"<br>";
    salida+=numeroTabla +"x 5 = "+numeroTabla*5+"<br>";
    salida+=numeroTabla +"x 6 = "+numeroTabla*6+"<br>";
    salida+=numeroTabla +"x 7 = "+numeroTabla*7+"<br>";
    salida+=numeroTabla +"x 8 = "+numeroTabla*8+"<br>";
    salida+=numeroTabla +"x 9 = "+numeroTabla*9+"<br>";
    salida+=numeroTabla +"x10 = "+numeroTabla*10+"</pre></html>";
    JOptionPane.showMessageDialog(null,salida);
  }
}
