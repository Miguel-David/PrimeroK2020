import javax.swing.*;
import java.net.Inet4Address;

public class Prestamo {
  //Se le da un préstamo a un cliente si es mayor de edad
  //y tiene un aval de 30.000 € mínimo
  //Devolver si se concede el préstamo
  public static void main(String[] args) {
    int edad=Integer.parseInt(JOptionPane.showInputDialog("¿Edad?"));
    int aval=Integer.parseInt(JOptionPane.showInputDialog("Aval en €"));
    boolean mayorEdad=edad>=18;
    boolean suficienteAval=aval>=30000;
    boolean concedido=mayorEdad && suficienteAval;
    String salida=concedido?"CONCEDIDO":"DENEGADO";
    JOptionPane.showMessageDialog(null,salida);
  }
}
