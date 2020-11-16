public class Montanya {
  private final String nombre;
  private int altura;
  private final String continente;
  private final String[] paises;
  private final String cordillera;

  public Montanya(String nombre, int altura, String continente, String[] paises, String cordillera) {
    this.nombre = nombre;
    this.altura = altura;
    this.continente = continente;
    //Pasa lista de paises, me la copio para mí.
    String[] misPaises=new String[paises.length];
    for (int i = 0; i < paises.length; i++) {
      misPaises[i]=paises[i];
    }
    this.paises = misPaises;

    this.cordillera = cordillera;
  }

  public String infoMontanya(){
    String salida="";
    salida+=nombre+" ("+altura+" m) - "+cordillera+" (";
    for (String pais: paises) {
      salida+=pais+", ";
    }
    salida=salida.substring(0,salida.length()-2);
    salida+=")";
    return salida;
  }

  public static void main(String[] args) {
    Montanya[] lista=new Montanya[4];
    String[] paises={"Tibet", "Nepal"};
    lista[0]=new Montanya("Everest",8848,"Asia",paises, "Himalaya");
    String[] paises2={"Argentina"};
    lista[1]=new Montanya("Aconcagua",6962,"América del sur", paises2,"Andes");
    paises2[0]="Estados Unidos";
    lista[2]=new Montanya("McKinley",6194,"América del Norte", paises2,"Cordillera de Alaska");
    paises2[0]="Tanzania";
    lista[3]=new Montanya("Kibo",5895, "África",paises2,"Kilimanjaro");
    for (Montanya m:lista) {
      System.out.println(m.infoMontanya());
    }
    paises[0]="España";
    System.out.println(lista[0].infoMontanya());
  }
}
