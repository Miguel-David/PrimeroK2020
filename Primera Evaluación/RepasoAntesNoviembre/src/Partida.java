public class Partida {
  private final int numeroOculto;
  private boolean finalizada;
  private int numeroIntentado;
  private int numerointentos=0;
  private static int record=6;
  private static String player="SIN RECORD";
  private static boolean nuevoRecord=false;

  static void setPlayer(String campeon){
    player=campeon;
  }

  Partida(){
    this.numeroOculto=(int)(Math.random()*100)+1;
    nuevoRecord=false;
  }
  static boolean hayNuevoRecord(){
    return nuevoRecord;
  }
  int getNumerosIntentados(){
    return numerointentos;
  }
  boolean haGanado(){
    return numeroOculto==numeroIntentado;
  }
  boolean isFinalizada(){
    if(numeroOculto==numeroIntentado){
      if(numerointentos<record){
        record=numerointentos;
        nuevoRecord=true;
      }
      return true;
    }
    if(numerointentos>6){
      return true;
    }
    return false;
  }
  void intentaNumero(int numero){
    numeroIntentado=numero;
    numerointentos++;
  }

  int getNumeroOculto(){
    return numeroOculto;
  }

  public static String getTitulo(){
    String salida="";
    salida+="<html><h1>";
    salida+="SUPERJUEGO DE ADIVINAR \uD83D\uDD2E</h1>";
    salida+="<h3 style='color:blue'>&copy; PrimeroK";
    salida+="</h3></html>";
    return salida;
  }
  public static String letreroInstrucciones(){
    String salida="";
    salida+="<html><h1>";
    salida+="\uD83D\uDCD6 INSTRUCCIONES</h1>";
    salida+="<h3 style='color:blue'>El número oculto está entre 1 y 100";
    salida+="</h3></html>";
    return salida;
  }

  public String informacionNumero() {
    String salida="<html>";
    if(numeroOculto>numeroIntentado){
      salida+="<h1 style='color:red'>❌</h1><h2 style='color:red'>El número oculto es mayor</h2>";
    } else if(numeroOculto<numeroIntentado){
      salida+="<h1 style='color:red'>❌</h1><h2 style='color:red'>El número oculto es menor</h2>";
    } else {
      salida+="<h1 style='color:green'>\uD83C\uDF86\uD83C\uDF7E</h1><h2 style='color:green'>CORRECTO</h2> con "+numerointentos;
    }
    salida+="</html>";
    return salida;
  }
  static String getRecord(){
    return "Por ahora el mejor es: "+player+" con "+record+" intentos";
  }
}
