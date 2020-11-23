public class Piramide {
  public static void main(String[] args) {
    int numfilas=5;
    int espacios=numfilas-1;
    int asteriscos=1;
    for (int i = 0; i < numfilas; i++) {
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < asteriscos; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }
      System.out.println();
      espacios--;
      asteriscos+=2;
    }
  }
}
