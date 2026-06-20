// 3. Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em 
//   anos, meses e dias. Obs.: apenas para facilitar o cálculo, considere todo ano com 365 
//   dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 
//   12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo 
//   de testar raciocínio matemático simples.
//   Entrada: O arquivo de entrada contém um valor inteiro.
//   Saída: Imprima a saída conforme exemplo fornecido.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int ano = a / 365;
        int m = a % 365;
        System.out.println(ano + " ano(s)");
        int mes = m / 30;
        int dia = m % 30;
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

    }

}