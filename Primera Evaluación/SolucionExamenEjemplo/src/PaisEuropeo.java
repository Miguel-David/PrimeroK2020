class PaisEuropeo{
  private final String nombre;
  private int poblacion;
  private final String dominio;
  private int aportacion;

  private static int fondoComun;

  static int getFondoComun(){
    return fondoComun;
  }

  void aporta(int dinero){
    aportacion+=dinero;
    fondoComun+=dinero;
  }
  void retira(int dinero){
    aportacion-=dinero;
    fondoComun-=dinero;
  }

  String getNombre(){
    return nombre;
  }
  int getPoblacion(){
    return poblacion;
  }
  void setPoblacion(int poblacion){
    this.poblacion=poblacion;
  }
  String getDominio(){
    return dominio;
  }
  int getAportacion(){
    return aportacion;
  }
  PaisEuropeo(String nombre, int poblacion,String dominio){
    this.nombre=nombre;
    this.poblacion=poblacion;
    this.dominio=dominio;
  }
  PaisEuropeo(String nombre, int poblacion){
    this.nombre=nombre;
    this.poblacion=poblacion;
    this.dominio=(""+nombre.charAt(0)+nombre.charAt(1)).toLowerCase();

    //this.dominio=nombre.substring(0,2).toLowerCase();
		/* TElescópico
		String dominio=""+nombre.charAt(0)+nombre.charAt(1);
		dominio=dominio.toLowerCase();
		this(nombre,poblacion,dominio);
		*/
  }
  char getCategoria(){
    if(aportacion>100000){
      return 'A';
    }
    if(aportacion>=0){
      return 'B';
    }
    return 'C';
		/*
		char salida='';
		if(saldo>100000){
			salida='A';
		} else if (saldo>=0) {
			salida='B';
		} else {
			salida='C';
		}
		return salida;
		*/
  }

  static double devuelveMedia(PaisEuropeo p1,PaisEuropeo p2){
    return (p1.getPoblacion()+p2.getPoblacion())/2.0;
  }
}

