package main;


import controller.ControleDeBonificacoes;
import modelo.Funcionario;
import modelo.Gerente;

public class TestaGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        // podemos chamar métodos do Funcionario:
        gerente.setNome("João da Silva");

        // e também métodos do Gerente!
        gerente.setSenha(4231);

        gerente.setSalario(5000.0);

        System.out.println(gerente.getBonificacao());

        System.out.println("--------------------------------------");

        // Exemplos Controle de Bonificação:
        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000.0);
        controle.registra(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(1000.0);
        controle.registra(funcionario2);

        System.out.println(controle.getTotalDeBonificacoes());
    }

}
