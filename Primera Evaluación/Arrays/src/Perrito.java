public class Perrito {
  private final String nombre;
  private final String raza;

  Perrito(String nombre,String raza){
    this.nombre=nombre;
    this.raza=raza;
  }

  public String getNombre() {
    return nombre;
  }

  public String getRaza() {
    return raza;
  }

  public String infoPerrito(){
    return nombre+" es un "+raza;
  }
}
