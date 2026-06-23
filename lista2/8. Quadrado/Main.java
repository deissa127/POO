/*
Calcular a área e a diagonal de retângulos e quadrados, utilizando as classes listadas no 
diagrama.
A classe Retângulo define atributos para armazenar a base e altura de um retângulo e calcula
 sua área e diagonal. A classe Quadrado especializa o retângulo em um quadrado, atribuindo 
 o mesmo valor para base e altura. Ambas as classes devem ter construtor para receber os 
 valores iniciais e método ToString para retornar os dados armazenados.
*/

import java.util.Scanner;
import java.util.Locale;

class Retangulo{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double getBase(){ return base; }
    public double getAltura(){ return altura; }

    public double CalcArea(){
        return getBase() * getAltura();
    }
    public double CalcDiagonal(){
        return Math.sqrt(Math.pow(getBase(),2) + Math.pow(getAltura(),2));
    }

    @Override
    public String toString(){
        return "Retângulo: [ Base: " + getBase() + " ; Altura: " + getAltura() + " ; Área: " + CalcArea() + " ; Diagonal: " + CalcDiagonal() + " ]";
    }
}

class Quadrado extends Retangulo{

    public Quadrado(double l){
        super(l, l);
    }

    @Override
    public String toString(){
            return "Quadrado [ Lado: " + getBase() + " ; Área: " + CalcArea() + " ; Diagonal: " + CalcDiagonal() + " ]";
        }

}

// ----------------------------------------------
class Main{
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Retângulo");

        double base = scanner.nextDouble();
        double altura = scanner.nextDouble();

        Retangulo rnovo = new Retangulo(base, altura);

        System.out.println("Quadrado");

        double lado = scanner.nextDouble();

        Quadrado qnovo = new Quadrado(lado);

        System.out.println(rnovo);
        System.out.println(qnovo);
        scanner.close();
    }
}