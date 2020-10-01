import javax.swing.*;

public class Booleanos {
  public static void main(String[] args) {
    //Programa de ejemplo. NO HACER
    //Booleano admite solo Verdadero o falso (true o false)
    //Bankia quiere conceder prestamos
    //Pregunta el nombre de la persona y la saluda
    String nombreCliente= JOptionPane.showInputDialog("¿Nombre?");

    String saludo="Hola, "+nombreCliente+", encantado.";
    JOptionPane.showMessageDialog(null,saludo);
    //Criterio de Bankia menor de 25 años, no hay préstamo
    int edadCliente=Integer.parseInt(JOptionPane.showInputDialog("¿Edad?"));

    String concedido=edadCliente<25?"No hay préstamo.":"Sí hay préstamo";
    JOptionPane.showMessageDialog(null,concedido);

    //Criterio: si tiene aval de 30000 euros al menos, sí se le da aunque sea menor de 25 años
    int aval=Integer.parseInt(JOptionPane.showInputDialog("¿Aval?"));
    String concedido2=aval>=30000?"Sí hay préstamo":"No hay préstamo";
    JOptionPane.showMessageDialog(null,concedido2);



  }
}
