public class CoheteEspacial {
  public static void main(String[] args) {
    int tamanyo=6;
    int numeroEspacios=tamanyo;
    String s="";
    for (int i = 0; i < numeroEspacios; i++) {
      s+=" ";
    }
    s+="O\n";
    int numEstrellas=1;
    for (int i = 0; i < tamanyo; i++) {
      for (int j = 0; j < numeroEspacios; j++) {
        s+=" ";
      }
      for (int j = 0; j < numEstrellas; j++) {
        s+="*";
      }
      s+="\n";
      for (int j = 0; j < numeroEspacios; j++) {
        s+=" ";
      }
      numeroEspacios--;
      for (int j = 0; j < numEstrellas; j++) {
        s+="*";
      }
      s+="\n";
      numEstrellas+=2;
    }
    for (int j = 0; j < tamanyo-2; j++) {
      s+=" ";
    }
    s+="|||||";
    System.out.println(s);
  }
}
