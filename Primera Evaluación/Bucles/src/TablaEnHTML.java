import javax.swing.*;

public class TablaEnHTML {
  public static void main(String[] args) {
    int rows=3;
    int cols=5;
    String salida="";
    salida="<html><table border=1>";

      salida+="<tr>";
      //Añado columna


        salida+="<td width=30 height=30>Q</td>";
        salida+="<td width=30 height=30>U</td>";
        salida+="<td width=30 height=30>E</td>";
        salida+="<td width=30 height=30>S</td>";
        salida+="<td width=30 height=30>O</td>";


      salida+="</tr>";


    salida+="</table></html>";
    JOptionPane.showMessageDialog(null,salida);
  }
}
