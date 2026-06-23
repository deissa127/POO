import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome(){ return nome; }
    public double getPreco(){ return preco; }

    @Override /* compareTo é um nome obrigatório pois esse é o nome padrão do metodo nativo do Java -> igual toString() */
    public int compareTo(Produto outro){
        if (this.preco < outro.getPreco()) return -1;
        if (this.preco > outro.getPreco()) return 1;
        return 0;
    }

    @Override
    public String toString(){
        return getNome() +" : R$" + getPreco();
    }
}

// --------------------------------------------------
class Main{
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> L_Produtos= new ArrayList<>();

        L_Produtos.add(new Produto("Camisa Básica", 35.00));
        L_Produtos.add(new Produto("Camisa Polo", 50.00));
        String p_nome = scanner.nextLine();
        double p_preco = scanner.nextDouble();
        L_Produtos.add(new Produto(p_nome, p_preco));

        System.out.println("---- Lista de Produtos ---");
        for (Produto p : L_Produtos){
            System.out.println(p);
        }

        Collections.sort(L_Produtos);
        System.out.println("---- Lista de Produtos Ordenada ---");
        for (Produto p : L_Produtos){
            System.out.println(p);
        }
        scanner.close();
    }
}