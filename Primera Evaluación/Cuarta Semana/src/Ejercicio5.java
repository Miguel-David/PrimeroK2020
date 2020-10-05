import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int edad=Integer.parseInt(JOptionPane.showInputDialog("¿Edad?"));
        int respuestaPermisoPaterno=
                JOptionPane.showConfirmDialog(null,"¿Tienes Permiso paterno?",null, JOptionPane.YES_NO_OPTION);
        boolean permisoPaterno=(respuestaPermisoPaterno==JOptionPane.YES_OPTION);
        int respuestaPermisoConducir=
                JOptionPane.showConfirmDialog(null,"¿Tienes Carnét?",null, JOptionPane.YES_NO_OPTION);
        boolean permisoConducir=(respuestaPermisoConducir==JOptionPane.YES_OPTION);
        /*a)Se puede conducir si se tiene entre 18 y 75 años de edad. A partir de 16 años se
        puede conducir si se tiene permiso paterno. En todo caso es necesario el permiso de conducir.
        */
        boolean puedeConducir;
        boolean edadBuena=edad>=18 && edad<=75;
        boolean conductorJoven=(edad>=16 && edad<18) && permisoPaterno;
        puedeConducir=(edadBuena || conductorJoven) && permisoConducir;
        String salida=puedeConducir?"Vamonos de viaje":"Una partidica a la Play";
        JOptionPane.showMessageDialog(null,salida);
    }
}
