public class Hucha {
  private String forma;
  private int dineroActualCentimos;
  private String propietario;

  public String getForma() {
    return forma;
  }
  public String getPropietario() {
    return propietario;
  }
  String getDineroActual() {
    int euros=dineroActualCentimos/100;
    int centimos=dineroActualCentimos%100;
    String cadenaCentimos=""+centimos;
    String ceroAlPrincipio=centimos<10?"0":"";
    String salida=euros+"'"+ceroAlPrincipio+centimos;
    return salida;
  }

  void meterDineroEuros(int cantidad){
    this.dineroActualCentimos+=cantidad*100;
  }
  void meterDineroCentimos(int cantidad){
    this.dineroActualCentimos+=cantidad;
  }

  Hucha(String propietario, String forma){
    this.propietario=propietario;
    this.forma=forma;
    this.dineroActualCentimos=0;
  }

  String infoHucha(){
    return "La hucha "+forma+ " de "+propietario+" tiene "+getDineroActual() + "€";
  }

}
