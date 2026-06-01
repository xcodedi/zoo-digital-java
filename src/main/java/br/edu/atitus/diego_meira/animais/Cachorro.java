package br.edu.atitus.diego_meira.animais;

import br.edu.atitus.diego_meira.comportamentos.Corrida;
import br.edu.atitus.diego_meira.comportamentos.Nado;
import br.edu.atitus.diego_meira.comportamentos.Predacao;
import br.edu.atitus.diego_meira.especies.Mamifero;


public final class Cachorro extends Mamifero implements Corrida, Nado, Predacao {
    public Cachorro(String nome, Integer idade) {
        super(nome, idade, true);

    }
    @Override
    public void comer() {
        this.comer("ração");
    }
    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está latindo!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando estilo cachorrinho!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo por todo o pátio!");
    }

    @Override
    public void cacar() { IO.println(this.getNome() + " está caçando o gato!");
    }
    
}
