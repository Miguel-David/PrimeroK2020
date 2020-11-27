public enum Numeros {
  AS("A"),
  DOS("2"),
  TRES("3"),
  CUATRO("4"),
  CINCO("5"),
  SEIS("6"),
  SIETE("7"),
  OCHO("8"),
  NUEVE("9"),
  DIEZ("10"),
  JOTA("J"),
  REINA("Q"),
  REY("K");
  String valor;

  Numeros(String valor) {
    this.valor = valor;
  }

  public String getValor() {
    return valor;
  }
}
