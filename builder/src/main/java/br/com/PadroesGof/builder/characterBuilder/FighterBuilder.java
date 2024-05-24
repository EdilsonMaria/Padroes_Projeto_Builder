package br.com.PadroesGof.builder.characterBuilder;

import br.com.PadroesGof.builder.interfacce.CharacterBuilder;

public class FighterBuilder implements CharacterBuilder {
    private int life;
    private int damage;
    private int resistance;
    private int power;
    private String weapon;

    @Override
    public void buildLife(int life) {
        this.life = life;
    }

    @Override
    public void buildDamage(int damage) {
        this.damage = damage * 3 / 2; // Aumenta o dano em 1.5 vezes
    }

    @Override
    public void buildResistance(int resistance) {
        this.resistance = resistance;
    }

    @Override
    public void buildPower(int power) {
        this.power = power;
    }

    @Override
    public void buildWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Character getResult() {
        return new Character(life, damage, resistance, power, weapon);
    }
}