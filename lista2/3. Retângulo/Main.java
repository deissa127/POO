/*
3. Um Retangulo
Escrever a classe Retangulo de acordo com o diagrama. A classe deve ter como atributos: 
base (b) e altura (h) do retângulo. O construtor da classe recebe os valores iniciais da 
base e altura do retângulo, que devem ser positivos. Os métodos setBase e setAltura podem 
modificar os valores da base e da altura, respectivamente; os métodos getBase e getAltura 
retornam os valores armazenados nos atributos; getArea e getDiagonal calculam a área e a 
diagonal do retângulo. O método toString deve retornar um texto com os atributos do objeto.
*/

import java.util.Scanner;
import java.util.Locale;

class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    public double getArea(){
        return getBase() * getAltura();
    }
    public double getDiagonal(){
        return Math.sqrt(Math.pow(getBase(),2)+ Math.pow(getAltura(),2));
    }
    @Override
    public String toString(){
        return "Retângulo [Base: " + getBase() + ", Altura: " + getAltura() + "]";
    }
}
// -----------------------------------------------------------
public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base e a altura do retângulo:");
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();

        Retangulo ret = new Retangulo(b, h);

        System.out.println("--- Dados do Retângulo ---");
        System.out.println(ret);
        System.out.printf("Área: %.2f%n", ret.getArea());
        System.out.printf("Diagonal: %.2f%n", ret.getDiagonal());

        System.out.println("--- Modifique os valores ---");
        double b1 = scanner.nextDouble();
        double h1 = scanner.nextDouble();
        ret.setBase(b1);
        ret.setAltura(h1);

        System.out.println("--- Dados atualizados do Retângulo ---");
        System.out.println(ret);
        System.out.printf("Nova área: %.2f%n", ret.getArea());
        System.out.printf("Nova diagonal: %.2f%n", ret.getDiagonal());

        scanner.close();
    }
}