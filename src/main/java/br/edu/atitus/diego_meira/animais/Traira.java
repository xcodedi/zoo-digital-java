package br.edu.atitus.diego_meira.animais;

import br.edu.atitus.diego_meira.comportamentos.Nado;
import br.edu.atitus.diego_meira.especies.Peixe;

public class Traira extends Peixe implements Nado {

    public Traira(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void comer() {
        this.comer("lambaris");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está borbulhando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando no rio");
    }
    
}