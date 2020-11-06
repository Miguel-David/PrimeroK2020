import javax.swing.*;

public class Perrera {
  public static final int NUM_PERROS=5;
  public static void main(String[] args) {
    Perrito[] camada;
    camada=new Perrito[NUM_PERROS];
    for (int i = 0; i < camada.length; i++) {
      camada[i]=ESPerrito.pidePerrito();
    }
    String salida="TEnemos los siguientes perros:\n";
    for(Perrito p:camada){
      salida+=p.infoPerrito()+"\n";
    }

    JOptionPane.showMessageDialog(null,salida);

  }
}
