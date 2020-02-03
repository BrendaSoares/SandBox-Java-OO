package main;

import Service.ServicoConta;
import model.Conta;

public class Main {

    public static void main(String[] args){

        Conta conta = new Conta("Brenda Soares", 5689, "Bradesco", 1000.0);

        ServicoConta servicoConta = new ServicoConta();

        servicoConta.depositar(conta, 500.0);
        servicoConta.sacar(conta, 100.0);
        servicoConta.calculaRendimento(conta);
    }
}
