public class Hucha {
  String nombreDueño;
  String proposito;
  int dineroDentro;

  Hucha(String nombre,String prop){
    nombreDueño=nombre;
    proposito=prop;
    dineroDentro=0;
  }


  void meterUnEuro(){
    dineroDentro++;
  }
  void meterDosEuros(){
    dineroDentro+=2;
  }
  void meterCincoEuros(){
    dineroDentro+=5;
  }

  String devuelveInformacion(){
    String salida="La hucha de " + nombreDueño + " tiene " + dineroDentro + "€";
    return salida;
  }
}
