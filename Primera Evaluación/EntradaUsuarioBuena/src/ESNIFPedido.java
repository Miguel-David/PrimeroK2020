import javax.swing.*;

public class ESNIFPedido {
  public static String pideCadena(){
    NIFPedido c;
    String cadena;
    do{
      cadena= JOptionPane.showInputDialog("NIF");
      if(cadena==null){
        return null;
      }
      c=new NIFPedido(cadena);
      if(!c.esValida()){
        JOptionPane.showMessageDialog(null,"No es válida");
      }
    } while(!c.esValida());
    return c.getCadena();

  }
}
