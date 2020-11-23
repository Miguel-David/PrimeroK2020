public enum ColorSemaforo {
  ROJO("No pasarás"),
  AMARILLO("Aminora"),
  VERDE("Pasa"),
  AZUL("ござじす");

  String mensaje;

  ColorSemaforo(String mensaje){
    this.mensaje=mensaje;
  }

  public String getMensaje() {
    return mensaje;
  }
}
