public class Filme {
    String titulo;
    String diretor;
    int duracao;

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public Filme(String titulo) {
        this.titulo = titulo;
        this.diretor = "Peter Lord";
        this.duracao = 88;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println();
    }
}