class Empresa{
  private final String nombre;
  private int ingresos;
  private int gastos;
  private static int numeroEmpresas;

  Empresa(String nombre){
    this(nombre,0,0);
  }

  Empresa(String nombre, int ingresos,int gastos){
    this.nombre=nombre;
    this.ingresos=ingresos;
    this.gastos=gastos;
    numeroEmpresas++;
  }

  static int devuelveImpuesto(){
    if(numeroEmpresas<10){
      return 5;
    }
    if(numeroEmpresas<=20){
      return 10;
    }
    return 20;
  }
  int pagoImpuestos(){
    if(ingresos<gastos){
      return 0;
    }
    int beneficios=ingresos-gastos;
    return beneficios*devuelveImpuesto()/100;
  }
}
