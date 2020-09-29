import javax.swing.*;

public class RepartoMejorado {
  public static void main(String[] args) {
    int numeroPizzas=Integer.parseInt(JOptionPane.showInputDialog("¿Pizzas compradas?"));

    int numeroTrozos=numeroPizzas*8;
    int numeroPersonas=Integer.parseInt(JOptionPane.showInputDialog("¿Personas?"));
    int trozosParaCadaPersona=numeroTrozos/numeroPersonas;
    int trozosSobrantes=numeroTrozos % numeroPersonas;
    String salida="Tocan a "+trozosParaCadaPersona +"trozos por persona";
    //salida+=trozosSobrantes==0?" clavaos.":" y sobran "+trozosSobrantes+" trozos.";
    salida+=trozosSobrantes!=0?" y sobran "+trozosSobrantes+" trozos.":".";
    JOptionPane.showMessageDialog(null,salida);
  }
}
