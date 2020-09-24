import javax.swing.*;

public class SaludoPersonal {
    public static void main(String[] args) {
        String promptAlUsuario;
        promptAlUsuario="Dime tu nombre";
        String entradaUsuario=JOptionPane.showInputDialog(promptAlUsuario);
        String saludo;
        saludo="Hola, "+entradaUsuario+", encantado.";
        JOptionPane.showMessageDialog(null,saludo);
    }
}
