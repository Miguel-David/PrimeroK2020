import javax.swing.*;

public class ArrayChar {
  public static void main(String[] args) {
    char[] letras={
            'a','e','i','o','u'
    };
    for (char c:letras) {
      System.out.println(c);
    }
    //Leer una cadena y contar el número de as que hay
    String cadenaLeida= JOptionPane.showInputDialog("¿Cadena?");
    char[] caracteres=cadenaLeida.toCharArray();
    int as=0;
    for (char c:caracteres) {
      if(c=='a'){
        as++;
      }
    }
    JOptionPane.showMessageDialog(null,"Hay "+as+" as en "+cadenaLeida);

  }
}
