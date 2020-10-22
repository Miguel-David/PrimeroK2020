import javax.swing.*;

public class PruebaLibros {
  public static void main(String[] args) {
    Libro libro1=ESLibro.pideLibroVentana();
    System.out.println(libro1.infoLibro());
    Libro libro2=ESLibro.pideLibroVentana();
    System.out.println(libro2.infoLibro());
    System.out.println(Libro.infoLibrosTotal());
    System.out.println("Préstamo de un libro");
    libro2.prestar();
    System.out.println(Libro.infoLibrosTotal());

  }
}
