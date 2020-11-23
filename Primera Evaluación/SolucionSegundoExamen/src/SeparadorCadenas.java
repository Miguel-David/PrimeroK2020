public class SeparadorCadenas {
  public static void main(String[] args) {
    String cadena="Dábale arroz a la zorra el abad";
    int longitud=4;
    int yaEscritosEnUnaLinea=0;
    for (int i = 0; i < cadena.length(); i++) {
      System.out.print(cadena.charAt(i));
      yaEscritosEnUnaLinea++;
      if(yaEscritosEnUnaLinea==longitud){
        System.out.println();
        yaEscritosEnUnaLinea=0;
      }
    }
    System.out.println();

    String cadenaRecortable=cadena;
    while(cadenaRecortable.length()>longitud){
      System.out.println(cadenaRecortable.substring(0, longitud));
      cadenaRecortable=cadenaRecortable.substring(longitud,cadenaRecortable.length());
    }
    System.out.println(cadenaRecortable);
    System.out.println(1.03 - 0.42);
    System.out.println(1.00 - 9 * 0.10);
  }
}
