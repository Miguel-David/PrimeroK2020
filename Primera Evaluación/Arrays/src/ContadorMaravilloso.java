public class ContadorMaravilloso {
  Casillica[] casillicas;

  ContadorMaravilloso(int numeroCasillas){
    casillicas=new Casillica[numeroCasillas];
    for (int i = 0; i < casillicas.length; i++) {
      casillicas[i]=new Casillica();
    }
    int casillaParaPonerSiguiente=casillicas.length-1;
    while(casillaParaPonerSiguiente!=0){
      Casillica siguiente=casillicas[casillaParaPonerSiguiente-1];
      casillicas[casillaParaPonerSiguiente].setSiguiente(siguiente);
      casillaParaPonerSiguiente--;
    }
  }
  int getMaximo(){
    return (int)Math.pow(10,casillicas.length);
  }
  void incrementa(){
    int ultimo=casillicas.length-1;
    casillicas[ultimo].incrementar();
  }
  String cadenaContador(){
    String salida="";
    for (Casillica c:casillicas) {
      salida+=c.devuelveCadena()+" - ";
    }
    return salida.substring(0,salida.length()-3);
  }

  public static void main(String[] args) {
    ContadorMaravilloso c=new ContadorMaravilloso(5);
    for (int i = 0; i < c.getMaximo(); i++) {
      System.out.println(c.cadenaContador());
      c.incrementa();
    }
  }
}
