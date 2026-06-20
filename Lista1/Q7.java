// 7. Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.

// Entrada: O arquivo de entrada contém três valores com um dígito após o ponto decimal.
// Saída: O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com 
// mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner (System.in);

        scanner.useLocale(Locale.US);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double pi = 3.14159;

        double tr = (a * c)/2;
        double cr = pi * (c * c);
        double t = ((a + b) * c) / 2;
        double q = b * b;
        double r = a * b;

        System.out.printf( "TRIANGULO: %.3f\n", tr);
        System.out.printf( "CIRCULO: %.3f\n", cr);
        System.out.printf( "TRAPEZIO: %.3f\n", t);
        System.out.printf( "QUADRADO: %.3f\n", q);
        System.out.printf( "RETANGULO: %.3f\n", r);

        scanner.close();
    }
}