public class Casillica {
  int numero;
  Casillica siguiente;
  Casillica(){
    numero=0;
  }

  public void setSiguiente(Casillica siguiente) {
    this.siguiente = siguiente;
  }

  void incrementar(){
    numero++;
    if(numero==10){
      numero=0;
      if(siguiente!=null) {
        siguiente.incrementar();
      }
    }
  }
  String devuelveCadena(){
    if(numero==3){
      return "E";
    }
    if(numero==5){
      return "S";
    }
    return ""+numero;
  }

  public static void main(String[] args) {
    Casillica c=new Casillica();
    for (int i = 0; i < 20; i++) {
      System.out.println(c.devuelveCadena());
      c.incrementar();
    }
  }
}
