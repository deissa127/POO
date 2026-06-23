/*
Implemente um pequeno sistema de gerenciamento de funcionários de uma empresa.
Crie uma classe abstrata Funcionario com:
atributos protegidos: nome (String) e salarioBase (double);
um construtor para inicializar esses atributos;
um método abstrato double calcularSalario();
um método String toString() que retorne:
Funcionario[nome=..., salarioFinal=...]
Crie duas subclasses de Funcionario:
Assalariado
recebe apenas o salário base.
calcularSalario() retorna o salário base.
Comissionado
além do salário base, possui um atributo vendas (double).
comissão é 10% do valor das vendas.
calcularSalario() retorna salarioBase + vendas * 0.10
No método main:
Crie uma lista de funcionários (ArrayList<Funcionario>).
Adicione pelo menos 3 funcionários de tipos variados.
Percorra a lista exibindo o nome e o salário final de cada um, usando polimorfismo.
Exiba também o funcionário com maior salário, identificando sua classe concreta.
Saída esperada (exemplo):
Funcionario[nome=Ana, salarioFinal=3000.0]
Funcionario[nome=Bruno, salarioFinal=4200.0]
Funcionario[nome=Carla, salarioFinal=5000.0]
Maior salário: Carla (Comissionado)
*/

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;

    }
    public String getNome(){ return nome; }
    public double getSalarioBase(){ return salarioBase; }

    public abstract double calcularSalario();

    @Override
    public String toString(){
        return "Funcionario [ Nome: " + getNome() + " , Salário Final: " + calcularSalario() + " ]";
    }
}

class Assalariado extends Funcionario{

    public Assalariado (String nome, double salarioBase){
        super(nome,salarioBase);
    }
    @Override
    public double calcularSalario(){
        return salarioBase;
    }

    @Override
    public String toString(){
        return "Funcionario Assalariado [ Nome: " + getNome() + " , Salário Final: " + calcularSalario() + " ]";
    }
}

class Comissionado extends Funcionario{

    private double vendas;

    public Comissionado(String nome, double salarioBase, double vendas){
        super(nome, salarioBase);
        this.vendas = vendas;
    }
    @Override
    public double calcularSalario(){
        double comissao = vendas * 0.10;
        return getSalarioBase() + comissao;
    }
    @Override
    public String toString(){
        return "Funcionario Comissionado [ Nome: " + getNome() + " , Salário Final: " + calcularSalario() + " ]";
    }
}

// ---------------------------------------------------

class Main{
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ArrayList<Funcionario> Funcionarios = new ArrayList<>();
        Funcionarios.add(new Assalariado("Jurema", 1500.00));
        Funcionarios.add(new Comissionado("Creuza", 1500.00, 3000.00));
        Funcionarios.add(new Assalariado("Chico", 1800));

        System.out.println("Novo Funcionario");
        System.out.println("Digite 1 -> Assalariado ou Digite 2 -> Comissionado");
        int tipo_f = scanner.nextInt();
        scanner.nextLine();
        String nome = scanner.nextLine();
        double sb = scanner.nextDouble();
        scanner.nextLine();

        switch (tipo_f){
            case 1:
                Funcionarios.add(new Assalariado(nome, sb));
            break;
            case 2:
                double vendas = scanner.nextDouble();
                Funcionarios.add(new Comissionado(nome, sb, vendas));
            break;
        }
        for (Funcionario f : Funcionarios){
            System.out.println(f);
        }
        Funcionario maior = Funcionarios.get(0);
        for (Funcionario f : Funcionarios){
            if(f.calcularSalario() > maior.calcularSalario()){
                maior = f;
            }
        }
        String tipo = maior.getClass().getSimpleName();
        System.out.println("Maior salário: " + maior.getNome() + " (" + tipo + ")");

        scanner.close();
    }
}