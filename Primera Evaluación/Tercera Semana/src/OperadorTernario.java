public class OperadorTernario {
  public static void main(String[] args) {
    //Operador ternario
    //Pregunta?Valor si verdad:valor si falso
    int numero=10;
    //Para preguntas igualdad en matemáticas haríamos ¿numero=10?
    //En Java el igual de preguntar es ==
    int valor=numero==10?1:0;
    System.out.println(valor);
    int otroNumero=20;
    String salida=otroNumero==18?"Es 18":"No es 18";
    System.out.println(salida);
  }
}
