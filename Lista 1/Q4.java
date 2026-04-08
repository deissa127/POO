import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = (b*b) - (4 * a * c);
        
        if (a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        } else {
            double bhaskara = (-b + Math.sqrt(delta)) / (2 * a);
            double mbhaskara = (-b - Math.sqrt(delta)) / (2 * b);

            System.out.println("R1 = %.5f\n" + bhaskara);
            System.out.println("R2 = %.5f\n" + mbhaskara);
        }
        scanner.close();
    }
}
