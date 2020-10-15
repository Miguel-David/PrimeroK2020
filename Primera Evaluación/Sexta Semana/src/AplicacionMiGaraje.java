import javax.swing.*;

public class AplicacionMiGaraje {
  public static void main(String[] args) {
    Coche pequenyo=new Coche("7673-TRE","Malva","Mini Chiquitín",430);
    Coche todoTerreno=new Coche("6565-EEE","Rojo","Jeep",20);
    System.out.println(pequenyo.informacionCoche());
    JOptionPane.showMessageDialog(null,pequenyo.informacionCoche());
    String salida=pequenyo.informacionCoche()+"\n"+todoTerreno.informacionCoche();
    JOptionPane.showMessageDialog(null,salida);
    String matriculasGaraje=pequenyo.getMatricula()+"\n"+todoTerreno.getMatricula();
    System.out.println(matriculasGaraje);
    pequenyo.setColor("Negro");



  }
}
