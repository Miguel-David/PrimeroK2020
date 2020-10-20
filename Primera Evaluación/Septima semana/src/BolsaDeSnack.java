//Ejemplo de constructor telescópico

public class BolsaDeSnack {
  private final String nombre;
  private int precio;
  private final int grasas; //Por defecto, valdrá 0
  private int iva; //Por defecto, valdrá 21
  private final boolean esPerjudicial; //Por defecto false

  BolsaDeSnack(String nombre,int precio,int grasas,int iva,boolean esPerjudicial){
    this.nombre=nombre;
    this.precio=precio;
    this.grasas=grasas;
    this.iva=iva;
    this.esPerjudicial=esPerjudicial;
  }
  BolsaDeSnack(String nombre,int precio,int grasas,int iva){
    this(nombre,precio,grasas,iva,false);
  }
  BolsaDeSnack(String nombre,int precio,int grasas){
    this(nombre,precio,grasas,21);
  }
  BolsaDeSnack(String nombre,int precio){
    this(nombre,precio,0);
  }
  /*
  BolsaDeSnack(String nombre,int precio,int grasas,int iva){
    this(nombre,precio,0,21,false);
  }
   */
  void ponEnOferta(int tantoPorCiento){
    precio=precio*(100-tantoPorCiento)/100;
    //Todas las bolsas rebajadas tienen de nombre Rebajado
    //nombre="Rebajado";
  }

}
