import javax.swing.*;

public enum Palos {
  TREBOL('♣',Colores.NEGRO),
  PICAS('♠',Colores.NEGRO),
  CORAZONES('♥',Colores.ROJO),
  DIAMANTES('♦',Colores.ROJO);
  char simbolo;
  Colores color;

  Palos(char simbolo, Colores color) {
    this.simbolo = simbolo;
    this.color = color;
  }

  String getSimbolo(){
    return color.devuelveCaracter(this.simbolo);
  }

  public Colores getColor() {
    return color;
  }

  public static void main(String[] args) {
    Palos[] todos=Palos.values();
    for (Palos p: todos) {
      JOptionPane.showMessageDialog(null,"<html>"+p.getSimbolo());
    }
  }
}
