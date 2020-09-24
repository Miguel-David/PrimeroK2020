import javax.swing.*;

public class SaludoFormal {
    public static void main(String[] args) {
        String nombreUsuario=JOptionPane.showInputDialog("¿Nombre?");
        String primerApellido=JOptionPane.showInputDialog("¿Primer Apellido?");
        String segundoApellido=JOptionPane.showInputDialog("¿Segundo Apellido?");
        String respuesta;
        respuesta=primerApellido+" "+segundoApellido+", "+nombreUsuario;
        JOptionPane.showMessageDialog(null,respuesta);
    }
}
