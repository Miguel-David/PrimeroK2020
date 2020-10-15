public class AhorrosFamilia {
  public static void main(String[] args) {
    Hucha huchaJuanito=new Hucha("Juanito","Cerdito");
    huchaJuanito.meterDineroEuros(45);
    huchaJuanito.meterDineroCentimos(65);
    huchaJuanito.meterDineroCentimos(40);
    huchaJuanito.meterDineroCentimos(45);
    System.out.println(huchaJuanito.infoHucha());
  }
}
