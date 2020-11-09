import javax.swing.*;

public class LectorNumeros {
  //Programa que pedimos un número por teclado y lo escribe en letras
  //Dígito a dígito
  public static void main(String[] args) {
    //int numero=Integer.parseInt(JOptionPane.showInputDialog("Número a leer?"));
    int numero=30301123;
    String salida="";
    while(numero>9) {
      int ultimaCifra = numero % 10;
      numero = numero / 10;
      //Añade al principio de la cadena
      salida=numeroEnLetraInternacional(ultimaCifra,2)+" "+salida;
    }
    salida=numeroEnLetraInternacional(numero,2)+" "+salida;
    System.out.println(salida);
  }

  static String numeroEnLetraInternacional(int numero,int idioma){
    String[][] numerosLetra={
            {"CERO","UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE"},
            {"ZERO","ONE","TWO","THREE","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE"},
            {"ZERO","U","DOS","TRES","QUATRE","CINC","SIS","SIETE","OCHO","NUEVE"},
            {"CERO","UN","DOIX","TROIS","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE"}
    };
    return numerosLetra[idioma][numero];
  }

  static String numeroEnLetra(int numero) {
    String[] numerosLetra={"CERO","UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE"};
    return numerosLetra[numero];
  }
/*

  private static String numeroEnLetra(int numero) {
    String salida="";
    switch (numero){
      case 0:salida+="CERO ";
        break;
      case 1:salida+="UNO ";
        break;
      case 2:salida+="DOS ";
        break;
      case 3:salida+="TRES ";
        break;

      case 4:salida+="CUATRO ";
        break;
      case 5:salida+="CINCO ";
        break;
      case 6:salida+="SEIS ";
        break;
      case 7:salida+="SIETE ";
        break;
      case 8:salida+="OCHO ";
        break;
      case 9:salida+="NUEVE ";
        break;
      default:salida+=" No es un número ";
    }
    return salida;
  }

 */
}
