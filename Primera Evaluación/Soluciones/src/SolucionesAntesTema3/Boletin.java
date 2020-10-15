package SolucionesAntesTema3;

import javax.swing.*;

public class Boletin {
    public static void main(String[] args) {
        String salida="";
        salida+="<html><pre>";
        salida+=" Boletín de notas de \"Programación\"<br>";
        salida+=" ------------------------------------<br>";
        salida+=" Evaluación Nota<br>";
        salida+=" ---------- ----<br>";
        salida+="  Primera     6<br>";
        salida+="</pre></html>";
        JOptionPane.showMessageDialog(null,salida);
    }
}
