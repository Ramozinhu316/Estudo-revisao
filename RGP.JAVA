package com.mycompany.rgp;

public class RPG {

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao RPG de Turnos!");

        // Criando o jogador
        Jogador jogador = Jogador.criarJogador();
        System.out.println("\n" + jogador.nome + ", sua jornada começa agora!");

        // Criando inimigos
        inimigo inimigo1 = new inimigo("Goblin", 50, 8, 3);
        inimigo inimigo2 = new inimigo("Orc", 80, 12, 6);

        // Iniciando combate
        Combate.iniciarCombate(jogador, inimigo1);
        if (jogador.estaVivo()) {
            Combate.iniciarCombate(jogador, inimigo2);
        }

        if (jogador.estaVivo()) {
            System.out.println("\nParabéns, " + jogador.nome + ", você completou sua jornada!");
        }
    }
}
