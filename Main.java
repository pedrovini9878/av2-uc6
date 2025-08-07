public class Main {

    static class Filme {
        String titulo;
        double avaliacao;

        Filme(String titulo, double avaliacao) {
            this.titulo = titulo;
            this.avaliacao = avaliacao;
        }
    }

    public static void main(String[] args) {
        Filme[] filmes = new Filme[5];
        filmes[0] = new Filme("KUNG FU PANDA", 9);
        filmes[1] = new Filme("DEADPOOL", 7);
        filmes[2] = new Filme("TOY STORY", 8);
        filmes[3] = new Filme("MOANA", 6);
        filmes[4] = new Filme("PROCURANDO NEMO", 9);

        System.out.println("Filmes com avaliação maior que 8:");
        for (Filme filme : filmes) {
            if (filme.avaliacao > 8) {
                System.out.println(filme.titulo + " - " + filme.avaliacao);
            }
        }

        double somaAvaliacoes = 0;
        for (Filme filme : filmes) {
            somaAvaliacoes += filme.avaliacao;
        }
        double mediaAvaliacoes = somaAvaliacoes / filmes.length;

        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}