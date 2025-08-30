package com.jokempo;

public class Jogador {

    private String nome;
    private Jogada jogada;

    public Jogador(String nome, Jogada jogada){
        this.jogada = jogada;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogada getJogada() {
        return jogada;
    }

    public void setJogada(Jogada jogada) {
        this.jogada = jogada;
    }

    
}
