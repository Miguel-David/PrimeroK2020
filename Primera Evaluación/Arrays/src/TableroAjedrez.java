import javax.swing.*;

public class TableroAjedrez {
  Escaque[][] escaques=new Escaque[8][8];
  TableroAjedrez(){
    boolean color=true;
    for (int i = 0; i < escaques.length; i++) {
      boolean colorTemporal=color;
      for (int j = 0; j < escaques[i].length; j++) {
        escaques[i][j]=new Escaque(colorTemporal);
        colorTemporal=!colorTemporal;
      }
      color=!color;
    }
    escaques[0][0].setFicha('♜');
    escaques[0][1].setFicha('♞');
    escaques[0][2].setFicha('♝');
    escaques[0][3].setFicha('♛');
    escaques[0][4].setFicha('♚');
    escaques[0][5].setFicha('♝');
    escaques[0][6].setFicha('♞');
    escaques[0][7].setFicha('♜');
    escaques[1][0].setFicha('♟');
    escaques[1][1].setFicha('♟');
    escaques[1][2].setFicha('♟');
    escaques[1][3].setFicha('♟');
    escaques[1][4].setFicha('♟');
    escaques[1][5].setFicha('♟');
    escaques[1][6].setFicha('♟');
    escaques[1][7].setFicha('♟');


    escaques[6][0].setFicha('♙');
    escaques[6][1].setFicha('♙');
    escaques[6][2].setFicha('♙');
    escaques[6][3].setFicha('♙');
    escaques[6][4].setFicha('♙');
    escaques[6][5].setFicha('♙');
    escaques[6][6].setFicha('♙');
    escaques[6][7].setFicha('♙');
    escaques[7][0].setFicha('♖');
    escaques[7][1].setFicha('♘');
    escaques[7][2].setFicha('♗');
    escaques[7][3].setFicha('♕');
    escaques[7][4].setFicha('♔');
    escaques[7][5].setFicha('♗');
    escaques[7][6].setFicha('♘');
    escaques[7][7].setFicha('♖');


  }
  void movimiento(int filaInicial,int ColumnaInicial,int filaFinal,int columnaFinal){
    char ficha=escaques[filaInicial][ColumnaInicial].getFicha();
    escaques[filaInicial][ColumnaInicial].setFicha(' ');
    escaques[filaFinal][columnaFinal].setFicha(ficha);
  }

  private String html() {
    String salida="<html><table  style='font-weight:ligth;font-family: Courier;border:1px solid black;font-size:32px'>";
    for (int i = 0; i < escaques.length; i++) {
      salida+="<tr>";
      for (int j = 0; j < escaques[i].length; j++) {
        salida+="<td style='text-align:center;width:50px;background-color:"+escaques[i][j].getColor()+";'>";
        salida+=escaques[i][j].getFicha();
        salida+="</td>";
      }
      salida+="</tr>";
    }
    salida+="</table></html>";
    return salida;
  }

  public static void main(String[] args) {
    TableroAjedrez tablero=new TableroAjedrez();
    JOptionPane.showMessageDialog(null,tablero.html());
    tablero.movimiento(6,3,4,3);
    JOptionPane.showMessageDialog(null,tablero.html());
    tablero.movimiento(0,1,2,0);
    JOptionPane.showMessageDialog(null,tablero.html());

  }

}