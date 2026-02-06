public class Dog extends Animal {
    private String raca;
    private boolean treinado;

    public Dog(String nome, int idade, String raca, boolean treinado) {
        super(nome, idade);
        this.raca = raca;
        this.treinado = treinado;
    }

    @Override
    public String falar() {
        return "Au au!";
    }

    public String buscarBola() {
        return getNome() + " trouxe a bola.";
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isTreinado() {
        return treinado;
    }

    public void setTreinado(boolean treinado) {
        this.treinado = treinado;
    }
}
