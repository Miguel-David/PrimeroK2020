import javax.swing.*;

public class PedirNumeros {
  public static void main(String[] args) {
    //Pedir 10 números de teclado. Decir cuánto suman
    int suma=0;
    for (int i = 0; i < 10; i++) {
      int numero=Integer.parseInt(JOptionPane.showInputDialog("Número?"));
      suma+=numero;
    }
    JOptionPane.showMessageDialog(null,"La suma es: "+suma);
    //Pedir números hasta que se introduzca un 0 y devolver la suma
    boolean debemosSeguir=true;
    int sumaOtra=0;
    while(debemosSeguir){
      int numero=Integer.parseInt(JOptionPane.showInputDialog("Número?"));
      sumaOtra+=numero;
      debemosSeguir=numero!=0;
    }
    JOptionPane.showMessageDialog(null,"La suma es: "+sumaOtra);
  }
}
