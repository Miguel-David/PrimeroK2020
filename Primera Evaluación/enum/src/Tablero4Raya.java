public class Tablero4Raya {
  Casilla[][] tablero;
  Tablero4Raya(){
    tablero=new Casilla[6][7];
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j]=Casilla.VACIA;
      }
    }
  }
}
