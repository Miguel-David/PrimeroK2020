public class TablaMultiplicar {
  private int numero;
  TablaMultiplicar(int numero){
    this.numero=numero;
  }
  public int getNumero(){
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }
  String devuelveTabla(){
    String salida="";
    for (int i = 0; i < 10; i++) {
      salida+=devuelveFila(i+1)+"\n";
    }
    return salida;
  }
  String devuelveFila(int numeroFila){
    //para la fila 6 y numero 8
    //6x8=48
    return numeroFila+"×"+numero+"="+numeroFila*numero;
  }
}
