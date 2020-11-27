import javax.swing.*;

public class Carta {
  Numeros numero;
  Palos palo;

  public Carta(Numeros numero, Palos palo) {
    this.palo = palo;
    this.numero = numero;
  }
  String devuelveHTML(){
    String salida="";
    salida+=palo.getColor().devuelveCaracter(numero.getValor())+palo.getSimbolo();
    return salida;
  }

  public static void main(String[] args) {
    Carta buena=new Carta(Numeros.AS,Palos.CORAZONES);
    JOptionPane.showMessageDialog(null,buena.devuelveHTML());
  }
}
