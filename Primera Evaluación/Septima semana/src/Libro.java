public class Libro {
  private final String titulo;
  private final Autor autor;
  private final String sinopsis;
  private boolean prestado;
  private static int librosDisponibles;
  private static int totalLibros;

  Libro(String titulo,Autor autor,String sinopsis){
    this.titulo=titulo;
    this.autor=autor;
    this.sinopsis=sinopsis;
    this.prestado=false;
    librosDisponibles++;
    totalLibros++;
  }

  void prestar(){
    prestado=true;
    librosDisponibles--;
  }
  void devolver(){
    prestado=false;
    librosDisponibles++;
  }
  String infoLibro(){
    String salida="";
    salida+=titulo+"\n";
    salida+="Autor: "+autor.infoAutor()+"\n";
    salida+=prestado?"Actualmente está prestado.":"Disponible";
    return salida;
  }

  static String infoLibrosTotal(){
    String salida="";
    salida+="Tenemos "+totalLibros+" libros en la biblioteca.\n";
    salida+="Y de esos, "+(totalLibros-librosDisponibles)+" prestados";
    return salida;
  }

}
