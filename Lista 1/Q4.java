import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();

        double delta = (b * b) - (4 * a * c);

        // Verifica se é impossível calcular antes de tentar fazer a conta da raiz!
        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            // Agora com os parênteses protegendo a parte de cima da fração
            double linha1 = (-b + Math.sqrt(delta)) / (2 * a);
            double linha2 = (-b - Math.sqrt(delta)) / (2 * a);

            // Usando printf e vírgula para as 5 casas decimais
            System.out.printf("R1 = %.5f\n", linha1);
            System.out.printf("R2 = %.5f\n", linha2);
        }

        leitor.close();
    }
}
