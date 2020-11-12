public class PruebaPais {
  public static void main(String[] args) {
    PaisEuropeo espanya=new PaisEuropeo("España",1000);
    PaisEuropeo reinoUnido=new PaisEuropeo("Reino Unido",3000,"uk");
    espanya.aporta(3000);
    reinoUnido.aporta(5000);
    System.out.println("Hay "+PaisEuropeo.getFondoComun()+" en el fondo común");
    espanya.retira(9000);
    System.out.println("Hay "+PaisEuropeo.getFondoComun()+" en el fondo común");
    System.out.println(espanya.getNombre()+" categoría "+espanya.getCategoria());
  }
}

