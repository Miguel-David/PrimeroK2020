import javax.swing.*;

public class EdadASemanasYDias {
  //Se pide una edad
  //Y se pasa a semanas y a días
  //Ejemplo: 2 años
  //2 años son 108 semanas y 2 días


  //Propuesta años*365 -->tengo los días
  //Dividimos entre 7 y tenemos las semanas
  //Dos posibilidades: Con el módulo y restando

  public static void main(String[] args) {
    int edadIntroducida= Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
    System.out.println(edadIntroducida);
    int diasIntroducidos=edadIntroducida*365;
    System.out.println("son " + diasIntroducidos + " dias");
    int semanasCalculadas=diasIntroducidos/7;
    System.out.println("son " + semanasCalculadas+" semanas");
    int diasCorrespondientesALasSemanasCalculadas=semanasCalculadas*7;
    int diasSobrantes=diasIntroducidos-diasCorrespondientesALasSemanasCalculadas;
    

  }


}
