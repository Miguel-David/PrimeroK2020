import javax.swing.*;

public class ESLibro {
  static Libro pideLibroVentana(){
    String titulo= JOptionPane.showInputDialog("Título Libro?");
    Autor autor=ESAutor.pideAutorVentana();
    String sinopsis=JOptionPane.showInputDialog("Sinopsis");
    Libro nuevo=new Libro(titulo,autor,sinopsis);
    return nuevo;
  }
}
