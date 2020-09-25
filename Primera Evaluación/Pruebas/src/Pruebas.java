import javax.swing.*;

public class Pruebas {
  public static void main(String[] args) {
    String a= JOptionPane.showInputDialog("Primera letra");
    String b= JOptionPane.showInputDialog("Segunda letra");
    String c= JOptionPane.showInputDialog("Tercera letra");
    String d= JOptionPane.showInputDialog("Cuarta letra");
    String salida=a+"  "+a+"  "+b+b+b+b+"   "+c+"          "+d+"\n";
    salida+=a+a+a+" "+b+"       "+b+" "+c+"      "+d+d+d+"\n";
    salida+=a+"  "+a+"  "+b+b+b+b+"   "+c+c+c+"      "+d+"  "+d+"\n";
    JOptionPane.showMessageDialog(null,salida);
    System.out.println(salida);
  }
}
