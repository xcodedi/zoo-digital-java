package br.edu.atitus.diego_meira.animais;

import br.edu.atitus.diego_meira.comportamentos.Nado;
import br.edu.atitus.diego_meira.comportamentos.Predacao;
import br.edu.atitus.diego_meira.especies.Mamifero;

public final class Golfinho extends Mamifero implements Nado, Predacao {

    public Golfinho(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        this.comer("peixes");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está emitindo assobios e cliques!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando rapidamente pelo oceano!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando peixes usando ecolocalização!");
    }
}