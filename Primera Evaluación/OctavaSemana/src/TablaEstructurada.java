public class TablaEstructurada {

  public static String devuelveTabla(int numero){
    String salida="";
    for (int i = 0; i < 10; i++) {
      salida+=devuelveFila(i+1,numero)+"\n";
    }
    return salida;
  }

  private static String devuelveFila(int fila,int numero) {
    return fila+"×"+numero+"="+fila*numero;
  }
}
