import javax.swing.*;

public class Rango {
  public static final int VALOR_MAXIMO=10;
  public static final int VALOR_MINIMO=1;
  public static void main(String[] args) {


    String prompt="Número entre el "+VALOR_MINIMO+" y el "+VALOR_MAXIMO;
    int numeroChico=Integer.parseInt(JOptionPane.showInputDialog(prompt));
    boolean esCorrecto=numeroChico>=VALOR_MINIMO && numeroChico<=VALOR_MAXIMO;
    boolean quiereTimarme=!esCorrecto;//También:numeroChico<1 || numeroChico>10;

    JOptionPane.showMessageDialog(null,quiereTimarme?"De que vas":"Eres buena persona");
    int numeroIntroducido=Integer.parseInt(JOptionPane.showInputDialog("Dime una decena"));
    boolean esDecena=numeroIntroducido % 10==0;
    String informacionDecena=esDecena?"Sí es una decena":"Te has equivocado";
    JOptionPane.showMessageDialog(null,informacionDecena);

  }
}
