public class Perro {
  String nombre;
  private int edad=0;
  Perro(String nombre){
    this.nombre=nombre;
  }

  int getEdad(){
    return edad;
  }

  void revisionAnual(){
    edad++;
  }
}
