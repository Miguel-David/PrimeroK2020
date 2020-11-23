import javax.swing.*;

public enum MarcaCoche {
  FORD("EEUU","https://www.ford.es","img/ford.png"),
  SEAT("España","seat.es","img/seat.png"),
  LEXUS("Japón","http://lexus.jp","img/lexus.png"),
  NISSAN("Japón","http://nissan.com","img/nissan.png");
  //10000 imágenes

  String pais;
  String URL;
  String rutaImagen;
  MarcaCoche(String pais,String URL,String rutaImagen) {
    this.pais = pais;
    this.URL = URL;
    this.rutaImagen = rutaImagen;
  }

  public Icon getIcono() {
    ImageIcon icon = new ImageIcon(rutaImagen);
    return icon;
  }

  public String getPais() {
    return pais;
  }

  public String getURL() {
    return URL;
  }
  String infoHTML(){
    String cadena="<div><h1>"+this.name()+"</h1>";
    cadena+="<hr><ul><li>Es de "+this.getPais();
    cadena+="</li><li>La web es ";
    cadena+=this.getURL()+"</li></ul></div>";
    return cadena;
  }

  public static void main(String[] args) {
    MarcaCoche[] marcas=MarcaCoche.values();
    for (MarcaCoche m:marcas) {
      System.out.println(m.getPais());
    }
    ImageIcon icon = new ImageIcon("img/coche.png");

    MarcaCoche marcaElegida=(MarcaCoche)JOptionPane.showInputDialog(null,
            "Elija una marca",
            "Marcas",
            JOptionPane.QUESTION_MESSAGE,
            icon,
            marcas,
            marcas[0]);
    JOptionPane.showMessageDialog(null,"Elegiste "+marcaElegida+" que es de: "+marcaElegida.getPais());

    JOptionPane.showMessageDialog(null,
            "<html>"+marcaElegida.infoHTML(),
            "Marca",
            JOptionPane.QUESTION_MESSAGE,
            marcaElegida.getIcono());

  }


}
