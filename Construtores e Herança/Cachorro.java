class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Raça: " + raca);
    }
}