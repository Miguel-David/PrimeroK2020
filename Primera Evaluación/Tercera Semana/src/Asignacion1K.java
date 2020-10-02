import javax.swing.*;

public class Asignacion1K {
    //Un alumno de 1K está en el grupo 2 si su apellido está entre
    //la c y la p y en el grupo 1 en otro caso
    //Programa que pide el apellido de un alumno y me dice en qué grupo está
    public static void main(String[] args) {
        String apellido= JOptionPane.showInputDialog("¿Primer apellido?");
        char inicialApellido=apellido.charAt(0);
        boolean posteriorALaC=(inicialApellido>='C');
        boolean anteriorALaP=(inicialApellido<='P');
        /*
        int numeroInicial=inicialApellido;
        System.out.println(numeroInicial);
        boolean posteriorALaC=(numeroInicial>=67);
        boolean anteriorALaP=(numeroInicial<=80);
        */

        boolean estaGrupo2=posteriorALaC && anteriorALaP;
        boolean estaGrupo1=!estaGrupo2;
        String mensaje=estaGrupo2?"Estás en el grupo 2":"Te toca Grupo 1";
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
