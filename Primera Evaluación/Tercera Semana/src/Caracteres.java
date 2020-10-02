import javax.swing.*;

public class Caracteres {
    public static void main(String[] args) {
        String nombre= JOptionPane.showInputDialog("¿Nombre?");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("¿Edad?"));
        String mensaje="¿Tienes coche? [S]í o [N]o";
        String respuesta=JOptionPane.showInputDialog(mensaje);
        char primeraLetraRespuesta=respuesta.charAt(0);
        boolean tieneCoche=(primeraLetraRespuesta=='S' || primeraLetraRespuesta=='s');
        boolean esMayorDeEdad=(edad>=18);
        boolean estaContratado=tieneCoche && esMayorDeEdad;
        String mensajeUsuario=estaContratado?"¡Enhorabuena!":"Ya te llamaremos";
        JOptionPane.showMessageDialog(null,mensajeUsuario);
    }
}
