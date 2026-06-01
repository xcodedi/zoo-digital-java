package br.edu.atitus.diego_meira.animais;

import br.edu.atitus.diego_meira.comportamentos.Corrida;
import br.edu.atitus.diego_meira.comportamentos.Predacao;
import br.edu.atitus.diego_meira.comportamentos.Voo;
import br.edu.atitus.diego_meira.especies.Ave;

public final class Corvo extends Ave implements Corrida, Voo, Predacao {

    public Corvo(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("insetos, sementes e pequenos animais");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está grasnando!");
    }

    @Override
    public void voar() {
        IO.println(this.getNome() + " está voando pelos céus à procura de alimento!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo pelo chão em busca de comida!");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando insetos e pequenos animais!");
    }
}