import javax.swing.*;

public class Practica2 {
  public static void main(String[] args) {
    int precioArticulo=Integer.parseInt(JOptionPane.showInputDialog("¿Precio?"));
    int dineroPagado=Integer.parseInt(JOptionPane.showInputDialog("¿Dinero Pagado?"));
    int aDevolver=dineroPagado-precioArticulo;
    if(aDevolver<0){
      JOptionPane.showMessageDialog(null,"No me has dado suficiente");
      return;
    } else if(aDevolver==0){
      JOptionPane.showMessageDialog(null,"Clavao");
      return;
    }
    JOptionPane.showMessageDialog(null,"Hay que devolver "+aDevolver);
    String cambio="";
    int todaviaPorDevolver=aDevolver;
    int billetes500=todaviaPorDevolver/500;
    cambio+=billetes500>0?billetes500 +" billete(s) de 500 €\n":"";
    todaviaPorDevolver=todaviaPorDevolver%500;
    int billetes200=todaviaPorDevolver/200;
    cambio+=billetes200>0?billetes200 +" billete(s) de 200 €\n":"";
    todaviaPorDevolver=todaviaPorDevolver%200;
    int billetes100=todaviaPorDevolver/100;
    cambio+=billetes100>0?billetes100 +" billete(s) de 100 €\n":"";
    todaviaPorDevolver=todaviaPorDevolver%100;
    int billetes50=todaviaPorDevolver/50;
    cambio+=billetes50>0?billetes50 +" billete(s) de 50 €\n":"";
    todaviaPorDevolver=todaviaPorDevolver%20;
    int billetes20=todaviaPorDevolver/20;
    cambio+=billetes20>0?billetes20 +" billete(s) de 20 €\n":"";
    todaviaPorDevolver=todaviaPorDevolver%20;
    int billetes10=todaviaPorDevolver/10;
    cambio+=billetes10>0?billetes10 +" billete(s) de 10 €\n":"";
    todaviaPorDevolver=todaviaPorDevolver%10;
    int billetes5=todaviaPorDevolver/5;
    cambio+=billetes5>0?billetes5 +" billete(s) de 5 €\n":"";
    todaviaPorDevolver=todaviaPorDevolver%5;
    int monedas2=todaviaPorDevolver/2;
    cambio+=monedas2>0?monedas2 +" monedas de 2 €\n":"";
    todaviaPorDevolver=todaviaPorDevolver%2;
    int monedas1=todaviaPorDevolver;
    cambio+=monedas1>0?monedas1 +" monedas de 1 €\n":"";

    JOptionPane.showMessageDialog(null,cambio);



  }
}
