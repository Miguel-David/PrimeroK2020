public class RepasoChar {
  public static void main(String[] args) {
    String s="123";
    char c='1';
    int a=c+34;
    char c2=(char)('2'+c);
    System.out.println(c2);
    System.out.println(a);
    String s2=s+a;
    System.out.println(s2);
    char primero=s.charAt(0);
    String mayus="ÄBC";
    System.out.println((char)(mayus.charAt(0) + 32));
  }
}
