import javax.swing.*;

public class JuegoAdivinarNumero {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,Partida.getTitulo());
    while(true) { //Bucle infinito, otra forma es for(;;)
      JOptionPane.showMessageDialog(null,Partida.letreroInstrucciones());
      Partida p=new Partida();
      System.out.println(p.getNumeroOculto());
      while(!p.isFinalizada()){
        int numeroLeido=Integer.parseInt(JOptionPane.showInputDialog("Tu Número"));
        p.intentaNumero(numeroLeido);
        JOptionPane.showMessageDialog(null,p.informacionNumero());
      }
      if(!p.haGanado()){
        JOptionPane.showMessageDialog(null,"HAS PERDIDO");
      } else if(Partida.hayNuevoRecord()){
        String nombre=JOptionPane.showInputDialog("Dime tu nombre, campeón");
        Partida.setPlayer(nombre);
      }
      JOptionPane.showMessageDialog(null,Partida.getRecord());
    }
  }
}
