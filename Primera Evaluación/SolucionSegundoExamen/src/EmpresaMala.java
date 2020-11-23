import javax.swing.*;

class EmpresaMala{
  public static void main(String[] args) {

    String nombreMala="";
    int beneficiosMala=7777777;

    for(int i=0;i<5;i++){
      String nombre= JOptionPane.showInputDialog("Nombre?");
      int ingresos=Integer.parseInt(JOptionPane.showInputDialog("ingresos"));
      int gastos=Integer.parseInt(JOptionPane.showInputDialog("gastos"));
      if(ingresos-gastos<beneficiosMala){
        beneficiosMala=ingresos-gastos;
        nombreMala=nombre;
      }
    }
    System.out.println(nombreMala);
    System.out.println(beneficiosMala);
  }
}
