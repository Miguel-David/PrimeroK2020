import javax.swing.*;

public class PruebasAutores {
  public static void main(String[] args) {
    Autor autor=ESAutor.pideAutorVentana();
    Autor autor2=ESAutor.pideAutorVentana();
    System.out.println(autor.infoAutor());
    System.out.println(autor2.infoAutor());
  }
}
