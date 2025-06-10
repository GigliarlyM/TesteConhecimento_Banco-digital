package br.gigliarly.conta;

import br.gigliarly.Cliente;

abstract class Conta implements ContaInterface {
    private static final int NUMERO_AGENCIA = 1;
    private static int NUMERO_CONTA = 1;

    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    protected Cliente titular;

    public Conta(Cliente titular) {
        this.agencia = NUMERO_AGENCIA;
        this.numero = NUMERO_CONTA++;
        this.titular = titular;
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.saldo) {
            valor = this.saldo;
        }
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, ContaInterface contaFinal) {
        this.sacar(valor);
        contaFinal.depositar(valor);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double saldo() {
        return saldo;
    }

    public Cliente titular() {
        return titular;
    }

    public void titular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}
