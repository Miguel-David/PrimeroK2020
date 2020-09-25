import javax.swing.*;

public class IndiceMasaCorporal {
  public static void main(String[] args) {
    double peso= Double.parseDouble(JOptionPane.showInputDialog("Dime tu peso en Kg"));
    double altura=Double.parseDouble(JOptionPane.showInputDialog("Dime tu altura en m"));
    double alturaAlCuadrado=altura*altura;
    double IMC=peso/alturaAlCuadrado;
    String resultado="Tu IMC es:"+IMC;
    JOptionPane.showMessageDialog(null,resultado);
    System.out.println(resultado);
  }
}
