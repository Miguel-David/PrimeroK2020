import javax.swing.*;

public class ESAutor {
  static Autor pideAutorVentana(){
    Autor autorPorTeclado;
    String nombre= JOptionPane.showInputDialog("Nombre del autor?");
    String nacionalidad=JOptionPane.showInputDialog("Nacionalidad de: "+nombre);
    int anyoNacimiento=Integer.parseInt(JOptionPane.showInputDialog("Nacimiento"));
    int respuesta=JOptionPane.showConfirmDialog(null,"¿Está muerto?");
    if(respuesta==JOptionPane.YES_OPTION){
      int anyoMuerte=Integer.parseInt(JOptionPane.showInputDialog("Muerte"));
      autorPorTeclado=new Autor(nombre,nacionalidad,anyoNacimiento,anyoMuerte);
    } else {
      autorPorTeclado=new Autor(nombre,nacionalidad,anyoNacimiento);
    }
    return autorPorTeclado;
  }
}
