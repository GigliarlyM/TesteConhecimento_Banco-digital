package br.gigliarly;

import br.gigliarly.conta.ContaCorrente;
import br.gigliarly.conta.ContaInterface;
import br.gigliarly.conta.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente gigliarly = new Cliente();
        gigliarly.nome("Gigliarly");

        ContaInterface contaCorrente = new ContaCorrente(gigliarly);
        ContaInterface contaPoupanca = new ContaPoupanca(gigliarly);

        List<ContaInterface> contas = new ArrayList<ContaInterface>() {{
            add(contaPoupanca);
            add(contaCorrente);
        }};

        Banco bancoMagico = new Banco();
        bancoMagico.nome("Magico");
        bancoMagico.contas(contas);

        contaCorrente.depositar(200);
        System.out.println(contaCorrente);
        contaCorrente.transferir(100, contaPoupanca);
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}