/*
2. Uma Disciplina
A classe deve ter atributos para armazenar o nome da disciplina e as notas dos dois 
bimestres e da prova final. Os métodos da classe devem permitir calcular a média 
parcial (com as notas bimestrais) e a média final (com todas as notas, caso o aluno 
tenha ficado na prova final). Considere como média de aprovação o valor 60, notas 
de 0 a 100, média parcial ponderada com pesos 2 e 3 e média final como a média aritmética 
da média parcial com a nota da prova final, caso o aluno não seja aprovado por média.
Escrever um programa para testar a classe.
*/

import java.util.Scanner;

class Disciplina{
    private String nome_disciplina;
    private int bim1;
    private int bim2;
    private int p_final;

    public Disciplina (String nome_disciplina, int bim1, int bim2){
        this.nome_disciplina = nome_disciplina;
        this.bim1 = bim1;
        this.bim2 = bim2;
        this.p_final = 0;
    }
    public int media_parcial(){
        int b1_peso = 2 * bim1;
        int b2_peso = 3 * bim2;
        int soma = b1_peso + b2_peso;
        int mp = soma / 5;
        return mp;
    }
    public void setp_final(int nota_pf){
        this.p_final = nota_pf;
    }
    public int media_final(){
        if (media_parcial() >= 60){
            return media_parcial();
        }
        return (media_parcial() + this.p_final) / 2;
    }
    public String getNome_disciplina(){
        return this.nome_disciplina;
    }
}
//------------------------------------------
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome da disciplina: ");
        String nome_d = scanner.next();

        System.out.print("Nota do 1º bimestre: ");
        int b1 = scanner.nextInt();

        System.out.print("Nota do 2º bimestre: ");
        int b2 = scanner.nextInt();

        Disciplina materia = new Disciplina(nome_d, b1, b2);

        int mediaParcial = materia.media_parcial();
        System.out.printf("%n--- Resultado Parcial de %s ---%n", materia.getNome_disciplina());
        System.out.printf("Média Parcial: %d%n",mediaParcial);

        if (mediaParcial >= 60){
            System.out.println("Status: APROVADO");
        } else {
            System.out.println("Status: RECUPERAÇÃO");
            System.out.print("Digite a nota da Prova Final: ");
            int notapf = scanner.nextInt();

            materia.setp_final(notapf);

            int mediaFinal = materia.media_final();
            System.out.printf("Média Final: %d%n",mediaFinal);

            if (mediaFinal >= 60){
                System.out.println("Status: APROVADO");
            } else{
                System.out.println("Status: REPROVADO");
            }

        }
        scanner.close();
    }
}