import javax.swing.*;
import java.awt.*;

public class ESTabla {
  public static void main(String[] args) {
    int[][] tabla={
            {1,20,3},
            {2,0,1},
            {4,220,1},
            {2,0,5}
    };
    JOptionPane.showMessageDialog(null,ESTabla.cadenaHTML(tabla,false));
    System.out.println((ESTabla.cadenaHTML(
            EstadisticasTabla.sumasParciales(tabla), true)));

  }

  public static String cadenaHTML(int[][] tabla) {
    return cadenaHTML(tabla,false);
  }

  public static String cadenaHTML(int[][] tabla,boolean marcada) {
    String salida="<html><table style='border:2px; border-color:white;'>";
    for(int i=0;i<tabla.length;i++){
      salida+="<tr>";
      for (int j = 0; j < tabla[i].length; j++) {
        if(marcada && (j==tabla[i].length-1 || i== tabla.length-1)) {
          if(j==tabla[i].length-1 && i== tabla.length-1){
            salida += "<td " + ColoresCeldas.ESQUINA_IMPORTANTE.getEstiloCSS() + " >"
                    + tabla[i][j] + "</td>";
          } else {
            salida += "<td " + ColoresCeldas.LADO.getEstiloCSS() + " >"
                    + tabla[i][j] + "</td>";
          }
        } else {
          salida += "<td " + ColoresCeldas.NORMAL.getEstiloCSS() + " >"
                  + tabla[i][j] + "</td>";
        }

      }
      salida+="</tr>";
    }
    return salida+"</table></html>";
  }

}
