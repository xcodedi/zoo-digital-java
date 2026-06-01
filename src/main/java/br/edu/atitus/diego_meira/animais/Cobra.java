package br.edu.atitus.diego_meira.animais;

import br.edu.atitus.diego_meira.comportamentos.Corrida;
import br.edu.atitus.diego_meira.comportamentos.Nado;
import br.edu.atitus.diego_meira.comportamentos.Predacao;
import br.edu.atitus.diego_meira.especies.Reptil;

public final class Cobra extends Reptil implements Corrida, Nado, Predacao {

    public Cobra(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("pequenos roedores, aves e anfíbios");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está sibilando!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está rastejando rapidamente pelo solo!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando através do rio!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando sua presa");
    }
}