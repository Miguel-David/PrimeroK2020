public class Escaque {
  private final boolean casillaBlanca;
  private char ficha;
  Escaque(boolean casillaBlanca){
    this(casillaBlanca,' ');
  }
  Escaque(boolean casillaBlanca,char ficha){
    this.casillaBlanca=casillaBlanca;
    this.ficha=ficha;
  }

  public void setFicha(char ficha) {
    this.ficha = ficha;
  }

  public String getColor() {
    return casillaBlanca?"#EEEEEE":"888888";
  }

  public char getFicha() {
    return ficha;
  }
}
