public enum TipoDiaSemana {
  FIN_DE_SEMANA("Día de descanso."),
  DIARIO("A trabajar.");
  String mensaje;
  TipoDiaSemana(String mensaje){
    this.mensaje=mensaje;
  }

  public String getMensaje() {
    return mensaje;
  }
}
