import javax.swing.*;

public class ESPerrito {
  public static Perrito pidePerrito(){
    String nombre= JOptionPane.showInputDialog("Nombre del perro");
    String raza=JOptionPane.showInputDialog("Raza del perro");
    return new Perrito(nombre,raza);
  }
}
