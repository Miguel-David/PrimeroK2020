import javax.swing.*;

public class ProgramaJava {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"Tamaño args es:"+args.length);
    for (String s:args) {
      JOptionPane.showMessageDialog(null,s);
    }
  }
}
