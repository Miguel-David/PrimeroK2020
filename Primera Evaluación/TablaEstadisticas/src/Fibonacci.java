public class Fibonacci {

  public static void main(String[] args) {
    int primero=1;
    int segundo=1;
    System.out.println(primero);
    System.out.println(segundo);
    for (int i = 0; i < 8; i++) {
      int actual=primero+segundo;
      System.out.println(actual);
      segundo=primero;
      primero=actual;
    }
    //Ahora fibonacci  hasta el 1000
    int actual=primero+segundo;
    while(actual<1000){
      System.out.println(actual);
      segundo=primero;
      primero=actual;
      //actual=primero+segundo;
    }
  }
}
