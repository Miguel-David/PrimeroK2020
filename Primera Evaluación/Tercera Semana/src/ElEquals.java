public class ElEquals {
  public static void main(String[] args) {
    boolean iguales=!(3==5);
    System.out.println(iguales);
    int a=5;
    int b=12;

    System.out.println(a == b);
    String nombre="Ana";
    String otroNombre="Bea";
    otroNombre=nombre;
    System.out.println(nombre.equals(otroNombre));
  }
}
