package PersonagemBuilder;

import Personagem.Personagem;

public class PersonagemBuilder {
    private int dano;
    private int resistencia;
    private int vida;
    private int mana;
    private String arma;
    private String poder;


    public PersonagemBuilder() {
        this.dano = 0;
        this.resistencia = 0;
        this.vida = 0;
        this.mana = 0;
    }

    public PersonagemBuilder setDano(int dano) {
        this.dano = dano;
        return this;
    }

    public PersonagemBuilder setResistencia(int resistencia) {
        this.resistencia = resistencia;
        return this;
    }

    public PersonagemBuilder setVida(int vida) {
        this.vida = vida;
        return this;
    }

    public PersonagemBuilder setMana(int mana) {
        this.mana = mana;
        return this;
    }

    public PersonagemBuilder setArma(String arma) {
        this.arma = arma;
        return this;
    }

    public PersonagemBuilder setPoder(String poder) {
        this.poder = poder;
        return this;
    }

    public Personagem build() {
        return new Personagem(dano, resistencia, vida, mana, arma);
    }



}
