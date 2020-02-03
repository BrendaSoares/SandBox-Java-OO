package Service;

import model.Conta;

public class ServicoConta {

    public double sacar(Conta conta, double valor) {
        if (conta.getSaldo() >= valor) {
            double saldoAtual = conta.getSaldo() - valor;
            System.out.println("\nSaque Efetuado com Sucesso!\nSeu Saldo atual é: " + saldoAtual);
            return saldoAtual;
        } else {
            throw new RuntimeException("Saldo insuficiente!");
        }
    }

    public double depositar(Conta conta, double valor) {
        double saldoAtual = conta.getSaldo() + valor;

        System.out.println("\nDeposito Efetuado com Sucesso!\nSeu saldo atual é: " + saldoAtual);
        return saldoAtual;
    }

    public double calculaRendimento(Conta conta) {
        double rendimentoMensal = conta.getSaldo() * 0.1;

        System.out.println("\nSeu rendimento mensal é: " + rendimentoMensal);
        return rendimentoMensal;
    }
}
