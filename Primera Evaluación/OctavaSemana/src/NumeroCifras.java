public class NumeroCifras {
  //Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
  //Pensar porqué da igual el else
  public static int numeroCifras(int numero){
    if(numero>=0 && numero<=9){
       return 1;
    }
    if(numero>=10 && numero<=99){
      return 2;
    }
    if(numero>=100 && numero<=999){
      return 3;
    }
    if(numero>=1000 && numero<=9999){
      return 4;
    }
    return -1;
  }
  public static int numeroCifrasNatural(int numero){
    String numeroCadena=""+numero;
    return numeroCadena.length();
  }
}
