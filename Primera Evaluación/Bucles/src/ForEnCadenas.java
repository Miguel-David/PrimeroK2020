import javax.swing.*;

public class ForEnCadenas {
  public static void main(String[] args) {
    String cadena= JOptionPane.showInputDialog("Cadena?");
    for(int i=0;i<cadena.length();i++){
      System.out.println(cadena.charAt(i));
    }
  }
}
