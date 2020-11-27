import javax.swing.*;
import java.util.Collections;
import java.util.Random;

public class Baraja {
  Carta[] cartas;

  public Baraja() {
    this.cartas = new Carta[52];
    int insercion=0;
    for (Palos p:Palos.values()) {
      for (Numeros n:Numeros.values()) {
        this.cartas[insercion++]=new Carta(n,p);
      }
    }
  }



  public void barajar(){
    int n = cartas.length;
    Random random = new Random();
    // Loop over array.
    for (int i = 0; i < cartas.length; i++) {
      // Get a random index of the array past the current index.
      // ... The argument is an exclusive bound.
      //     It will not go past the array's end.
      int randomValue = i + random.nextInt(n - i);
      // Swap the random element with the present element.
      Carta randomElement = cartas[randomValue];
      cartas[randomValue] = cartas[i];
      cartas[i] = randomElement;
    }
  }

  public static void main(String[] args) {
    Baraja b=new Baraja();

    b.barajar();

    String manoPoquer=b.cartas[0].devuelveHTML()+
            b.cartas[1].devuelveHTML()+
            b.cartas[2].devuelveHTML()+
            b.cartas[3].devuelveHTML()+
            b.cartas[4].devuelveHTML();
    JOptionPane.showMessageDialog(null,"<html>"+manoPoquer);

  }
}
