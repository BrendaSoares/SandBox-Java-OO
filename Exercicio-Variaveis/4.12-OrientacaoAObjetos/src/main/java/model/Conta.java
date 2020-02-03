package model;

import java.time.LocalDate;

public class Conta {

    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private LocalDate dataAbertura = LocalDate.now();


    public Conta(String nomeTitular, int numero, String agencia, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }
}
