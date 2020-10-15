

import javax.swing.*;

public class CuentaBancaria {
  private String propietario;
  private int saldo=0;
  private int movimientos=0; //El valor al crear la cuenta

  CuentaBancaria(String propietario){

    this.propietario=propietario;
  }

  void retirar(int cantidad){
    System.out.println("Oye! que quito dinero");
    movimientos++;
    saldo-=cantidad;
  }
  void ingresar(int cantidad){
    System.out.println("Bien. Añado dinero");
    movimientos++;
    saldo+=cantidad;
  }

  void decirSaldoEnPantalla(){
    System.out.println(saldo);
  }

  void imprimirDatosEnPantalla(){
    System.out.println("La cuenta de " + propietario + " tiene " + saldo + " €");
    System.out.println("Se han hecho " + movimientos + " movimientos.");
  }


}
