import javax.swing.*;

public class Ejercicios {
    public static final double G=6.67e-11;
    public static void main(String[] args) {
        //Ej2 del pdf
        /* a=5 y b=3
        25>20 && 13>5      V y V -->Verdadero (true)
        !(a>b && 2*a<=b)  NO(true Y false) -->NO(false) -->true
        */
        /*
        a=3;
        b=6;
        c=a/b; --> c=0
        c=a%b; -->c=3
        a++; -->a vale 4
        ++a; -->a vale 5
        c=++a + b++; incrementa a y suma b después incrementa b
                a-->6 c vale 12 y b vale 7
        c=++a + ++b; incrementa a, incrementa b coge los valores y
                los sumas y se lo pones a c
                a -->7 b-->8 c-->15
        */
    //Ejercicio 4. F=G*m1⋅m2/r^2 donde G=6 ' 67×10−11
        double m1=Double.parseDouble( JOptionPane.showInputDialog("¿m1?"));
        double m2=Double.parseDouble( JOptionPane.showInputDialog("¿m2?"));
        double r=Double.parseDouble( JOptionPane.showInputDialog("¿r?"));
        double F=G*m1*m2/(r*r);
        JOptionPane.showMessageDialog(null,"La fuerza es "+F+" Newtons");
        //Ejercicio 4.b I=C⋅r⋅t/100
        //dondeC=capital ,t=tiempo en años r=Beneficio por 100 € en un año e I =bene
        int C=3000;
        int t=3;
        int redito=5;
        int I=C*redito*t/100;
        System.out.println(I);
        double resultado=1.03-0.42; //Tienes un euro y tres céntimos. Pagas 42 centimos
        //Si me quedan 61 céntimos, no me han timado
        System.out.println(resultado == 0.61 ? "No me han timado" : "Me han timado");
        System.out.println(resultado);
        int dineroQueTengo=103; //En céntimos
        int dineroQuePago=42; //En centimos
        int dineroQueDeboTener=61;
        System.out.println(dineroQueTengo - dineroQuePago == dineroQueDeboTener ? "No me han timado" : "Timo");
        int dineroEuros=dineroQueDeboTener/100;
        int centimosQueDeboTener=dineroQueDeboTener%100;
        System.out.println("Tengo al final " + dineroEuros + "," + centimosQueDeboTener);

    }
}
