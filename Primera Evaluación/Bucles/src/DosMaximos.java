
import javax.swing.*;

public class DosMaximos {
  public static void main(String[] args) {
    int numeroIntroducido= Integer.parseInt(JOptionPane.showInputDialog("¿Número?"));
    int max=numeroIntroducido;
    numeroIntroducido= Integer.parseInt(JOptionPane.showInputDialog("¿Número?"));
    int segundoMax;
    if(numeroIntroducido>max){
      segundoMax=max;
      max=numeroIntroducido;
    } else {
      segundoMax=numeroIntroducido;
    }
    //Tenemos max, ysegundoMax ordenados
    while(numeroIntroducido!=0){
      numeroIntroducido= Integer.parseInt(JOptionPane.showInputDialog("¿Número?"));
      if(numeroIntroducido>max){
        segundoMax=max;
        max=numeroIntroducido;
      } else if(numeroIntroducido>segundoMax){
        segundoMax=numeroIntroducido;
      }
    }
    JOptionPane.showMessageDialog(null,"El máximo introducido es: "
            + max
            + "Y el segundo máximo es: "+segundoMax);

  }
}
