public class TablaDeMultiplicar {
  private final int numero;
  private static boolean modoHTML=true;
  //Todas las tablas presenten el mismo símbolo para la multiplicación x,·,*
  private static String x="x";
  //Cada tabla puede tener un igual distinto =, <-,<--,<==,:=
  private String igual="=";

  TablaDeMultiplicar(int numero){
    this.numero=numero;
  }
  public static void setModoHTML(){
    TablaDeMultiplicar.modoHTML=true;
  }
  public static void setModoConsola(){
    TablaDeMultiplicar.modoHTML=false;
  }
  public String getTabla(){
    String salida="";
    if(modoHTML){
      salida+="<html><h1>"+"Tabla del "+numero+"</h1>";
      salida+="<pre>";
      salida+="1"+x+numero+igual+numero*1+"<br>";
      salida+="2"+x+numero+igual+numero*2+"<br>";
      salida+="3"+x+numero+igual+numero*3+"<br>";
      salida+="4"+x+numero+igual+numero*4+"<br>";
      salida+="</pre></html>";
    } else {
      salida+="Tabla del "+numero+"\n";
      salida+="1"+x+numero+igual+numero*1+"\n";
      salida+="2"+x+numero+igual+numero*2+"\n";
      salida+="3"+x+numero+igual+numero*3+"\n";
      salida+="4"+x+numero+igual+numero*4+"\n";
    }
    return salida;
  }

  public static void setX(String x){
    TablaDeMultiplicar.x=x;
  }
  public void setIgual(String igual){
    this.igual=igual;
  }

}
