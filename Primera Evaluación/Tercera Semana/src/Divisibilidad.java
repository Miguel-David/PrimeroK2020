import javax.swing.*;

public class Divisibilidad {
  public static void main(String[] args) {
    int entrada=Integer.parseInt(JOptionPane.showInputDialog("Número?"));
    int resto=entrada%5;
    String salida=resto==0?"Es múltiplo de 5":"No es múltiplo de 5";
    JOptionPane.showMessageDialog(null,salida);
  }
}
