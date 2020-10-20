public class ClinicaVet {
  public static void main(String[] args) {
    Perro toby=new Perro("Toby");
    toby.revisionAnual();
    toby.revisionAnual();
    System.out.println(toby.nombre + " tiene de años " + toby.getEdad());

    System.out.println(toby.nombre + " tiene de años " + toby.getEdad());

  }
}
