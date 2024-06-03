import Personagem.Personagem;
import PersonagemBuilder.PersonagemBuilder;
import enuns.PersonagemEnuns;

import java.util.Scanner;

public class BuilderApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo ao nosso jogo! " +
                "Seu objetivo é vencer o vilão, atribuindo pontos para cada característica dos personagens.\n" +
                "Regras: \n" +
                "1. É obrigatória a atribuição de pelo menos 1 (um) ponto por característica a cada personagem.\n" +
                "2. Escolha numeros entre 500 a 1000 pontos para os poderes.\n");

        //Lutadora
        System.out.println("Criando uma lutadora:\n");

        int danoLutadora;
        do {
            System.out.print("Dano: ");
            danoLutadora = input.nextInt();
            if (danoLutadora <= 0) {
                System.out.println("O dano deve ser um valor positivo.");
            }
        } while (danoLutadora <= 0);

        int resistenciaLutadora;
        do {
            System.out.print("Resistência: ");
            resistenciaLutadora = input.nextInt();
            if (resistenciaLutadora <= 0) {
                System.out.println("A resistência deve ser um valor positivo.");
            }
        } while (resistenciaLutadora <= 0);

        int vidaLutadora;
        do {
            System.out.print("Vida: ");
            vidaLutadora = input.nextInt();
            if (vidaLutadora <= 0) {
                System.out.println("A vida deve ser um valor positivo.");
            }
        } while (vidaLutadora <= 0);

        System.out.println("As armas disponíveis para essa classe são: adaga (1,5 vezes mais resistência) ou espada (1,5 vezes mais dano).");
        System.out.println("Arma: ");
        input.nextLine();
        String armaLutadora = input.next();
        if (armaLutadora.equalsIgnoreCase ("adaga")) {
            resistenciaLutadora = (int) (resistenciaLutadora * 1.5);
        }
        else if (armaLutadora.equalsIgnoreCase ("espada")) {
            danoLutadora = (int) (danoLutadora * 1.5);
        }
        else {
            System.out.println("A arma inserida é inválida.");
        }
        Personagem lutadora = new PersonagemBuilder()
                .setDano(danoLutadora)
                .setResistencia(resistenciaLutadora)
                .setVida(vidaLutadora)
                .setArma(armaLutadora)
                .build();
        long TotalLutadora = (danoLutadora + resistenciaLutadora + vidaLutadora);
        System.out.println("Lutadora criada!\n" + "Quantidade de pontos ontos obtido:" + TotalLutadora + "\n");



        //Guerreiro
        System.out.println("Criando um guerreiro:\n");

        int danoGuerreiro;
        do {
            System.out.print("Dano: ");
            danoGuerreiro = input.nextInt();
            if (danoGuerreiro <= 0) {
                System.out.println("O dano deve ser um valor positivo.");
            }
        } while (danoGuerreiro <= 0);

        int resistenciaGuerreiro;
        do {
            System.out.print("Resistência: ");
            resistenciaGuerreiro = input.nextInt();
            if (resistenciaGuerreiro <= 0) {
                System.out.println("A resistência deve ser um valor positivo.");
            }
        } while (resistenciaGuerreiro <= 0);

        int vidaGuerreiro;
        do {
            System.out.print("Vida: ");
            vidaGuerreiro = input.nextInt();
            if (vidaGuerreiro <= 0) {
                System.out.println("A vida deve ser um valor positivo.");
            }
        } while (vidaGuerreiro <= 0);

        System.out.println("As armas disponíveis para essa classe são: machado (1,5 vezes mais resistência) ou machado duplo (1,5 vezes mais dano).");
        System.out.println("Arma: ");
        input.nextLine();
        String armaGuerreiro = input.nextLine();
        if (armaGuerreiro.equalsIgnoreCase ("machado")) {
            resistenciaGuerreiro = (int) (resistenciaGuerreiro * 1.5);
        }
        else if (armaGuerreiro.equalsIgnoreCase ("machado duplo")) {
            danoGuerreiro = (int) (danoGuerreiro * 1.5);
        }
        else {
            System.out.println("A arma inserida é inválida.");
        }
        Personagem guerreiro = new PersonagemBuilder()
                .setDano(danoGuerreiro)
                .setResistencia(resistenciaGuerreiro)
                .setVida(vidaGuerreiro)
                .setArma(armaGuerreiro)
                .build();
        long TotalGuerreiro = (danoGuerreiro + resistenciaGuerreiro + vidaGuerreiro);
        System.out.println("Guerreiro criado!\n" + "Quantidade de pontos ontos obtido:" + (TotalGuerreiro) + "\n");


        //Arqueira
        System.out.println("Criando uma arqueira:\n");

        int danoArqueira;
        do {
            System.out.print("Dano: ");
            danoArqueira = input.nextInt();
            if (danoArqueira <= 0) {
                System.out.println("O dano deve ser um valor positivo.");
            }
        } while (danoArqueira <= 0);

        int resistenciaArqueira;
        do {
            System.out.print("Resistência: ");
            resistenciaArqueira = input.nextInt();
            if (resistenciaArqueira <= 0) {
                System.out.println("A resistência deve ser um valor positivo.");
            }
        } while (resistenciaArqueira <= 0);

        int vidaArqueira;
        do {
            System.out.print("Vida: ");
            vidaArqueira = input.nextInt();
            if (vidaArqueira <= 0) {
                System.out.println("A vida deve ser um valor positivo.");
            }
        } while (vidaArqueira <= 0);
        System.out.println("As armas disponíveis para essa classe são: arco composto (1,5 mais dano) ou arco longo (2 vezes mais dano, metade da resistência).");
        System.out.println("Arma: ");
        input.nextLine();
        String armaArqueira = input.nextLine();
        if (armaArqueira.equalsIgnoreCase ("arco composto")) {
            danoArqueira = (int) (danoArqueira * 1.5);
        }
        else if (armaArqueira.equalsIgnoreCase ("arco longo")) {
            danoArqueira = (danoArqueira * 2);
            resistenciaArqueira = (resistenciaArqueira/2);
        }
        else {
            System.out.println("A arma inserida é inválida.");
        }
        Personagem arqueira = new PersonagemBuilder()
                .setDano(danoArqueira)
                .setResistencia(resistenciaArqueira)
                .setVida(vidaArqueira)
                .setArma(armaArqueira)
                .build();
        long TotalArqueira = (danoArqueira + resistenciaArqueira + vidaArqueira);
        System.out.println("Arqueira criada!\n" + "Quantidade de pontos ontos obtido:" + (TotalArqueira) + "\n");


        //Druida
        System.out.println("Criando um druida:\n");

        int danoDruida;
        do {
            System.out.print("Dano: ");
            danoDruida = input.nextInt();
            if (danoDruida <= 0) {
                System.out.println("O dano deve ser um valor positivo.");
            }
        } while (danoDruida <= 0);

        int resistenciaDruida;
        do {
            System.out.print("Resistência: ");
            resistenciaDruida = input.nextInt();
            if (resistenciaDruida <= 0) {
                System.out.println("A resistência deve ser um valor positivo.");
            }
        } while (resistenciaDruida <= 0);

        int vidaDruida;
        do {
            System.out.print("Vida: ");
            vidaDruida = input.nextInt();
            if (vidaDruida <= 0) {
                System.out.println("A vida deve ser um valor positivo.");
            }
        } while (vidaDruida <= 0);
        int manaDruida;
        do {
            System.out.print("Mana: ");
            manaDruida = input.nextInt();
            if (manaDruida <= 0) {
                System.out.println("A mana deve ser um valor positivo.");
            }
        } while (manaDruida <= 0);
        System.out.println("Os poderes disponíveis para essa classe são: animal encurralado (1,5 vezes mais dano) ou arma arcana (2 vezes mais dano, metade da resistência).");
        System.out.println("Poder: ");
        input.nextLine();
        String poderDruida = input.nextLine();
        if (poderDruida.equalsIgnoreCase ("animal encurralado")) {
            danoDruida = (int) (danoDruida * 1.5);
        }
        else if (poderDruida.equalsIgnoreCase ("arma arcana")) {
            danoDruida = (danoDruida * 2);
            resistenciaDruida = (resistenciaDruida/2);
        }
        else {
            System.out.println("O poder inserida é inválido.");
        }
        Personagem druida = new PersonagemBuilder()
                .setDano(danoDruida)
                .setResistencia(resistenciaDruida)
                .setVida(vidaDruida)
                .setMana(manaDruida)
                .setPoder(poderDruida)
                .setArma("foice trevosaaaa")
                .build();
        long TotalDruida = (danoDruida + resistenciaDruida + vidaDruida + manaDruida);
        System.out.println("Druida criado!\n" + "Quantidade de pontos ontos obtido:" + (TotalDruida) + "\n");



        //Feiticeira
        System.out.println("Criando uma feiticeira:\n");

        int danoFeiticeira;
        do {
            System.out.print("Dano: ");
            danoFeiticeira = input.nextInt();
            if (danoFeiticeira <= 0) {
                System.out.println("O dano deve ser um valor positivo.");
            }
        } while (danoFeiticeira <= 0);

        int resistenciaFeiticeira;
        do {
            System.out.print("Resistência: ");
            resistenciaFeiticeira = input.nextInt();
            if (resistenciaFeiticeira <= 0) {
                System.out.println("A resistência deve ser um valor positivo.");
            }
        } while (resistenciaFeiticeira <= 0);

        int vidaFeiticeira;
        do {
            System.out.print("Vida: ");
            vidaFeiticeira = input.nextInt();
            if (vidaFeiticeira <= 0) {
                System.out.println("A vida deve ser um valor positivo.");
            }
        } while (vidaFeiticeira <= 0);
        int manaFeiticeira;
        do {
            System.out.print("Mana: ");
            manaFeiticeira = input.nextInt();
            if (manaFeiticeira <= 0) {
                System.out.println("A mana deve ser um valor positivo.");
            }
        } while (manaFeiticeira <= 0);
        System.out.println("Os poderes disponíveis para essa classe são: duelista arcano (2 vezes mais dano, metade da mana) ou escudo fraterno (1/3 da resistência, duas vezes mais vida).");
        System.out.println("Poder: ");
        input.nextLine();
        String poderFeiticeira = input.nextLine();
        if (poderFeiticeira.equalsIgnoreCase ("duelista arcano")) {
            danoFeiticeira = (int) (danoFeiticeira * 2);
            manaFeiticeira = (int) (manaFeiticeira/2);
        }
        else if (poderFeiticeira.equalsIgnoreCase ("escudo fraterno")) {
            vidaFeiticeira = (vidaFeiticeira*2);
            resistenciaFeiticeira = (resistenciaFeiticeira/3);
        }
        else {
            System.out.println("O poder inserida é inválido.");
        }
        Personagem feiticeira = new PersonagemBuilder()
                .setDano(danoFeiticeira)
                .setResistencia(resistenciaFeiticeira)
                .setVida(vidaFeiticeira)
                .setMana(manaFeiticeira)
                .setPoder(poderFeiticeira)
                .setArma("magia infernal")
                .build();
        long TotalFeiticeira = (danoFeiticeira + resistenciaFeiticeira + vidaFeiticeira + manaFeiticeira);
        System.out.println("Feiticeira criado!\n" + "Quantidade de pontos obtido:" + (TotalFeiticeira) + "\n");
        System.out.println("------------------------------------------------------");

        //Quantidade de pontos da equipe por caracteristica e geral para fazer a conta
        long statsDano = (danoLutadora + danoGuerreiro + danoArqueira + danoDruida + danoFeiticeira);
        System.out.println("A quantidade de Dano da equipe:" + statsDano);

        long statsResistencia = (resistenciaLutadora + resistenciaGuerreiro + resistenciaArqueira + resistenciaDruida + resistenciaFeiticeira);
        System.out.println("A quantidade de Resistencia da equipe:" + statsResistencia);

        long statsVida = (vidaLutadora + vidaGuerreiro + vidaArqueira + vidaDruida + vidaFeiticeira);
        System.out.println("A quantidade de Vida da esquipe:" + statsVida);

        long statsMana = (manaDruida + manaFeiticeira);
        System.out.println("A quantidade de Mana da Equipe:" + statsMana + "\n");
        //Poder e arma não contam, pq eles dão boost pras outras características

        long statsEquipe = (TotalLutadora + TotalGuerreiro + TotalArqueira + TotalDruida + TotalFeiticeira);
        System.out.println("A pontuação total da Equife foi:" + statsEquipe);
        System.out.println("------------------------------------------------------" +"\n");


        //Construção do vilão
        Personagem vilao = new Personagem(3400, 5000, 3400, 5000, "foice em chamas");
        System.out.println("Voces teram que enfrentar o Villão com um poder total de: 20000 pontos");


        // Simulação de combate
        System.out.println("\n--- Começando o combate ---\n");
        while (lutadora.getVida()  > 0 && guerreiro.getVida() > 0 && arqueira.getVida() > 0 && druida.getVida() > 0 && feiticeira.getVida() > 0 && vilao.getVida() > 0) {
            // Personagens ataca o Vilão
            lutadora.ataqueLutadora(vilao);
            guerreiro.ataqueGuerreiro(vilao);
            arqueira.ataqueArqueiro(vilao);
            druida.ataqueDruida(vilao);
            feiticeira.ataqueFeiticeira(vilao);

            // Vilão ataca a Lutadora
            if (vilao.getVida() > 0) {
                vilao.ataqueVilao(lutadora);
            }
        }
        System.out.println("------------------------------------------------------" +"\n");

        // Verificando o vencedor
        if (lutadora.getVida() <= 0) {
            System.out.println("\n O Vilão venceu!");
        } else {
            System.out.println(" \n Os personagens venceram!");
        }
    }
}
