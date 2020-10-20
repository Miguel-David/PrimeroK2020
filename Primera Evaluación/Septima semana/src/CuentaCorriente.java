public class CuentaCorriente {
  private final String IBAN;
  private final String titular;
  private int saldo; //Por Defecto, 0
  private int numeroOperacionesRealizadas=0;
  private static int numeroCuentas=0;
  private static int depositoEnBanco=0;


  public CuentaCorriente(String IBAN,String titular,int saldo){
    this.IBAN=IBAN;
    this.titular=titular;
    this.saldo=saldo*100;
    numeroCuentas++;
    depositoEnBanco+=saldo*100;
  }


  public CuentaCorriente(String IBAN,String titular){
    this(IBAN,titular,0);
  }
  public String getSaldo(){
    return ""+saldo/100+"."+saldo%100+" €";
  }

  String infoCC(){
    String salida="IBAN:"+IBAN+" "+"Titular: "+titular+"\n";
    salida+="Saldo:"+getSaldo()+" Operaciones Realizadas: "+numeroOperacionesRealizadas;
    return salida;
  }

  void ingresar(int cantidad){
    saldo+=cantidad*100;
    numeroOperacionesRealizadas++;
    depositoEnBanco+=cantidad*100;
  }
  void retirar(int cantidad){
    saldo-=cantidad*100;
    numeroOperacionesRealizadas++;
    depositoEnBanco-=cantidad*100;
  }

  static int getNumeroCuentas(){
    return numeroCuentas;
  }
  static int getDepositoEnBanco(){
    return depositoEnBanco;
  }

}
