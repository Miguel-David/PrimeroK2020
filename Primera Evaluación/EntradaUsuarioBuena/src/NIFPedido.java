public class NIFPedido {
  private final String cadena;
  NIFPedido(String cadena){
    this.cadena=cadena.toUpperCase();
  }
  String getCadena(){
    return cadena.substring(0,8)+"-"+cadena.charAt(8);
  }
  boolean esValida(){
    if(cadena.length()!=9){
      return false;
    }
    if(!tiene8Numeros()){
      return false;
    }
    return true;
  }
  boolean tiene8Numeros(){
    boolean vamosBienNumeros=true;
    for (int i = 0; i < 8; i++) {
      char c=cadena.charAt(i);
      if(!(c>='0' && c<='9')){
        vamosBienNumeros=false;
      }
    }
    return vamosBienNumeros;
  }

  public static void main(String[] args) {
    NIFPedido nif=new NIFPedido("333T3334U");
    System.out.println(nif.tiene8Numeros());
  }

}
