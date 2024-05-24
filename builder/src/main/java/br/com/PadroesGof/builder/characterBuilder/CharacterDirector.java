package br.com.PadroesGof.builder.characterBuilder;

import br.com.PadroesGof.builder.interfacce.CharacterBuilder;

public class CharacterDirector {
    private CharacterBuilder builder;

    public CharacterDirector(CharacterBuilder builder) {
        this.builder = builder;
    }

    public void construct(int life, int damage, int resistance, int power, String weapon) {
        builder.buildLife(life);
        builder.buildDamage(damage);
        builder.buildResistance(resistance);
        builder.buildPower(power);
        builder.buildWeapon(weapon);
    }
}
