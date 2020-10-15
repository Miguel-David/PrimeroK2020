package SolucionesAntesTema3;

import javax.swing.*;

public class ParNatural {
  public static void main(String[] args) {
    String entradaUsuario = JOptionPane.showInputDialog("Dime un número");

    int tamanyo=entradaUsuario.length();
    System.out.println(entradaUsuario.charAt(tamanyo-1));
    char ultimo=entradaUsuario.charAt(tamanyo-1);
    boolean esPar=ultimo=='0'
            || ultimo=='2'
            || ultimo=='4'
            || ultimo=='6'
            || ultimo=='8';
    if(ultimo=='0'
            || ultimo=='2'
            || ultimo=='4'
            || ultimo=='6'
            || ultimo=='8'){
      esPar=true;
    } else {
      esPar=false;
    }

  }
}
