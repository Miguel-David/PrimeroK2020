import javax.swing.*;

public class CincoNumeros {
  public static final int NUM_NUMEROS=5;
  public static void main(String[] args) {
    int[] numerosIntroducidos=new int[NUM_NUMEROS];

    for (int i=0;i<numerosIntroducidos.length;i++) {
      numerosIntroducidos[i]=Integer.parseInt(JOptionPane.showInputDialog("¿Número:"+(i+1)));
    }
    JOptionPane.showMessageDialog(null,"Los has introducido en el siguiente orden:");
    mostrar(numerosIntroducidos);
  }
  public static void mostrar(int[] vector){
    int posicion=1;
    for (int numero:vector) {
      JOptionPane.showMessageDialog(null,"Posición "+(posicion++)+":"+numero);
    }
  }
}
