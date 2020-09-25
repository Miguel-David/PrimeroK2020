import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class RelojMinutos {
  //Cantidad pequeña en segundos y devuelve los minutos y segundos
  //Introduces 156 segundos
  //Devuelve 2 minutos y 36 segundos
  public static void main(String[] args) {
    int segundosTotales=Integer.parseInt(JOptionPane.showInputDialog("¿Segundos?"));
    int minutosTotales=segundosTotales/60;
    int segundosRestantes=segundosTotales % 60;
    String salida=segundosTotales+" segundos son "+minutosTotales+"' "+segundosRestantes+"\"";
    JOptionPane.showMessageDialog(null,salida);
  }
}
