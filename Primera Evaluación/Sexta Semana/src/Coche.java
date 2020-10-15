import javax.swing.*;

public class Coche {
  private String marca;
  private int CV;
  private String color;
  private String matricula;

  String getMatricula(){
    return matricula;
  }
  String getMarca(){
    return marca;
  }
  String getColor(){
    return color;
  }
  int getCV(){
    return CV;
  }

  void setColor(String color){
    this.color=color;
  }

  void setCV(int CV){
    this.CV=CV;
  }


  Coche(String matricula,String color,String marca,int CV){
    this.matricula=matricula;
    this.color=color;
    this.marca=marca;
    this.CV=CV;
  }
  String informacionCoche(){
    return "El "+marca+" "+color+" tiene matrícula "+matricula;
  }



}
