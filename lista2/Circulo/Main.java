import java.util.Locale;
import java.util.Scanner;

class Circulo {
    private double raio;

    public Circulo (double raio){
        this.raio = raio;
    }
    public double c_area(){
        double area = 3.14 * (raio * raio);
        return area;
    }
    public double c_circunf(){
        double circunf = 2 * 3.14 * raio;
        return circunf;
    }
}

//------------------------------------------------
public class Main {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        double r = scanner.nextDouble();
        int calculo = scanner.nextInt();

        switch (calculo){
            case 1:
                Circulo valora = new Circulo(r);
                System.out.printf("Área do circulo = %.2f%n", valora.c_area());
                break;
            case 2:
                Circulo valorc = new Circulo(r);
                System.out.printf("Circunferência do circulo = %.2f%n", valorc.c_circunf());
                break;
        }
    }
}