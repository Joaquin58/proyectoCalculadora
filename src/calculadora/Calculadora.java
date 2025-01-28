package calculadora;

public class Calculadora {

    public static double suma(double a, double b, double ...c) {
        if (b == 0) {
            return b;
        }

        return a + suma(a , b-1);
    }



    public static double multiplicar(double a, double b) {
        
        return 0;
    }

}
