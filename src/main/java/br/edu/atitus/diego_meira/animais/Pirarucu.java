package br.edu.atitus.diego_meira.animais;

import br.edu.atitus.diego_meira.comportamentos.Nado;
import br.edu.atitus.diego_meira.comportamentos.Predacao;
import br.edu.atitus.diego_meira.especies.Peixe;

public final class Pirarucu extends Peixe implements Nado, Predacao {

    public Pirarucu(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void comer() {
        this.comer("peixes menores e crustáceos");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está subindo à superfície para respirar!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando pelos rios da Amazônia!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando peixes menores no rio!");
    }
}