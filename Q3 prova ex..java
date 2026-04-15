/* 3. Júlio César usava um sistema de criptografia, agora conhecido como Cifra de César, que trocava cada letra pelo equivalente em duas 
posições adiante no alfabeto (por exemplo, 'A' vira 'C', 'R' vira 'T', etc.). Ao final do alfabeto nós voltamos para o começo, isto é 'Y' 
vira 'A'. Nós podemos, é claro, tentar trocar as letras com quaisquer número de posições. Coloque um comentário com o texto “TADS”.
Entrada: A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. 
Cada caso de teste é composto por duas linhas. A primeira linha contém uma string com até 50 caracteres maiúsculos ('A'-'Z'), que é a sentença 
após ela ter sido codificada através desta Cifra de César modificada. A segunda linha contém um número que varia de 0 a 25 e que representa 
quantas posições cada letra foi deslocada para a direita.
Saída: Para cada caso de teste de entrada, imprima uma linha de saída com o texto decodificado (transformado novamente para o texto original) 
conforme as regras acima e o exemplo abaixo.*/

import java.util.Scanner;

public class Mmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt(); // Quantidade de casos

            for (int i = 0; i < n; i++) {
                String Codificada = scanner.next(); // Lê a string
                int deslocamento = scanner.nextInt();      // Lê o pulo

                StringBuilder resultado = new StringBuilder();

                // Percorre cada letra da string
                for (int j = 0; j < Codificada.length(); j++) {
                    char letraCodificada = Codificada.charAt(j);

                    // Converte para a nova letra subtraindo o deslocamento
                    char letraOriginal = (char) (letraCodificada - deslocamento);

                    // Se sair do limite do alfabeto (antes de 'A'), volta 26 posições
                    if (letraOriginal < 'A') {
                        letraOriginal += 26;
                    }

                    resultado.append(letraOriginal);
                }

                System.out.println(resultado.toString());
            }
        }
        scanner.close();
    }
}