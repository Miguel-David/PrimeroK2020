public enum ColoresCeldas {
  NORMAL("style='border:3px solid white;padding:20px;border-collapse:joined;text-align:center;font-size:24px;font-family:Arial;background-color:#55DD88;'"),
  LADO("style='border:3px solid white;padding:20px;border-collapse:joined;text-align:center;font-size:24px;font-family:Arial;background-color:#226633;color:white'"),
  ESQUINA_IMPORTANTE("style='border:3px solid white;padding:20px;border-collapse:joined;text-align:center;font-size:24px;font-family:Arial;background-color:#000000;color:white'");

  private String estiloCSS;
  ColoresCeldas(String colores){
    this.estiloCSS=colores;
  }

  public String getEstiloCSS() {
    return estiloCSS;
  }
}
