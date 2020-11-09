public class Vectores {
  public static void main(String[] args) {
    String[] palabras={"Ana","Ana","Ana","Ana","Ana"};
    palabras[3]="Delia";
    System.out.println(palabras.length);
    //Recorrido típico Antiguo ->Se hace cuando:
    //    ·Necesitamos modificar los valores del array
    //    ·Necesitamos un índice
    //Ejemplo: Pasar a mayúsculas las palabras (toUpperCase())
    for (int i = 0; i < palabras.length; i++) {
      palabras[i]=palabras[i].toUpperCase();
    }
    //Imprimir los valores del array con su posición
    for (int i = 0; i < palabras.length; i++) {
      System.out.println("Pos: "+i+" - "+palabras[i]);
    }
    //ForEach ->Si no necesitamos índice ni cambiamos el valor del array,
    //usamos el foreach para contar las que empiezan por A
    int empiezanPorA=0;
    for (String s:palabras) {
      if(s.charAt(0)=='A'){
        empiezanPorA++;
      }
    }
    System.out.println("Empiezan por A: " + empiezanPorA);
  }


}
