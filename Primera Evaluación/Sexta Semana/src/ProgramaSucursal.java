public class ProgramaSucursal {
  public static void main(String[] args) {
    CuentaBancaria c;

    c=new CuentaBancaria("Juan");
    c.imprimirDatosEnPantalla();
    c.ingresar(100);
    c.retirar(150);
    c.imprimirDatosEnPantalla();
  }
}
