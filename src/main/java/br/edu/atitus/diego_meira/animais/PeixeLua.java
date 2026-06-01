package br.edu.atitus.diego_meira.animais;

import br.edu.atitus.diego_meira.comportamentos.Nado;
import br.edu.atitus.diego_meira.comportamentos.Predacao;
import br.edu.atitus.diego_meira.especies.Peixe;

public final class PeixeLua extends Peixe implements Nado, Predacao {

    public PeixeLua(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void comer() {
        this.comer("águas-vivas e pequenos organismos marinhos");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está produzindo bolhas na água!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando lentamente pelo oceano!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está procurando águas-vivas para se alimentar!");
    }
}