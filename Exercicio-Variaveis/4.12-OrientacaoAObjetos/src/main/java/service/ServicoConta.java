package service;

import model.Conta;

import java.util.ArrayList;
import java.util.List;

public class ServicoConta {

    List<Conta> contas = new ArrayList<>();

    public boolean adicionar(Conta conta) {
        if (contas.contains(conta)) {
            throw new RuntimeException("Esta conta já existe!");
        } else {
            contas.add(conta);
            return true;
        }
    }

    public boolean sacar(Conta conta, double valor) {
        if (contas.contains(conta)) {
            if (conta.getSaldo() >= valor) {
                double saldoAtual = conta.getSaldo() - valor;
                System.out.println("\nSaque Efetuado com Sucesso!\nSeu Saldo atual é: " + saldoAtual);
                return true;
            } else {
                throw new RuntimeException("Saldo insuficiente!");
            }
        }else {
            throw new RuntimeException("Esta conta não está cadastrada!");
        }
    }

    public boolean depositar(Conta conta, double valor) {
        if (contas.contains(conta)) {
            double saldoAtual = conta.getSaldo() + valor;

            System.out.println("\nDeposito Efetuado com Sucesso!\nSeu saldo atual é: " + saldoAtual);
            return true;
        } else {
            throw new RuntimeException("Esta conta não esta cadastrada!");
        }
    }

    public boolean calculaRendimento(Conta conta) {
        if (contas.contains(conta)) {
            double rendimentoMensal = conta.getSaldo() * 0.1;

            System.out.println("\nSeu rendimento mensal é: " + rendimentoMensal);
            return true;
        } else {
            throw new RuntimeException("Esta conta não esta cadastrada!");
        }
    }
}
