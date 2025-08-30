package com.jokempo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cpu cpu = new Cpu();

        System.out.println("======JOKEMPO=======");
        System.out.println("Escolha: pedra, papel, tesoura - pode digitar");

        String escolhaDoUsuario = scanner.nextLine().toLowerCase();

        System.out.println(":" + escolhaDoUsuario);

        if (!escolhaValida(escolhaDoUsuario)) {
            System.out.println("Escolha invalida");
            scanner.close();
            return;

        }

        Jogada jogadaUsuario = Jogada.valueOf(escolhaDoUsuario.toUpperCase());
        Jogada jogadaCpu = cpu.escolherJogada();

        System.out.println("A escolha do computador é: " + jogadaCpu.name().toLowerCase());

        if (jogadaUsuario == jogadaCpu) {
            System.out.println("Empate!");
            scanner.close();
            return;
        } else if (jogadaUsuario.venceDe(jogadaCpu)) {
            System.out.println("Você ganhou!!");
        } else {
            System.out.println("Você perdeu!!");
        }
        scanner.close();

    }

    private static boolean escolhaValida(String escolhaDoUsuario) {
        for (Jogada jogada : Jogada.values()) {
            if (jogada.name().equalsIgnoreCase(escolhaDoUsuario)) {
                return true;
            }
        }
        return false;

    }

}