package br.edu.atitus.diego_meira.animais;

import br.edu.atitus.diego_meira.comportamentos.Corrida;
import br.edu.atitus.diego_meira.comportamentos.Nado;
import br.edu.atitus.diego_meira.comportamentos.Predacao;
import br.edu.atitus.diego_meira.especies.Reptil;

public final class Tartaruga extends Reptil implements Corrida, Nado, Predacao {

    public Tartaruga(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        this.comer("algas, plantas aquáticas e pequenos invertebrados");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está emitindo sons suaves e baixos!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está se locomovendo lentamente pela areia!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando tranquilamente pelo mar!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está procurando pequenos crustáceos para se alimentar!");
    }
}