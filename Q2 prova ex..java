/*2. Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos próprios (excluindo ele mesmo) 
é igual ao próprio número. Por exemplo, o número 6 é perfeito, pois 1+2+3 é igual a 6. Sua tarefa é escrever um programa que imprima se um 
determinado número é perfeito ou não .

Entrada: A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 20), indicando o número de casos de 
teste da entrada. Cada uma das N linhas seguintes contém um valor inteiro X (1 ≤ X ≤ 108), que pode ser ou não, um número perfeito.
Saída: Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito” ou “X nao eh perfeito”, de acordo com a especificação fornecida.*/


import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void  main (String [] args) throws IOException {

        /* chamo o Scanner para ler a entrada */
        Scanner scanner = new Scanner (System.in);

        /* crio uma lista aberta para adicionar os casos que serão testados*/
        ArrayList<Integer> casos = new ArrayList<>();

        int n = scanner.nextInt();
        /* laço para pedir as n's entradas*/
        for (int i = 1; i <= n; i++){
            int x = scanner.nextInt();
            casos.add(x);
        }

        for (int t : casos){    /* percorre o array */
            int soma = 0;
            int d = 1;
            /* Um número perfeito é a soma dos divisores EXCLUINDO ele mesmo.
               Portanto, testamos de 1 até t/2 para ganhar performance,
               pois nenhum divisor (exceto ele mesmo) será maior que a metade dele.
            */
            while (t/2 >= d) {
                if ((t % d) == 0) {    /* testa se o resto da divisão é zero*/
                    soma += d;  /* soma os divisores */
                }
                d++;
            } /* precisa ser dentro do while, pois se for dentro somente do for,
                    o programa só imprimirá o ultimo valor armazenado em soma */
            if (t == soma && t != 0){
                System.out.println( t + " eh perfeito");
            }else {
                System.out.println( t + " nao eh perfeito");
            }
        }

    }
}