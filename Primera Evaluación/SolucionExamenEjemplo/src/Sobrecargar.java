public class Sobrecargar {
  //Sobrecargar un método es crear un método con el mismo nombre
  //que otro y con distintos argumentos

  public static void main(String[] args) {
    miMetodo();
    miMetodo("Perico");
    miMetodo(56);
    System.out.println(longitudAlImprimir("pepe"));
    System.out.println(longitudAlImprimir(45.6));
    //También puede cambiar el número de argumentos del método
    imprimeDinero(32);
    imprimeDinero(32,'$');

  }

  private static void imprimeDinero(int i, char c) {
    System.out.println("" + i + " " + c);
  }

  private static void imprimeDinero(int i) {
    imprimeDinero(i,'€');
  }

  private static int longitudAlImprimir(double v) {
    return longitudAlImprimir(""+v);
  }

  private static int longitudAlImprimir(String s) {
    return s.length();
  }


  private static void miMetodo(int i) {
    System.out.println("Me has pasado un entero");
  }

  private static void miMetodo(String s) {
    System.out.println("Me has pasado un String");
  }

  private static void miMetodo() {
    System.out.println("No me pasas argumentos");
  }
}
