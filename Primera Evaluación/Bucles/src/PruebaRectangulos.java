import javax.swing.*;

public class PruebaRectangulos {
  public static void main(String[] args) {
    //Deja elegir HTML o consola y pide el tamaño
    RectanguloAsteriscos r=new RectanguloAsteriscos();
    int respuesta=JOptionPane.showConfirmDialog(null,
            "¿Va a ser  un cuadrado?",
            "PREGUNTA",
            JOptionPane.YES_NO_OPTION
            );
    if(respuesta==JOptionPane.YES_OPTION){
      int lado=Integer.parseInt((JOptionPane.showInputDialog("¿Lado?")));
      r.setLadoCuadrado(lado);
    } else {
      int ancho=Integer.parseInt((JOptionPane.showInputDialog("¿Ancho?")));
      int alto=Integer.parseInt((JOptionPane.showInputDialog("¿Alto?")));
      r.setAncho(ancho);
      r.setAlto(alto);
    }
    int respuestaHTML=JOptionPane.showConfirmDialog(null,
            "¿Quiere salida en HTML?",
            "PREGUNTA",
            JOptionPane.YES_NO_OPTION
    );
    if(respuestaHTML==JOptionPane.YES_OPTION){
      RectanguloAsteriscos.ponModoHTML();
    } else {
      RectanguloAsteriscos.ponModoConsola();
    }
    r.setDibujito('⚝');
    JOptionPane.showMessageDialog(null,r.pintaRectangulo());
  }
}
