package br.com.PadroesGof.builder.character;

public class Character {
    private int life;
    private int damage;
    private int resistance;
    private int power;
    private String weapon;

    public Character(int life, int damage, int resistance, int power, String weapon) {
        this.life = life;
        this.damage = damage;
        this.resistance = resistance;
        this.power = power;
        this.weapon = weapon;
    }

    public void attack(Character target) {
        System.out.println("Ataque com " + weapon + " causando " + damage + " de dano!");
        target.receiveDamage(damage);
    }

    public void receiveDamage(int damage) {
        life -= damage;
        if (life <= 0) {
            System.out.println("Este personagem foi derrotado!");
        }
    }

}
