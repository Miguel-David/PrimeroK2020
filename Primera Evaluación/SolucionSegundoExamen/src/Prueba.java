public class Prueba {
  private String grupo;

  public static void main(String[] args) {


    String p="fpvplvfpl";
    int[] a={4,5,6,3,2};
    System.out.println(p.length());
    System.out.println(a.length);
    System.out.println("----------------------------");
    for (int i=0;i<10;i+=2){
      System.out.println(i);
    }
    System.out.println("----------------------------");
    for (int i=100;i>=0;i--){
      System.out.println(i);
    }
  }
  public String dameGrupo(){
    String sGrupo=this.grupo;
    return sGrupo;
    //sGrupo="";
  }
}
