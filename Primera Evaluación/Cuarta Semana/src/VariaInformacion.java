import javax.swing.*;

public class VariaInformacion {
    //Mostrar varias variables a la vez en showMessage
    public static void main(String[] args) {
        String nombre= JOptionPane.showInputDialog("¿Nombre?");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("¿Edad?"));
        String provinciaCadena=JOptionPane.showInputDialog(
                "¿Provincia? (A)licante (V)alencia (C)astellón (O)tra");
        char inicialProvincia=provinciaCadena.charAt(0);
        //LIAMOS
        String provincia=inicialProvincia=='A'?"Alicante":(
                inicialProvincia=='V'?"Valencia":(
                        inicialProvincia=='C'?"Castellón":"Otra"));
        // Salida no apropiada JOptionPane.showMessageDialog(null,nombre+edad+provincia);
        String salida="<html><h1>"+nombre+"</h1> "+edad+" "+provincia;
        JOptionPane.showMessageDialog(null,salida);
    }
}
