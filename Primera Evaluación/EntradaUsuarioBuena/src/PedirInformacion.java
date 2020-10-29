import javax.swing.*;

public class PedirInformacion {
  //Programa que pide el nombre, apellidos y NIF y el usuario debe escribir algo
  //en cada ventana y puede pulsar cancelar en cualquier momento. Al cancelar
  //nos despedimos. Si todo está bien, saludamos
  public static void main(String[] args) {
    String nombre=ESCadenaPedida.pideCadena("Nombre");
    if(nombre==null){
      JOptionPane.showMessageDialog(null,"Adios, simpático");
      return;
    }
    String apellido=ESCadenaPedida.pideCadena("Apellido");
    if(apellido==null){
      JOptionPane.showMessageDialog(null,"Adios, simpático");
      return;
    }
    String NIF=ESNIFPedido.pideCadena();
    if(NIF==null){
      JOptionPane.showMessageDialog(null,"Adios, simpático");
      return;
    }
    String saludo="Hola "+nombre+" "+apellido+" su NIF es: "+NIF;
    JOptionPane.showMessageDialog(null,saludo);
  }

}
