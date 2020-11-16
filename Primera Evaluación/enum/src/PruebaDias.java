public class PruebaDias {
  public static void main(String[] args) {
    DiasSemana hoy=DiasSemana.LUNES;
    switch(hoy){
      case LUNES:
      case MARTES:
      case MIERCOLES:
      case JUEVES:
      case VIERNES:
        System.out.println("Día de diario. A estudiar");
        break;
      case SABADO:
      case DOMINGO:
        System.out.println("Descanso pero no para los estudiantes.");
        break;
    }
  }
}
