public class TipoPokemon { //EJEMPLO MUY SIMPLE E IRREAL DE LOS POKEMON
                          //POKEMON DE 1ºK
  private String nombre;
  private String tipo;
  private TipoPokemon evolucion;
  TipoPokemon(String nombre,String tipo){
    this.nombre=nombre;
    this.tipo=tipo;
  }
  void setEvolucion(TipoPokemon evolucion){
    this.evolucion=evolucion;
  }
  String infoTipoPokemon(){
    String salida="";
    salida+="<h2>"+nombre+"</h2><h3>"+tipo+"</h3>";
    return salida;
  }
  TipoPokemon getEvolucion(){
    return evolucion;
  }
}
