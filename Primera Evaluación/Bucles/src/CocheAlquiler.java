public class CocheAlquiler {
  private final String marca;
  private final String matricula;
  private String color;
  private int km;
  private boolean alquilado;
  private final int precio;

  CocheAlquiler(String marca,String matricula,String color,int precio){
    this.marca=marca;
    this.matricula=matricula;
    this.color=color;
    this.km=0;
    this.alquilado=false;
    this.precio=precio;
  }
  int getPrecio(){
    int precioReal;
    if(km>200000){
      System.out.println("Al ser un coche muy usado, Rebaja");
      precioReal=precio/2;
    } else {
      precioReal=precio;
    }
    return precioReal;
  }

  boolean isAlquilado(){
    return alquilado;
  }

  public int getKm() {
    return km;
  }

  void alquilar(){
    alquilado=true;
  }

  void devolver(int kmViaje){
    alquilado=false;
    km+=kmViaje;

  }

  String getMarca(){
    return marca;
  }
  String getMatricula(){
    return matricula;
  }

  String getColor(){
    return color;
  }

  void setColor(String color){
    this.color=color;
  }


  //Tenemos coches que se alquilan y se devuelven con un viaje hecho
  //Los coches a partir de 200000 km cuestan un 50% del precio original

}
