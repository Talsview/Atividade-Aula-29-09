public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Um Monstro em Paris", "Bibo Bergeron", 90);

        Filme filme2 = new Filme("Piratas Pirados");

        filme1.exibirInfo();
        filme2.exibirInfo();
    }
}