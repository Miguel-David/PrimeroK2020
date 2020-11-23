public class CuentaKilometros {

    public static void main(String[] args) {
      ContadorMaravilloso c=new ContadorMaravilloso(10);
      for (int i = 0; i < c.getMaximo(); i++) {
        System.out.println(c.cadenaContador());
        c.incrementa();
      }
    }

}
