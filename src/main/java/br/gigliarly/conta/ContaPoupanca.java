package br.gigliarly.conta;

import br.gigliarly.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente titular) {
        super(titular);
    }

    @Override
    public String toString() {
        return "== Conta Poupanca ==\n"+super.toString();
    }
}
