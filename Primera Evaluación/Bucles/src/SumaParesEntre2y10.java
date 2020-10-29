public class SumaParesEntre2y10 {
  public static void main(String[] args) {
    //Bucle. Hay que usarlo. 2+4+6+8+10=30
    int numeroActual=2;
    int suma=0;
    for (int i = 0; i < 5; i++) {
      suma+=numeroActual;
      numeroActual+=2;
    }
    System.out.println(suma);
    suma=0;
    for (int i = 2; i <= 10; i+=2) {
      suma+=i;
    }
    System.out.println(suma);
    suma=0;
    for (int i = 2; i <=10 ; i++) {
      if(i%2==0){
        suma+=i;
      }
    }
    System.out.println(suma);
    suma=0;
    numeroActual=2;
    while(numeroActual<=10){
      if(numeroActual%2==0){
        suma+=numeroActual;
      }
      numeroActual++;
    }
    
  }
}
