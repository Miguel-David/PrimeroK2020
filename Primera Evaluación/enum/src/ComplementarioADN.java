public class ComplementarioADN {
  public static void main(String[] args) {
    String cadena="ACTGCTA";
    for (int i = 0; i < cadena.length(); i++) {
      System.out.println(LetraADN.valueOf("" + cadena.charAt(i)).complementario);
    }
  }
}
