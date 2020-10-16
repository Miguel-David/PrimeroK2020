import javax.swing.*;

public class CampeonatoPokemon {
  public static void main(String[] args) {
    TipoPokemon pikachu=new TipoPokemon("Pikachu","Eléctrico");
    TipoPokemon raichu=new TipoPokemon("Raichu","Eléctrico");
    pikachu.setEvolucion(raichu);
    JOptionPane.showMessageDialog(null,"<html>"+pikachu.infoTipoPokemon());
    JOptionPane.showMessageDialog(null,"<html>"+raichu.infoTipoPokemon());
    String salida="<html>";
    salida+=pikachu.infoTipoPokemon();
    salida+="<h1>Que evoluciona en: </h1>";
    salida+= pikachu.getEvolucion().infoTipoPokemon();

    JOptionPane.showMessageDialog(null,salida);

  }
}
