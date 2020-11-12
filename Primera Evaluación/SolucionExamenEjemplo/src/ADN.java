class ADN{
  static String devuelveComplementario(String cadena){
    String salida="";
    for(int i=0;i<cadena.length();i++){
      char c=cadena.charAt(i);
      char sustituido;
      switch(c){
        case 'A':
          sustituido='T';
          break;
        case 'T':
          sustituido='A';
          break;
        case 'C':
          sustituido='G';
          break;
        case 'G':
          sustituido='C';
          break;
        default:
          sustituido='c';
          break;
      }
      salida+=sustituido;
    }
    return salida;
  }

  public static void main(String[] args) {
    System.out.println(ADN.devuelveComplementario("ATTGC"));
    System.out.println(ADN.devuelveComplementario("GTAT"));
  }
}
