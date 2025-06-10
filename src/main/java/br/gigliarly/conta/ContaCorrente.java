package br.gigliarly.conta;

import br.gigliarly.Cliente;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    @Override
    public String toString() {
        return "== Conta corrente ==\n" + super.toString();
    }
}
