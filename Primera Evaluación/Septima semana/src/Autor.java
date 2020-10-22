public class Autor {
  private final String nombre;
  private final String nacionalidad; //El 90% son españoles
  private final int anyoNacimiento;
  private int anyoMuerte=0;
  boolean estaMuerto;

  Autor(String nombre,String nacionalidad,int anyoNacimiento,int anyoMuerte){
    this.nombre=nombre;
    this.nacionalidad=nacionalidad;
    this.anyoNacimiento=anyoNacimiento;
    this.anyoMuerte=anyoMuerte;
    estaMuerto=true;
  }
  Autor(String nombre,String nacionalidad,int anyoNacimiento){
    this.nombre=nombre;
    this.nacionalidad=nacionalidad;
    this.anyoNacimiento=anyoNacimiento;
    this.anyoMuerte=2020;
    this.estaMuerto=false;
  }
  void defuncion(int anyoMuerte){
    this.anyoMuerte=anyoMuerte;
    estaMuerto=true;
  }
  String infoAutor(){
    String salida="";
    salida+=nombre+" nacido en ";
    if(anyoNacimiento<0){
      salida+=-anyoNacimiento+" a.C.";
    } else {
      salida+=anyoNacimiento;
    }

    if(estaMuerto){
      salida+=" muerto en "+anyoMuerte;
    } else {
      salida+=" actualmente vivo.";
    }
    return salida;

  }
}
