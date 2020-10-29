public class CadenaPedida {
  private final String cadena;
  CadenaPedida(String cadena){
    this.cadena=cadena;
  }
  String getCadena(){
    return cadena.substring(0,1).toUpperCase()+cadena.substring(1).toLowerCase();
  }
  boolean esValida(){
    if(cadena.length()<2){
      return false;
    }
    if(tieneNumeros()){
      return false;
    }
    return true;
  }
  boolean tieneNumeros(){
    for (int i = 0; i < cadena.length(); i++) {
      if(cadena.charAt(i)>='0' && cadena.charAt(i)<='9'){
        return true;
      }
    }
    return false;
  }
}
