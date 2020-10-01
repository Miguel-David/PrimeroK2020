public class Tema2Ejercios {
  public static void main(String[] args) {
    // -a+5%b-a*a  a-2 b-4
    int a=2;
    int b=4;
    //-a+(5%b)-(a*a);
    //-2 + 1 - 4 -> -5
    System.out.println(-a + 5 % b - a * a);
    //5+3%7+b*a-b%a
    //5+3+8-0 ->16
    System.out.println(5 - 3 % 7 + b * a - b % a);
    //(a+1)*(b+1)-b/a ->13
    System.out.println((a + 1) * (b + 1) - b / a);
  }
}
