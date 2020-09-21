import javax.swing.*;

public class EntradaUsuario {
    public static void main(String[] args) {
        String nombre=JOptionPane.showInputDialog("Dime tu nombre");
        JOptionPane.showMessageDialog(null,"Hola, "+nombre);
    }
}
