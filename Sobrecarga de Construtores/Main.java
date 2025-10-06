public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A Metamorfose", "Franz Kafka", 96);

        Livro livro2 = new Livro("Sandman Volume 1");

        livro1.exibirInfo();
        livro2.exibirInfo();
    }
}