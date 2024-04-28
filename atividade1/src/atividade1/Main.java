package atividade1;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco(0, 0);

        System.out.println("Saldo inicial das contas:");
        System.out.println("Conta da Loja 1: " + banco.getContaLoja1().getSaldo());
        System.out.println("Conta da Loja 2: " + banco.getContaLoja2().getSaldo());

        Cliente[] clientes = new Cliente[5];
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente("Cliente " + (i + 1), banco);
            clientes[i].start();
        }

        Funcionario funcionario1 = new Funcionario("Funcionário 1", banco);
        Funcionario funcionario2 = new Funcionario("Funcionário 2", banco);
        funcionario1.start();
        funcionario2.start();

        try {
            funcionario1.join();
            funcionario2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nSaldo final das contas:");
        System.out.println("Conta da Loja 1: " + banco.getContaLoja1().getSaldo());
        System.out.println("Conta da Loja 2: " + banco.getContaLoja2().getSaldo());
        System.out.println("Conta do Funcionário 1 (Salário): " + banco.getContaFuncionario1Salario().getSaldo());
        System.out.println("Conta do Funcionário 1 (Investimento): " + banco.getContaFuncionario1Investimento().getSaldo());
        System.out.println("Conta do Funcionário 2 (Salário): " + banco.getContaFuncionario2Salario().getSaldo());
        System.out.println("Conta do Funcionário 2 (Investimento): " + banco.getContaFuncionario2Investimento().getSaldo());
    }
}