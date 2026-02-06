public class Adestrador {
    private String nome;
    private int experienciaAnos;

    public Adestrador(String nome, int experienciaAnos) {
        this.nome = nome;
        this.experienciaAnos = experienciaAnos;
    }

    public String alimentar(Animal animal) {
        return nome + " alimentou " + animal.getNome();
    }

    public String verificarHabitat(Habitat habitat) {
        return nome + " verificou " + habitat.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getExperienciaAnos() {
        return experienciaAnos;
    }

    public void setExperienciaAnos(int experienciaAnos) {
        this.experienciaAnos = experienciaAnos;
    }
}
