package com.mycompany.rgp;

import java.util.Scanner;

public class Combate {

    public static void iniciarCombate(Jogador jogador, inimigo inimigo) {
        Scanner scanner = new Scanner(System.in);
        while (jogador.estaVivo() && inimigo.estaVivo()) {
            System.out.println("\n" + jogador.nome + ": " + jogador.vida + " HP | " + inimigo.nome + ": " + inimigo.vida + " HP");
            System.out.print("O que você deseja fazer? (1) Atacar (2) Fugir: ");
            String acao = scanner.nextLine();

            if (acao.equals("1")) {
                jogador.atacar(inimigo);
            } else if (acao.equals("2")) {
                System.out.println(jogador.nome + " fugiu da batalha!");
                break;
            } else {
                System.out.println("Escolha inválida! Tente novamente.");
                continue;
            }

            if (inimigo.estaVivo()) {
                inimigo.atacar(jogador);
            }

            if (jogador.estaVivo()) {
                jogador.subirNivel();  // O jogador sobe de nível após cada vitória.
                break;
            } else {
                System.out.println("Você perdeu a batalha!");
                break;
            }
        }
    }
}
