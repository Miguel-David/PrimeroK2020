

import java.text.Collator;
import java.util.Locale;

public class PrimeroDeLaClase {
  public static void main(String[] args) {
    Collator collator=Collator.getInstance(new Locale("es","ES"));
    String[] lista={"Abad,José","Bárcenas, Antonio","Zaca","Ana","Bea","Clara","Áaapez, Juan"};
    //Por orden alfabético, quién sale el primero al encerado
    //y quién el último
    //Hacemos las dos preguntas
    String ultimo=lista[0];
    String primero=lista[0];
    for (String personaAMirar:lista) {
      if(collator.compare(ultimo,personaAMirar)<0){
        ultimo=personaAMirar;
      }
      if(collator.compare(primero,personaAMirar)>0){
        primero=personaAMirar;
      }
    }
    System.out.println("El primero es: " + primero + " y el último será " + ultimo);
  }
}
