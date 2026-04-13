// 6. Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize 
// a fórmula: maiorab = (a + b + abs(a - b))/2
// Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

// Entrada: O arquivo de entrada contém três valores inteiros.
// Saída: Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int mab = (a+b+ Math.abs(a-b))/2;
        int mabc = (mab+c+ Math.abs(mab-c))/2;

        System.out.println(mabc + " eh o maior");

        scanner.close();
    }
}