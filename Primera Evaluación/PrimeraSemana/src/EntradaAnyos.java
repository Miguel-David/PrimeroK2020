import javax.swing.*;

public class EntradaAnyos {
    public static void main(String[] args) {
        int anyosIntroducidos=Integer.parseInt(JOptionPane.showInputDialog("¿Años?"));
        int edadFutura=anyosIntroducidos+30;
        String salida="Dentro de 30 años tendrás "+edadFutura;
        JOptionPane.showMessageDialog(null,salida);
    }
}
