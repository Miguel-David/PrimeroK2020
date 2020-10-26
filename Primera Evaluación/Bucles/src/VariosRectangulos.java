import javax.swing.*;

public class VariosRectangulos {
  public static void main(String[] args) {
    RectanguloAsteriscos r=new RectanguloAsteriscos(6,6,'⚝');
    JOptionPane.showMessageDialog(null,r.pintaRectangulo());
  }
}
