public class CifrasAlreves {
  public static int cifrasAlReves(int numero){
    String elNumero=""+numero;
    String salida="";

    /*for (int i=0;i<elNumero.length();i++) {
      //Añadir al principio
      salida=elNumero.charAt(i)+salida;
    }*/
    /*int posicionAnyadir=elNumero.length()-1;
    for (int i=0;i<elNumero.length();i++) {
      salida+=elNumero.charAt(posicionAnyadir--);
    }
    */

    for (int i=elNumero.length()-1;i>=0;i--) {
      salida+=elNumero.charAt(i);
    }

    return Integer.parseInt(salida);
  }
  public static void imprimeParaAbajo(int numero){
    //Imprime un número en vertical
    String elNumero=""+numero;

    for (int i=0;i<elNumero.length();i++) {
      System.out.println(elNumero.charAt(i));
    }

  }
}
