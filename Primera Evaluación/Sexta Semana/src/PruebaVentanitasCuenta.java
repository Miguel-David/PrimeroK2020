import javax.swing.*;

public class PruebaVentanitasCuenta {
  public static void main(String[] args) {
    String nombre=JOptionPane.showInputDialog("Titular?");
    CuentaBancaria c=new CuentaBancaria(nombre);
    c.imprimirDatosEnPantalla();
  }
}
