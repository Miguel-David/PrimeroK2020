import javax.swing.*;

public class ESContacto {
  public static Contacto pedirContacto() {
    Contacto nuevoContacto=null;
    String nombreIntroducido="";
    while(nombreIntroducido.isEmpty()){
      nombreIntroducido= JOptionPane.showInputDialog("Dime tu nombre");
      if(nombreIntroducido==null){
        nombreIntroducido="";
      }
    }
    String apellidoIntroducido="";
    apellidoIntroducido=JOptionPane.showInputDialog("Dime tu apellido. Cancelar sin apellido");
    if(apellidoIntroducido==null){
      apellidoIntroducido="";
    }
    String numeroIntroducido="";
    while(numeroIntroducido.isEmpty() || numeroIntroducido.length()!=9){
      numeroIntroducido=JOptionPane.showInputDialog("¿Número de Teléfono?");
      if(numeroIntroducido==null){
        numeroIntroducido="";
      }
    }
    //DIFÍCIL DIFÍCIL POSIBLE PARA EL EXAMEN
    String emailIntroducido="";
    boolean deboSeguir=true;
    while(deboSeguir){
      emailIntroducido=JOptionPane.showInputDialog("Correo Electrónico");
      if(emailIntroducido==null){
        deboSeguir=false;
        emailIntroducido="";
      }
      if(emailIntroducido.isEmpty()){
        deboSeguir=false;
      }
      if(emailIntroducido.indexOf('@')!=-1){
        deboSeguir=false;
      }
    }
    nuevoContacto=new Contacto(
            nombreIntroducido,
            apellidoIntroducido,
            new Telefono(numeroIntroducido),
            emailIntroducido
    );
    return nuevoContacto;
  }

  public static void main(String[] args) {
    Contacto c=pedirContacto();
    JOptionPane.showMessageDialog(null,c.infoContacto());

  }
}
