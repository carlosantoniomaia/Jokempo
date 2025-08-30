package com.jokempo;

import java.util.Random;

public class Cpu {
    Random random = new Random();

    public Jogada escolherJogada() {
        return Jogada.values()[random.nextInt(Jogada.values().length)];
    }
}
