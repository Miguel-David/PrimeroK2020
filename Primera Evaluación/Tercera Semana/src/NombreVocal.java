
import javax.swing.*;

public class NombreVocal {
    //Pedir el nombre al usuario y decir si empieza por vocal
    public static void main(String[] args) {
        String nombre;
        nombre= JOptionPane.showInputDialog("Dime tu nombre");
        char inicial=nombre.charAt(0);
        boolean empiezaPorVocal=inicial=='A'
                             || inicial=='E'
                             || inicial=='I'
                             || inicial=='O'
                             || inicial=='U'
                             || inicial=='a'
                             || inicial=='e'
                             || inicial=='i'
                             || inicial=='o'
                             || inicial=='u'
                             || inicial=='á'
                             || inicial=='è'
                             || inicial=='ò';
        String salida=empiezaPorVocal?"Empieza por vocal":"Empieza por consonante";
        JOptionPane.showMessageDialog(null,empiezaPorVocal);
    }
}
