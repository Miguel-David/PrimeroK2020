public class RectanguloAsteriscos {
  private int ancho;
  private int alto;
  private char dibujito='*';

  private static boolean modoHTML=true;

  RectanguloAsteriscos(int ancho,int alto,char dibujito){
    this.ancho=ancho;
    this.alto=alto;
    this.dibujito=dibujito;
  }

  RectanguloAsteriscos(int ancho,int alto){
    this(ancho,alto,'*');
  }

  RectanguloAsteriscos(int longitudCuadrado){
    this(longitudCuadrado,longitudCuadrado);
  }
  RectanguloAsteriscos(){
    this(0);
  }

  String pintaRectangulo(){
    String salida="";
    if(modoHTML){
      salida+="<html><pre style='font-size:48px;color:red;'>";
    }
    String saltoDeLinea=modoHTML?"<br>":"\n";

    //Tantas veces como alto sea
    for (int i=0;i<alto;i++) {
      salida+=pintaLinea();
      salida+=saltoDeLinea;
    }

    if(modoHTML){
      salida+="</pre></html>";
    }
    return salida;
  }

  String pintaLinea(){
    String salida="";
    for (int i = 0; i < ancho; i++) {
      salida+=dibujito;
    }
    return salida;
  }

  public static boolean isModoHTML() {
    return modoHTML;
  }

  public static void ponModoHTML() {
    RectanguloAsteriscos.modoHTML = true;
  }
  public static void ponModoConsola() {
    RectanguloAsteriscos.modoHTML = false;
  }

  public void setLadoCuadrado(int lado){
    this.ancho=lado;
    this.alto=lado;
  }

  public int getAncho() {
    return ancho;
  }

  public void setAncho(int ancho) {
    this.ancho = ancho;
  }

  public int getAlto() {
    return alto;
  }

  public void setAlto(int alto) {
    this.alto = alto;
  }

  public void setDibujito(char dibujitoNuevo){
    dibujito=dibujitoNuevo;
  }

  public char getDibujito(){
    return dibujito;
  }
}

