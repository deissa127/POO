import java.util.Scanner;
import java.util.ArrayList;

class Musica{
    private String titulo;
    private String artista;
    private int duracao;

    public Musica(String titulo, String artista, int duracao){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getArtista(){
        return artista;
    }
    public int getDuracao(){
        return duracao;
    }
    @Override
    public String toString(){
        return getTitulo() + " - " + getArtista() + " (" +getDuracao() + "s) ";
    }
}

// --------------------------------------------
class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Musica> Playlist = new ArrayList<>();

        Playlist.add(new Musica("Numb", "Linkin Park", 185));
        Playlist.add(new Musica("Azul", "Gal Costa", 300));
        Playlist.add(new Musica("Butter", "BTS", 280));
        String titulo = scanner.nextLine();
        String artista = scanner.nextLine();
        int duracao = scanner.nextInt();
        Playlist.add(new Musica(titulo, artista, duracao));

        System.out.println("--- Playlist ---");
        for (Musica m : Playlist){
            System.out.println(m);
        }
        int total = 0;
        for (Musica m : Playlist){
            total = total + m.getDuracao();
        }
        System.out.println ("Duração total : " + total + " segundos");

        String m_rmv = scanner.nextLine();
        for(int i = 0; i < Playlist.size(); i++){
            if (Playlist.get(i).getTitulo().equals(m_rmv)){
                Playlist.remove(i);
                System.out.println ("Removido");
                break;
            }
        }
        Musica maisLonga = Playlist.get(0);
        for (Musica m : Playlist){
            if (m.getDuracao() > maisLonga.getDuracao()){
                maisLonga = m;
            }
        }
        System.out.println("Música mais longa: " + maisLonga);
        scanner.close();
    }
}