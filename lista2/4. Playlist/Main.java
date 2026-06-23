/*
Implemente um programa para gerenciar uma playlist de músicas usando uma List.
Crie uma classe Musica com os atributos:
titulo
artista
duracao (em segundos)
O programa deve:
Adicionar músicas à playlist.
Exibir todas as músicas na ordem em que foram adicionadas.
Exibir a duração total da playlist.
Permitir remover uma música pelo título.
Exibir a música mais longa da playlist.
Requisitos
Utilize ArrayList.
Implemente encapsulamento corretamente.
Sobrescreva o método toString() na classe Musica.
Exemplo de saída esperada
Playlist:
1. Numb - Linkin Park (185s)
2. Yellow - Coldplay (270s)
3. Halo - Beyoncé (260s)

Duração total: 715 segundos

Música mais longa:
Yellow - Coldplay (270s)
*/

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