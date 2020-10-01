import javax.swing.*;

public class BooleanosBueno {
  public static void main(String[] args) {

    //Booleano admite solo Verdadero o falso (true o false)
    //Bankia quiere conceder prestamos
    //Pregunta el nombre de la persona y la saluda
    String nombreCliente= JOptionPane.showInputDialog("¿Nombre?");

    String saludo="Hola, "+nombreCliente+", encantado.";
    JOptionPane.showMessageDialog(null,saludo);
    //Criterio de Bankia menor de 25 años, no hay préstamo
    int edadCliente=Integer.parseInt(JOptionPane.showInputDialog("¿Edad?"));

    boolean tieneEdadSuficiente=edadCliente>=25;

    //Criterio: si tiene aval de 30000 euros al menos, sí se le da aunque sea menor de 25 años
    int aval=Integer.parseInt(JOptionPane.showInputDialog("¿Aval?"));
    boolean tienePerras=aval>=30000;

    boolean seConcedePrestamo=tieneEdadSuficiente || tienePerras;
    String concedido=seConcedePrestamo?"Concedido, "+nombreCliente:"Lo siento";
    JOptionPane.showMessageDialog(null,concedido);

    //Operadores lógicos
    // && And (y) --> Verdad si y solo si las dos condiciones son verdad
    // || Or  (y/o) --> Verdad si al menos una de las expresiones es verdad
    // ! Not (no) --> Devuelve el contrario




  }
}
