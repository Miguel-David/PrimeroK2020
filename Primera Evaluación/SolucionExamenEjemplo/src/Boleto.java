class Boleto{
  public static void main(String[] args){
    int numeroPrimera=0;
    for(int i=0;i<10;i++){
      int numeroImp=numeroPrimera;
      for(int j=0;j<5;j++){
        if(numeroImp!=0){
          System.out.print(numeroImp+" ");
        } else {
          System.out.print("  ");
        }
        numeroImp+=10;
      }
      System.out.println();
      numeroPrimera++;
    }
  }
}
