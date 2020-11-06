public class ExplicaciónArrays {
  //Arrays también se llaman arreglos, vectores, matrices
  public static void main(String[] args) {
    int a=6;
    int[] numeros;
    numeros=new int[5];
    System.out.println(numeros[3]);
    numeros[2]=4; //para poner números
    String[] frase={
            "En","un","lugar","de"
    };
    System.out.println(frase[2]);
    String[] frase2={"pepe","juan","luis"};
    System.out.println(frase.length);
    //Último elemento del array
    System.out.println(frase2[frase2.length - 1]);
    System.out.println("Periquito".length());
  }
}
