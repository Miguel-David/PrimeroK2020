import javax.swing.*;

public class DoblaTresNumeros {
    //Lee tres números del usuario y muestra sus dobles
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Primero?"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Segundo?"));
        int n3=Integer.parseInt(JOptionPane.showInputDialog("Tercero?"));
        int dobleN1=n1*2;
        int dobleN2=n2*2;
        int dobleN3=n3*2;
        String salida=""+dobleN1+dobleN2+dobleN3;
        String otraSalida="El doble de "+n1+" es: "+dobleN1+"\n";
        otraSalida+="El doble de "+n2+" es: "+dobleN2+"\n";
        otraSalida+="El doble de "+n3+" es: "+dobleN3;
        JOptionPane.showMessageDialog(null,salida);
        JOptionPane.showMessageDialog(null,otraSalida);
    }
}
