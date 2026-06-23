import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Produto {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    public int getCodigo(){ return codigo; }
    public String getNome(){ return nome; }
    public double getPreco(){ return preco; }

    @Override
    public String toString(){
        return getCodigo() + " -> " + getNome() + " : R$" + getPreco();
    }
}

// -----------------------------------------------------------------------

class Main{
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Produto> estoque = new HashMap<>();

        // criei o produto
        Produto p1 = new Produto(101, "Mouse Gamer", 120.00);
        Produto p2 = new Produto(102, "Teclado Mecânico", 350.00);
        Produto p3 = new Produto(103, "Monitor", 400.00);

        // adicionei o produto na HashMap
        estoque.put(p1.getCodigo(),p1);
        estoque.put(p2.getCodigo(),p2);
        estoque.put(p3.getCodigo(),p3);

        // NOVO PRODUTO
        int codigo = scanner.nextInt();
        scanner.nextLine();
        String nome = scanner.nextLine();
        double preco = scanner.nextDouble();
        // criar novo produto
        Produto novo = new Produto(codigo,nome,preco);
        // adicionar novo produto no HashMap
        estoque.put(novo.getCodigo(),novo);
        System.out.println("Produto adicionado");

        System.out.println("--- Lista de Produtos ---");
        for(Produto p : estoque.values()){
            System.out.println(p);
        }

        // buscar produto pelo código
        int busca = scanner.nextInt();
        if (estoque.containsKey(busca)){
            Produto achado = estoque.get(busca);
            System.out.println("Produto encontrado pelo código:" + achado);
        }

        // remover produto
        int rmv = scanner.nextInt();
        if(estoque.containsKey(rmv)){
            estoque.remove(rmv);
            System.out.println("Produto de código " + rmv + " removido");
        }

        System.out.println("--- Lista de Produtos Atualizada ---");
        for(Produto p : estoque.values()){
            System.out.println(p);
        }

        // Produto mais Caro
        Produto maisCaro = null;
        for (Produto p : estoque.values()){
            if (maisCaro == null || p.getPreco() > maisCaro.getPreco()){
                maisCaro = p ;
            }
        }
        System.out.println("Produto mais caro: " + maisCaro);
        scanner.close();
    }
}