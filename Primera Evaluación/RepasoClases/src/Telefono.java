import java.awt.font.TextLayout;

public class Telefono {
  private String numero;
  private boolean esMovil=true;
  private String prefijo="+34";
  private static boolean visualizacionPares=true;

  String getNumero(){
    if(visualizacionPares){
      String salida="";
      salida+=""+numero.charAt(0)+numero.charAt(1)+numero.charAt(2)+" ";
      salida+=""+numero.charAt(3)+numero.charAt(4)+" ";
      salida+=""+numero.charAt(5)+numero.charAt(6)+" ";
      salida+=""+numero.charAt(7)+numero.charAt(8);
      return salida;
    } else {
      String salida="";
      salida+=""+numero.charAt(0)+numero.charAt(1)+numero.charAt(2)+" ";
      salida+=""+numero.charAt(3)+numero.charAt(4)+numero.charAt(5)+" ";
      salida+=""+numero.charAt(6)+numero.charAt(7)+numero.charAt(8);
      return salida;
    }
  }

  String infoTelefono(){
    if(esMovil && prefijo.equals("+34")){
      return getNumero();
    }
    if(!esMovil){
      return "("+prefijo+") "+getNumero()+" (fijo)";
    }
    return "("+prefijo+") "+getNumero();
  }

  public static void main(String[] args) {
    Telefono mio=new Telefono("666777888");
    Telefono otro=new Telefono("968238753",false);
    System.out.println(mio.infoTelefono());
    System.out.println(otro.infoTelefono());
    Telefono.setVisualizacionTrios();
    System.out.println(mio.infoTelefono());
    System.out.println(otro.infoTelefono());
  }

  public static void visualizacionPares(){
    visualizacionPares=true;
  }
  public static void setVisualizacionTrios(){
    visualizacionPares=false;
  }








  Telefono(String numero){
    this.numero=numero;
  }
  Telefono(String numero,boolean esMovil){
    this.numero=numero;
    this.esMovil=esMovil;
  }
  Telefono(String numero,String prefijo){
    this.numero=numero;
    this.prefijo=prefijo;
  }
  Telefono(String numero,String prefijo,boolean esMovil){
    this.numero=numero;
    this.prefijo=prefijo;
    this.esMovil=esMovil;
  }
}
