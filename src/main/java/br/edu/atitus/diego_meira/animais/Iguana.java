package br.edu.atitus.diego_meira.animais;

import br.edu.atitus.diego_meira.comportamentos.Corrida;
import br.edu.atitus.diego_meira.comportamentos.Nado;
import br.edu.atitus.diego_meira.comportamentos.Predacao;
import br.edu.atitus.diego_meira.especies.Reptil;

public final class Iguana extends Reptil implements Corrida, Nado, Predacao {

    public Iguana(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        this.comer("folhas, flores, frutas e pequenos insetos");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está emitindo sons baixos e estalidos!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo rapidamente entre as árvores!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando para atravessar o rio!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está capturando pequenos insetos!");
    }
}