package br.edu.atitus.diego_meira.animais;

import br.edu.atitus.diego_meira.comportamentos.Corrida;
import br.edu.atitus.diego_meira.comportamentos.Nado;
import br.edu.atitus.diego_meira.comportamentos.Predacao;
import br.edu.atitus.diego_meira.especies.Mamifero;

public final class Gamba extends Mamifero implements Corrida, Nado, Predacao {

    public Gamba(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("frutas e pequenos insetos");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está emitindo sons característicos de gambá!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está atravessando a água nadando!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo para escapar de predadores!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando pequenos insetos e alimentos!");
    }
}