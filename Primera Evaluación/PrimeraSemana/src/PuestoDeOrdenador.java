import javax.swing.*;

public class PuestoDeOrdenador {
  public static void main(String[] args) {
    int numeroPuesto = Integer.parseInt(JOptionPane.showInputDialog("¿Puesto?"));
    int puestoSiguiente=numeroPuesto+1;
    String salida="Mañana te toca en el puesto:"+puestoSiguiente;
    JOptionPane.showMessageDialog(null,salida);

    double alturaMetros = Double.parseDouble(JOptionPane.showInputDialog("¿Altura?"));
    JOptionPane.showMessageDialog(null,alturaMetros*100+" cm");

  }
}
