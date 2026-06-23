import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

class Lanche {
    private int codigo;
    private int quantidade;
    private double preco;

    public Lanche(int codigo, int quantidade){
        this.codigo = codigo;
        this.quantidade = quantidade;
        definirPreco();
    }
    private void definirPreco(){
        switch (this.codigo){
            case 1: this.preco = 4.00; break;
            case 2: this.preco = 4.50; break;
            case 3: this.preco = 5.00; break;
            case 4: this.preco = 2.00; break;
            case 5: this.preco = 1.50; break;
        }
    }
    public double calculoTotal(){
        return this.preco * this.quantidade;
    }
}

// ---------------------------------------------------------------
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
