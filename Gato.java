public class Gato extends Animal {
    private String corPelagem;
    private boolean gostaDeColo;

    public Gato(String nome, int idade, String corPelagem, boolean gostaDeColo) {
        super(nome, idade);
        this.corPelagem = corPelagem;
        this.gostaDeColo = gostaDeColo;
    }

    @Override
    public String falar() {
        return "Miau";
    }

    public String dormir() {
        return getNome() + " está dormindo.";
    }

    public String getCorPelagem() {
        return corPelagem;
    }

    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    public boolean isGostaDeColo() {
        return gostaDeColo;
    }

    public void setGostaDeColo(boolean gostaDeColo) {
        this.gostaDeColo = gostaDeColo;
    }
}
