package br.gigliarly;

import br.gigliarly.conta.ContaInterface;

import java.util.List;

public class Banco {
    private String nome;
    private List<ContaInterface> contas;

    public String nome() {
        return nome;
    }

    public void nome(String nome) {
        this.nome = nome;
    }

    public List<ContaInterface> contas() {
        return contas;
    }

    public void contas(List<ContaInterface> contas) {
        this.contas = contas;
    }
}
