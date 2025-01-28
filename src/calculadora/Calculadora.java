package calculadora;

public class Calculadora {

    public static double suma(double a, double b) {
        if (b == 0) {
            return a;
        }

        return suma(a+1 , b-1);
    }



    public static double multiplicar(double a, double b) {
        
        return 0;
    }

}
