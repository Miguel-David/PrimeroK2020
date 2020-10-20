import javax.swing.*;

public class MuestraTablas {
  public static void main(String[] args) {
    TablaDeMultiplicar t9=new TablaDeMultiplicar(9);
    TablaDeMultiplicar t8=new TablaDeMultiplicar(8);
    TablaDeMultiplicar t7=new TablaDeMultiplicar(7);
    TablaDeMultiplicar t6=new TablaDeMultiplicar(6);
    TablaDeMultiplicar t3=new TablaDeMultiplicar(3);
    JOptionPane.showMessageDialog(null,t9.getTabla());
    TablaDeMultiplicar.setX(" por ");
    JOptionPane.showMessageDialog(null,t8.getTabla());
    JOptionPane.showMessageDialog(null,t7.getTabla());
    t6.setIgual(" es igual a");
    JOptionPane.showMessageDialog(null,t6.getTabla());
    JOptionPane.showMessageDialog(null,t3.getTabla());
  }
}
