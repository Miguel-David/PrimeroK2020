

import javax.swing.*;

public class MayorDeTres {
  public static void main(String[] args) {
    int n1= Integer.parseInt(JOptionPane.showInputDialog("Primero?"));
    int n2= Integer.parseInt(JOptionPane.showInputDialog("Segundo?"));
    int n3= Integer.parseInt(JOptionPane.showInputDialog("Tercero?"));
    if(n1>n2){
      if(n1>n3){
        JOptionPane.showMessageDialog(null,n1);
      } else {
        JOptionPane.showMessageDialog(null,n3);
      }
    } else if(n2>n3){
      JOptionPane.showMessageDialog(null,n2);
    } else {
      JOptionPane.showMessageDialog(null,n3);
    }
    //Odiamos a Ana, Bea y Clara
    String nombre= JOptionPane.showInputDialog("Nombre?");
    if(nombre.equals("Ana")){
      JOptionPane.showMessageDialog(null,"Te odio");
    } else if(nombre.equals("Bea")){
      JOptionPane.showMessageDialog(null,"Te odio más que a Ana");
    } else if (nombre.equals("Clara")){
      JOptionPane.showMessageDialog(null,"Te odio poquito");
    } else {
      JOptionPane.showMessageDialog(null,"Te quiero");
    }

  }
}
