public class Ventanilla {
  public static void main(String[] args) {

    CuentaCorriente c1=new CuentaCorriente("32321-4343","Juan");
    CuentaCorriente c2=new CuentaCorriente("65343-1222","Ana");
    c1.ingresar(3);
    c2.ingresar(5);
    System.out.println(c1.infoCC());
    System.out.println(c2.infoCC());
    System.out.println(CuentaCorriente.getNumeroCuentas());
    System.out.println(CuentaCorriente.getDepositoEnBanco());


  }
}
