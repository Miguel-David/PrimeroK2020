import javax.swing.*;

public class PreguntasBooleanas {
    public static void main(String[] args) {
        //boolean pregunta=Boolean.parseBoolean(JOptionPane.showInputDialog("¿Estás casado?")); No se debe preguntar así
        int seleccionado=JOptionPane.showConfirmDialog(null,"¿Estás casado?",null,JOptionPane.YES_NO_OPTION);
        boolean estaCasado=(seleccionado==JOptionPane.YES_OPTION);
        System.out.println(estaCasado);

    }
}
