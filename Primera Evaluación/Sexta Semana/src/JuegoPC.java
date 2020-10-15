public class JuegoPC {
  private String nombre;
  private String tipo;
  private int PEGI;

  String getNombre(){
    return nombre;
  }

  JuegoPC(String nombre,String tipo,int PEGI){
    this.nombre=nombre;
    this.tipo=tipo;
    this.PEGI=PEGI;
  }

}
