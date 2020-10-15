import javax.swing.*;

public class PruebaHuchas {
  public static void main(String[] args) {
    Hucha huchaDePepito;
    huchaDePepito=new Hucha("Pepito","PS5");
    JOptionPane.showMessageDialog(null,huchaDePepito.devuelveInformacion());
    huchaDePepito.meterCincoEuros();
    huchaDePepito.meterDosEuros();
    huchaDePepito.meterCincoEuros();
    JOptionPane.showMessageDialog(null,huchaDePepito.devuelveInformacion());

    Hucha huchaDeAnita=new Hucha("Anita","Viaje");
    JOptionPane.showMessageDialog(null,huchaDeAnita.devuelveInformacion());



  }
}
