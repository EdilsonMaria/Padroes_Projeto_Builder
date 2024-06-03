package Personagem;

import enuns.PersonagemEnuns;

import java.lang.reflect.Array;

public class Personagem {
    private final int dano;
    private int resistencia;
    private int vida;
    private final int mana;
    private final String arma;
    private String poder = "Foice em Chamas";


    public Personagem(int dano, int resistencia, int vida, int mana, String arma) {
        this.dano = dano;
        this.resistencia = resistencia;
        this.vida = vida;
        this.mana = mana;
        this.arma = arma;
        this.poder = poder;
    }

    public int getDano() {
        return dano;
    }

    public int getResistencia() {return resistencia;}

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public String getArma() {
        return arma;
    }

    public String getPoder() {
        return poder;
    }

    public void ataqueLutadora(Personagem personagem) {
        System.out.println(PersonagemEnuns.LUTADORA + " atacou com " + arma + " causando " + dano + " de dano!");
        personagem.receberDano(dano);
    }
    public void ataqueGuerreiro(Personagem personagem) {
        System.out.println(PersonagemEnuns.GUERREIRO + " atacou com " + arma + " causando " + dano + " de dano!");
        personagem.receberDano(dano);
    }
    public void ataqueArqueiro(Personagem personagem) {
        System.out.println(PersonagemEnuns.ARQUEIRA + " atacou com " + arma + " causando " + dano + " de dano!");
        personagem.receberDano(dano);
    }
    public void ataqueDruida(Personagem personagem) {
        System.out.println(PersonagemEnuns.DRUIDA + " atacou com " + arma + " causando " + dano + " de dano!");
        personagem.receberDano(dano);
    }
    public void ataqueFeiticeira(Personagem personagem) {
        System.out.println(PersonagemEnuns.FEITICEIRA + " atacou com " + arma + " causando " + dano + " de dano!");
        personagem.receberDano(dano);
    }
    public void ataqueVilao(Personagem personagem) {
        personagem.receberDano(dano);
    }

    public void receberDano(int dano) {
        vida -= dano;
//        if (vida <= 0) {
//            System.out.println("Este personagem foi derrotado!");
//        }
    }


}
