package br.com.PadroesGof.builder;

import br.com.PadroesGof.builder.characterBuilder.CharacterDirector;
import br.com.PadroesGof.builder.characterBuilder.FighterBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) throws InterruptedException {

		Scanner scanner = new Scanner(System.in);

		// Criando o builder para o Lutador
		FighterBuilder fighterBuilder = new FighterBuilder();
		CharacterDirector director = new CharacterDirector(fighterBuilder);

		// Recebendo valores do usuário para o Lutador
		System.out.println("Digite os atributos para o Lutador:");
		System.out.print("Vida: ");
		int life = scanner.nextInt();
		life = Math.max(0, Math.min(1000, life)); // Limitando entre 0 e 1000
		System.out.print("Dano: ");
		int damage = scanner.nextInt();
		damage = Math.max(0, Math.min(1000, damage)); // Limitando entre 0 e 1000
		System.out.print("Resistência: ");
		int resistance = scanner.nextInt();
		resistance = Math.max(0, Math.min(1000, resistance)); // Limitando entre 0 e 1000
		System.out.print("Poder: ");
		int power = scanner.nextInt();
		power = Math.max(0, Math.min(1000, power)); // Limitando entre 0 e 1000
		System.out.print("Arma (Adaga ou Espada): ");
		String weapon = scanner.next();

		// Construindo o Lutador
		director.construct(life, damage, resistance, power, weapon);
		Character fighter = new FighterBuilder().getResult();

		// Criando o Vilão
		Character villain = new Character(2000, 300, 0, 1000, "foice em chamas");

		// Simulação de combate
		System.out.println("\n--- Começando o combate ---");
		while (fighter.life > 0 && villain.life > 0) {
			// Lutador ataca o Vilão
			fighter.wait(villain);

			// Vilão ataca o Lutador
			if (villain.life > 0) {
				villain.wait(fighter);
			}
		}

		// Verificando o vencedor
		if (fighter.life <= 0) {
			System.out.println("O Vilão venceu!");
		} else {
			System.out.println("O Lutador venceu!");
		}

	}
}
