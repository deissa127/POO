import java.util.Scanner;
import java.util.Locale;
import java.util.Set;
import java.util.HashSet;

class Participante{
    private String cpf;
    private String nome;
    private String email;

    public Participante(String cpf, String nome, String email){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }
    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return this.cpf == that.cpf;
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(cpf);
    }

    @Override
    public String toString(){
        return "CPF: " + getCpf() + " -> Nome: " + getNome() + " -> E-mail: " + getEmail();
    }
}

//----------------------------------------------------------------------------------

class Main{
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Set<Participante> Evento_Part = new HashSet<>();

        Participante p1 = new Participante("123.456.789-10", "Chico Tripa", "chiquinho@gmail.com");
        Participante p2 = new Participante("109.876.543-21", "Joana da Silva Sauro", "joana@hotmail.com");
        Participante p3 = new Participante("147.852.369-00", "Dona Chica", "dona@email.com");


        Evento_Part.add(p1);
        Evento_Part.add(p2);
        Evento_Part.add(p3);

        System.out.println("--- Lista de Participantes do Evento ---");
        for (Participante p : Evento_Part){
            System.out.println(p);
        }
        System.out.println("Adicione Participante: ");
        String cpf = scanner.nextLine();
        String nome = scanner.nextLine();
        String email = scanner.nextLine();

        Participante novo = new Participante(cpf, nome, email);
        Evento_Part.add(novo);
        System.out.println("--- Lista de Participantes do Evento Atualizada ---");
        for (Participante p : Evento_Part){
            System.out.println(p);
        }
        System.out.println("Pesquise Participante: ");
        String cpf_busca = scanner.nextLine();
        Participante achado = null;
        for(Participante p : Evento_Part){
            if(p.getCpf().equals(cpf_busca)){
                achado = p;
                break;
            }
        }
        if(achado != null){
            System.out.println("Participante encontrado " + achado);
        } else {
            System.out.println("Participante não encontrado");
        }

        System.out.println("Quantidade total de Participantes: " + Evento_Part.size());
        scanner.close();
    }
}