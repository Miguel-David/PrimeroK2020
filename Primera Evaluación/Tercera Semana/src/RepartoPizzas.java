import javax.swing.*;

public class RepartoPizzas {
  public static void main(String[] args) {
    //int numeroPizzas=Integer.parseInt(JOptionPane.showInputDialog("¿Pizzas compradas?"));
    int numeroPizzas=3;
    int numeroTrozos=numeroPizzas*8;
    int numeroPersonas=5;
    //Sabemos que salen 24 trozos
    //Sabemos que 24/5=4 trozos para cada uno
    //Sobran 4 trozos sin repartir
    int trozosParaCadaPersona=numeroTrozos/numeroPersonas;
    int trozosRepartidos=trozosParaCadaPersona*numeroPersonas;
    int trozosSobrantes=numeroTrozos-trozosRepartidos;
    String salida="Tocan a "+trozosParaCadaPersona +"trozos por persona";
    salida+=" y sobran "+trozosSobrantes+" trozos.";
    JOptionPane.showMessageDialog(null,salida);
  }
}
