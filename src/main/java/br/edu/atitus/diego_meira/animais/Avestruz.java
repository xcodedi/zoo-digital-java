package br.edu.atitus.diego_meira.animais;

import br.edu.atitus.diego_meira.comportamentos.Corrida;
import br.edu.atitus.diego_meira.comportamentos.Nado;
import br.edu.atitus.diego_meira.comportamentos.Predacao;
import br.edu.atitus.diego_meira.especies.Ave;

public final class Avestruz extends Ave implements Corrida, Nado, Predacao {

    public Avestruz(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("sementes, folhas e pequenos insetos");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está emitindo sons  de avestruz!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está atravessando a água nadando!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo rapidamente pela savana!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está procurando e capturando pequenos insetos!");
    }
}