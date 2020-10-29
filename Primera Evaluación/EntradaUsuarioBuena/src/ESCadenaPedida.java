import javax.swing.*;

public class ESCadenaPedida {
  public static String pideCadena(String titulo){
    CadenaPedida c;
    String cadena;
    do{
      cadena=JOptionPane.showInputDialog(titulo);
      if(cadena==null){
        return null;
      }
      c=new CadenaPedida(cadena);
      if(!c.esValida()){
        JOptionPane.showMessageDialog(null,"No es válida");
      }
    } while(!c.esValida());
    return c.getCadena();

  }
}
