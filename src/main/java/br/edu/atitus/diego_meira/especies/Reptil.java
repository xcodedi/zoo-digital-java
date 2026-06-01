package br.edu.atitus.diego_meira.especies;
public abstract class Reptil extends Animal {

    private Boolean venenoso;

    public Reptil(String nome, Integer idade, Boolean venenoso) {
        super(nome, "Réptil", idade);
        this.venenoso = venenoso;
    }

    public Boolean getVenenoso() {
        return venenoso;
    }

    public void setVenenoso(Boolean venenoso) {
        this.venenoso = venenoso;
    }

    public void trocarPele() {
        IO.println(this.getNome() + " está trocando de pele.");
    }
}