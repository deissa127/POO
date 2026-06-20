import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main (String[] args)throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int cod = scanner.nextInt();
        int qtd = scanner.nextInt();


        Lanche pedido = new Lanche(cod, qtd);

        double valorFinal = pedido.calculoTotal();
        System.out.printf("Total: R$ %.2f%n", valorFinal);
        scanner.close();
    }
}
