public class Casinha {
    private String nome;
    private int capacidade;

    public Casinha(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String descrever() {
        return "Casinha " + nome + " com capacidade " + capacidade;
    }

    public boolean podeReceber(int quantidade) {
        return quantidade <= capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
