public class Booleanos {
  public static void main(String[] args) {
    int edad=23;
    boolean esMayorDeEdad=edad>=18;
    int edadJubilacion=(edad>10?70:90);
    boolean esMenorDe60=edad<60?true:false; //Tontería
    if(edad<60){
      esMenorDe60=true;
    } else {
      esMenorDe60=false; //Otra tontería
    }
    if(esMayorDeEdad==true){ //Tontería
      System.out.println("Puede votar");
    } else {
      System.out.println("No puede votar");
    }
    String salida=esMayorDeEdad?"Puede conducir":"No puede conducir";
  }
}
