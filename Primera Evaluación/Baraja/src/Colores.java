import javax.swing.*;

public enum Colores {
  ROJO("<span style='color:red;font-size:32px'>","</span>"),
  NEGRO("<span style='color:black;font-size:32'>","</span>");
  String abrir;
  String cerrar;

  Colores(String abrir, String cerrar) {
    this.abrir = abrir;
    this.cerrar = cerrar;
  }

  String devuelveCaracter(char c){
    return abrir+c+cerrar;
  }
  String devuelveCaracter(String c){
    return abrir+c+cerrar;
  }

  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"<html>"+ROJO.devuelveCaracter('R'));
  }
}
