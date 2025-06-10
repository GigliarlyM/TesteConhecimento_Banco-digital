package br.gigliarly;

public class Cliente {
    private String nome;

    public void nome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
