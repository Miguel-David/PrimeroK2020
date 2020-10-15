package SolucionesAntesTema3;

import javax.swing.*;

public class ParOImpar {
    public static void main(String[] args) {
        int numeroUsuario= Integer.parseInt(JOptionPane.showInputDialog("Dime un número"));
        boolean esPar;
        esPar=numeroUsuario%2==0;
        //Equivalente a:
        esPar=(numeroUsuario%2==0?true:false); //MUY MAL
        //Equivalente a:
        if(numeroUsuario%2==0){  //SI QUEREIS PERO NO MUY BIEN
            esPar=true;
            System.out.println(esPar);
        } else {
            esPar=false;
        }
        //Equivalente a:
        esPar=false;            //EMBROLLO INNECESARIO
        if(numeroUsuario%2==0){
            esPar=true;
        }
        //Equivalente a:
        if(numeroUsuario%2==0)  //SIEMPRE LLAVES ESTO ESTÁ MAL
            esPar=true;
        else
            esPar=false;
        //
        String salida;
        salida=esPar?"El número es par":"El número es impar";
        //Es equivalente a
        if(esPar==true){            //MUY MAL 
            salida="El número es par";
        } else {
            salida="El número es impar";
        }
        //Es equivalente a
        if(esPar){
            salida="El número es par";
        } else {
            salida="El número es impar";
        }
        JOptionPane.showMessageDialog(null,salida);
        salida="El número es ";
        salida+=esPar?"par":"impar";
        
    }
}
