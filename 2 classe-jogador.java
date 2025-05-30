package com.mycompany.rgp;

import java.util.Scanner;

public class Jogador extends personagem {

    public Jogador(String nome) {
        super(nome, 100, 1, 10, 5);
    }

    public void usarHabilidade() {
        System.out.println(this.nome + " usou uma habilidade especial!");
    }

    public static Jogador criarJogador() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do seu personagem: ");
        String nome = scanner.nextLine();
        return new Jogador(nome);
    }
}
