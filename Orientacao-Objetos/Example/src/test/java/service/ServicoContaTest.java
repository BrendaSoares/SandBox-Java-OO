package service;

import model.Conta;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServicoContaTest {

    ServicoConta servicoConta;
    Conta conta;

    @Before
    public void setUP(){
        servicoConta = new ServicoConta();
    }

    @Test
    public void adicionar() {
        conta = new Conta("Brenda", 1111, "Santander", 500.0);

        Assert.assertTrue(servicoConta.adicionar(conta));
    }

    @Test
    public void sacar() {
        conta = new Conta("Brenda", 1111, "Santander", 500.0);

        servicoConta.adicionar(conta);

        Assert.assertTrue(servicoConta.sacar(conta,200.0));
    }

    @Test
    public void depositar() {
        conta = new Conta("Brenda", 1111, "Santander", 500.0);

        servicoConta.adicionar(conta);

        Assert.assertTrue(servicoConta.depositar(conta,1000.0));
    }

    @Test
    public void calculaRendimento() {
        conta = new Conta("Brenda", 1111, "Santander", 500.0);

        servicoConta.adicionar(conta);

        Assert.assertTrue(servicoConta.calculaRendimento(conta));
    }
}