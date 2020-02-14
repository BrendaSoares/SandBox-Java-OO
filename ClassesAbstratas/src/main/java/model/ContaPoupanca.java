package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimeExtrato() {
        System.out.println("------ Extrato da Conta -----");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa");
        Date date = new Date();

        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + sdf.format(date));
    }

}
