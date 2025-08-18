package com.jokempo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] mao = { "pedra", "papel", "tesoura" };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("======JOKEMPO=======");
        System.out.println("Escolha: pedra, papel, tesoura");

        String escolhaDoUsuario = scanner.nextLine().toLowerCase();

        System.out.println(":" + escolhaDoUsuario);

        if (!escolhaValida(escolhaDoUsuario)) {
            System.out.println("Escolha invalida");
            scanner.close();
            return;

        }

        String escolhaCpu = mao[random.nextInt(3)];
        System.out.println("A escolha do computador é: " + escolhaCpu);

        if (escolhaDoUsuario.equals(escolhaCpu)) {
            System.out.println("Empate!");
            scanner.close();
            return;
        } else if (escolhaDoUsuario.equals("tesoura") && escolhaCpu.equals("papel")
                || escolhaDoUsuario.equals("pedra") && escolhaCpu.equals("tesoura")
                || escolhaDoUsuario.equals("papel") && escolhaCpu.equals("pedra")) {
            System.out.println("Você ganhou!!");

        } else {
            System.out.println("Você perdeu!!");
        }
        scanner.close();

    }

    private static boolean escolhaValida(String escolhaDoUsuario) {
        return escolhaDoUsuario.equals("pedra")
                || escolhaDoUsuario.equals("papel")
                || escolhaDoUsuario.equals("tesoura");
    }
}