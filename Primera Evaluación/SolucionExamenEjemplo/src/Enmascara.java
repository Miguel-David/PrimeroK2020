class Enmascara{
  static String enmascara(String cadena){
    if(cadena.length()<=4){
      return cadena;
    }
    int cambios=cadena.length()-4;
    String salida="";
    for(int i=0;i<cambios;i++){
      salida+="#";
    }
    int ultima=cadena.length()-1;
    salida+=cadena.charAt(ultima-3);
    salida+=cadena.charAt(ultima-2);
    salida+=cadena.charAt(ultima-1);
    salida+=cadena.charAt(ultima-0);
    return salida;
  }

  public static void main(String[] args) {
    System.out.println(Enmascara.enmascara("4556364607935616"));
    System.out.println(Enmascara.enmascara("64607935616"));
    System.out.println(Enmascara.enmascara("1"));
    System.out.println(Enmascara.enmascara(""));
// "¿Cuál era el nombre de tu primera mascota?"
    System.out.println(Enmascara.enmascara("Skippy"));
    System.out.println(Enmascara.enmascara("Nanananananananananananananananananananan Batman!"));

  }
}
