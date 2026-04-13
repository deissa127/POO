// 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível 
// calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

// Entrada: Leia três valores de ponto flutuante (double) A, B e C.
// Saída: Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima
//  o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima 
// sempre o final de linha após cada mensagem.

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
