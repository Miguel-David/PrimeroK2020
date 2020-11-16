public enum DayOfWeek {
  LUNES(TipoDiaSemana.DIARIO),
  MARTES(TipoDiaSemana.DIARIO),
  MIERCOLES(TipoDiaSemana.DIARIO),
  JUEVES(TipoDiaSemana.DIARIO),
  VIERNES(TipoDiaSemana.DIARIO),
  SABADO(TipoDiaSemana.FIN_DE_SEMANA),
  DOMINGO(TipoDiaSemana.FIN_DE_SEMANA);

  TipoDiaSemana tipo;

  DayOfWeek(TipoDiaSemana tipo){
    this.tipo=tipo;
  }

  public TipoDiaSemana getTipo() {
    return tipo;
  }
}
