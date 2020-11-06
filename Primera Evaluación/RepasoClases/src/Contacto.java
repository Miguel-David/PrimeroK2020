public class Contacto {
  private String nombre;
  private String apellidos;
  private Telefono telefono;
  private String email;
  String infoContacto(){
    String salida="";
    salida+=nombre+apellidos+"\n";
    Telefono.visualizacionPares();
    salida+=telefono.infoTelefono()+"\n";
    salida+=email;
    return salida;
  }
  Contacto(String nombre,String apellidos,Telefono telefono,String email){
    this.nombre=nombre.toUpperCase();
    this.apellidos=apellidos.toUpperCase();
    this.telefono=telefono;
    this.email=email.toLowerCase();
  }
  Contacto(String nombre,String apellidos,Telefono telefono){
    this(nombre,apellidos,telefono,"");
  }
  Contacto(String nombre, Telefono telefono){
    this(nombre,"",telefono);
  }
}
