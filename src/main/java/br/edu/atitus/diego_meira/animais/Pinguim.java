package br.edu.atitus.diego_meira.animais;

import br.edu.atitus.diego_meira.comportamentos.Nado;
import br.edu.atitus.diego_meira.comportamentos.Predacao;
import br.edu.atitus.diego_meira.especies.Ave;

public final class Pinguim extends Ave implements Nado, Predacao {

    public Pinguim(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("peixes e krill");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está grasnando!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando rapidamente entre os blocos de gelo!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está mergulhando para caçar krill!");
    }
}