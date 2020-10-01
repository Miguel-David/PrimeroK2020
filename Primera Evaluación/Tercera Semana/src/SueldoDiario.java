import javax.swing.*;

public class SueldoDiario {
  public static final int LIMITE_JORNADA=7;
  public static final int EUROS_HORA_NORMAL=10;
  public static final int EUROS_HORA_EXTRA=24;
  public static void main(String[] args) {
    int horasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog("¿Horas?"));
    boolean hayHorasExtras=horasTrabajadas>LIMITE_JORNADA;
    int horasExtra=hayHorasExtras?horasTrabajadas-LIMITE_JORNADA:0;
    int horasNormales=!hayHorasExtras?horasTrabajadas:LIMITE_JORNADA;

    int sueldoDiario=horasNormales*EUROS_HORA_NORMAL+horasExtra*EUROS_HORA_EXTRA;
    JOptionPane.showMessageDialog(null,"Te corresponden "+sueldoDiario+" €");
  }
}
