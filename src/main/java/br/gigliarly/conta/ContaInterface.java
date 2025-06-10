package br.gigliarly.conta;

public interface ContaInterface {
    void sacar(double valor);

    void transferir(double valor, ContaInterface contaFinal);

    void depositar(double valor);
}
