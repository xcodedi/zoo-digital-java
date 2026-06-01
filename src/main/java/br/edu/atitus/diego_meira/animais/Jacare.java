package br.edu.atitus.diego_meira.animais;

import br.edu.atitus.diego_meira.comportamentos.Corrida;
import br.edu.atitus.diego_meira.comportamentos.Nado;
import br.edu.atitus.diego_meira.comportamentos.Predacao;
import br.edu.atitus.diego_meira.especies.Reptil;

public final class Jacare extends Reptil implements Corrida, Nado, Predacao {

    public Jacare(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        this.comer("peixes, aves e pequenos mamíferos");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está rugindo e emitindo sons graves!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo rapidamente pela margem do rio!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando pelo rio!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está emboscando sua presa na água!");
    }
}