public enum Casilla {
  VACIA(" ","#FFFFFF"),
  ROJA("●","#FF0000"),
  AMARILLA("●","#00FFFF");

  String simbolo;
  String color;
  Casilla(String simbolo,String color){
    this.simbolo=simbolo;
    this.color=color;

  }


}
