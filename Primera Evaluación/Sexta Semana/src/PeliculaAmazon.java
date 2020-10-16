public class PeliculaAmazon {
  private String titulo;
  private int clasificacion;
  private String director;
  private boolean dubbed;
  private int valoracion = -1; //No está valorada

  void setValoracion(int valoracion) {
    this.valoracion = valoracion;
  }

  boolean isDubbed() {
    return dubbed;
  }

  String getDirector() {
    return director;
  }

  void setClasificacion(int clasificacion) {
    this.clasificacion = clasificacion;
  }


  String getTitulo() {
    return titulo;
  }

  int getClasificacion() {
    return clasificacion;
  }

  String getClasificacionFrase() {
    String salida = "";
    salida += clasificacion <= 3 ? "Para todos los públicos" : "Apta para mayores de " + clasificacion;
    return salida;
  }

  boolean puedeVerPelicula(int edad) {
    return edad >= clasificacion;
  }

  PeliculaAmazon(String titulo, int clasificacion, String director, boolean doblada) {
    this.titulo = titulo;
    this.clasificacion = clasificacion;
    this.director = director;
    this.dubbed = doblada;
  }

  String valoracionEnBonico() {
    if (valoracion == -1) {
      return "No ha sido valorada todavía";
    }
    if (valoracion == 0) {
      return "☆☆☆☆☆";
    }
    if (valoracion == 1) {
      return "★☆☆☆☆";
    }
    if (valoracion == 2) {
      return "★★☆☆☆";
    }
    if (valoracion == 3) {
      return  "★★★☆☆";
    }
    if (valoracion == 4) {
      return "★★★★☆";
    }
    return "★★★★★";
  }

  String infoPelicula() {
    String salida = "";
    salida += "Título:" + titulo + "\n";
    salida += "Director:" + director + "\n";
    salida += getClasificacionFrase() + "\n";
    salida += valoracionEnBonico();
    return salida;
  }

  public static void main(String[] args) {
    PeliculaAmazon film = new PeliculaAmazon("Misión Imposible", 18, "Frank Sonatra", true);
    System.out.println(film.infoPelicula());
    //La veo y me gusta
    film.setValoracion(4);
    System.out.println(film.infoPelicula());
  }
}
