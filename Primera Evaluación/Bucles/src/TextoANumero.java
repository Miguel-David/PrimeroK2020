import javax.swing.*;

public class TextoANumero {
  public static void main(String[] args) {
    String notaTexto= JOptionPane.showInputDialog("¿Nota?");
    int notaNumero=0;
    switch (notaTexto){
      case "uno":notaNumero=1;
        break;
      case "dos":notaNumero=2;
      break;
      case "tres":notaNumero=3;
      break;
      default:JOptionPane.showMessageDialog(null,"No te he entendido");
    }
    JOptionPane.showMessageDialog(null,"La nota es un "+notaNumero);
  }
}
