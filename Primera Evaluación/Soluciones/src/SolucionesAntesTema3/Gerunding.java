package SolucionesAntesTema3;

import javax.swing.*;

public class Gerunding {
  //Recibe una palabra y dice si es gerundio en inglés (termina en ing)
  public static void main(String[] args) {
    String entrada= JOptionPane.showInputDialog("Dime una palabra");
    int tamanyo=entrada.length();
    boolean esUltimaLetraUnaG=entrada.charAt(tamanyo-1)=='g' || entrada.charAt(tamanyo-1)=='G';
    boolean esPenultimaLetraUnaN=entrada.charAt(tamanyo-2)=='n';
    boolean esAntepenultimaLetraUnaI=entrada.charAt(tamanyo-3)=='i';

    String salida="La palabra "+entrada+ " ";
    if(esUltimaLetraUnaG && esPenultimaLetraUnaN && esAntepenultimaLetraUnaI){
      salida+="sí";
    } else {
      salida+="no";
    }
    salida+=" es un gerundio.";
    JOptionPane.showMessageDialog(null,salida);
  }
}
