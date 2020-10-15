package SolucionesAntesTema3;

import javax.swing.*;

public class Sencillo3 {
  /*Escribe un programa java que pida un número entero al usuario.
  A continuación muestra un mensaje indicando si el valor del número
  introducido es positivo o negativo, si es par o impar, si es múltiplo de 7,
  si es múltiplo de 13y si es mayor o menor que 20.
  Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ).
   */
  public static void main(String[] args) {
    int numeroIntroducido=Integer.parseInt(JOptionPane.showInputDialog("Dime un número"));
    String salida="";
    salida+=numeroIntroducido>=0?"Es positivo\n":"Es negativo\n";
    salida+=numeroIntroducido%2==0?"Es par\n":"Es impar\n";
    if(numeroIntroducido%7!=0){
      salida+="No ";
    }
    //salida+=numeroIntroducido%7==0?"":"No ";
    salida+="Es múltiplo de 7\n";
    if(numeroIntroducido%13!=0){
      salida+="No ";
    }
    //salida+=numeroIntroducido%13==0?"":"No ";
    salida+="Es múltiplo de 13\n";
    if(numeroIntroducido>20){
      salida+="Es mayor que 20";
    } else if(numeroIntroducido<20){
      salida+="Es menor que 20";
    } else {
      salida+="Es igual a 20";
    }


    //salida+=numeroIntroducido>20?"Es mayor que 20":"";
    //salida+=numeroIntroducido<20?"Es menor que 20":"";

    JOptionPane.showMessageDialog(null,salida);

  }
}
