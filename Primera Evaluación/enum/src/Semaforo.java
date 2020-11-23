public class Semaforo {
  ColorSemaforo colorSemaforo;

  public void setColorSemaforo(ColorSemaforo colorSemaforo) {
    this.colorSemaforo = colorSemaforo;
  }
  String significado(){
    return colorSemaforo.getMensaje();
  }
}
