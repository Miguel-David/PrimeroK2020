import java.lang.reflect.Array;
import java.util.Arrays;

public class Panagrama {
  public static void main(String[] args) {
    String cadena="The quick brown fox jumps over the lazy dog";
    System.out.println(esPanagrama(cadena) ? "Sí es panagrana" : "No es panagrama");
  }

  private static boolean esPanagrama(String cadena) {
    cadena=cadena.toUpperCase();
    boolean[] aparecidas=new boolean[26];
    for (int i = 0; i < cadena.length(); i++) {
      char c=cadena.charAt(i);
      if(c>='A' && c<='Z') aparecidas[cadena.charAt(i)-'A']=true;
      System.out.println(c);
    }
    System.out.println(Arrays.toString(aparecidas));
    for (boolean esta:aparecidas) {
      if(!esta) return false;
    }

    return true;
  }
}
