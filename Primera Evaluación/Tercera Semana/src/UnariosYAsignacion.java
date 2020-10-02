public class UnariosYAsignacion {
    public static void main(String[] args) {
        int a=9;
        int b=+a; //No hace nada
        int c=-a;
        //c vale -9
        a++; //Operador incremento (postincremento)
        //a vale 10;
        ++a; //Operador incremento (preincremento)
        //a vale 11;
        b=a++;
        System.out.println(a + " " + b);
        //a vale 12 b vale 11
        b=++a;
        //a vale 13 b vale 13
        System.out.println(a + " " + b);
        //No se mezclan pre y post. Solo usamos el post
        c=5+ ++a; //NO es neesario. Lía
        a++;
        c=5+a;
        a--;
        a+=5; // Es equivalente a  decir a<-a+5;
        b=30;
        b-=10;
        a*=3;
        a/=2;
        a%=8;
        a++;
        a--;
        a+=3;
        a-=2; //Poco
        a*=5; //Rarísimo
        a/=3; a%=2; //Nunca



    }
}
