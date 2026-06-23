/*
Crie um programa para manipular formas geométricas usando herança e classes abstratas.
Crie uma classe abstrata Forma contendo:
um método abstrato double area();
um método abstrato double perimetro();
um método toString() que retorne:
Forma[area=..., perimetro=...]
Implemente duas subclasses:
Circulo, com atributo raio (double).
área = π * raio²
perímetro = 2 * π * raio
Retangulo, com atributos largura e altura (double).
área = largura * altura
perímetro = 2 * (largura + altura)
No método main:
Leia do teclado 3 formas geométricas, permitindo ao usuário escolher se deseja criar um círculo ou um retângulo.
Armazene todas as formas em uma lista (ArrayList<Forma>).
Exiba a área total e o perímetro total somados de todas as formas.
Liste, em ordem crescente de área, cada forma usando o toString() polimórfico.

Exemplo de saída:
Digite o tipo da forma (C para círculo, R para retângulo):
C
Digite o raio: 5

Digite o tipo da forma:
R
Digite largura e altura: 3 4
...
Área total = 98.54
Perímetro total = 54.28

Lista de formas:
Forma[area=78.53, perimetro=31.41]
Forma[area=12.00, perimetro=14.00]
*/

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Collections;

abstract class Forma implements Comparable<Forma>{
    public abstract double area();
    public abstract double perimetro();

    @Override
    public int compareTo(Forma outra){
        return Double.compare(this.area(), outra.area());
    }
    @Override
public String toString(){
    return String.format("Forma[area: %.2f, perimetro: %.2f]", area(), perimetro());
}
}

class Circulo extends Forma{

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public double area(){
        return Math.PI * Math.pow(raio,2);
    }
    @Override
    public double perimetro(){
        return 2 * Math.PI * raio;
    }
}

class Retangulo extends Forma{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    public double area(){
        return largura * altura;
    }
    @Override
    public double perimetro(){
        return 2 * (largura + altura);
    }
}

// --------------------------------------------------------------

class Main{
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ArrayList<Forma> lista = new ArrayList<>();

        System.out.println("Nova forma geométrica");
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o tipo da forma (C para círculo, R para retângulo): ");
            char tipo_f = scanner.next().toUpperCase().charAt(0);
            if (tipo_f == 'C') {
                System.out.print("Digite o raio: ");
                double raio = scanner.nextDouble();
                lista.add(new Circulo(raio));
            } else if (tipo_f == 'R'){
                System.out.print("Digite largura e altura: ");
                double largura = scanner.nextDouble();
                double altura = scanner.nextDouble();
                lista.add(new Retangulo(largura, altura));
            } else {
                System.out.println("Tipo inválido! Tente novamente");
            i--;
            }
            System.out.println();
        }

        double a_Total = 0;
        double p_Total = 0;
        for (Forma f: lista){
            a_Total += f.area();
            p_Total += f.perimetro();
        }
        System.out.println("Área total: " + a_Total);
        System.out.println("Perímetro total: " + p_Total);

        Collections.sort(lista);

        System.out.println("Lista de formas ordenada");
        System.out.println();
        for (Forma f: lista){
            System.out.println(f);
        }
        scanner.close();
    }
}