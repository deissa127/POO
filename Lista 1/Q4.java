// dando erro

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double delta = (B*B) - (4 * A * C);
        double bhaskara = (-B + Math.sqrt(delta)) / (2 * A);
        double mbhaskara = (-B - Math.sqrt(delta)) / (2 * A);
        
        if (A == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        } else {
            System.out.println("R1 = %.5f\n" + bhaskara);
            System.out.println("R2 = %.5f\n" + mbhaskara);
        }
        scanner.close();
    }
}
