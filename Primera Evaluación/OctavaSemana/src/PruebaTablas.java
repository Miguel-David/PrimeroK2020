public class PruebaTablas {
  public static void main(String[] args) {
    TablaMultiplicar tabla=new TablaMultiplicar(8);
    System.out.println(tabla.devuelveTabla());
    tabla.setNumero(5);
    System.out.println(tabla.devuelveTabla());
    System.out.println(TablaEstructurada.devuelveTabla(3));
  }
}
