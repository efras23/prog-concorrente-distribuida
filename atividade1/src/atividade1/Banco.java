package atividade1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Banco {
    private Conta contaLoja1;
    private Conta contaLoja2;
    private Conta contaFuncionario1Salario;
    private Conta contaFuncionario2Salario;
    private Conta contaFuncionario1Investimento;
    private Conta contaFuncionario2Investimento;
    private Lock lock = new ReentrantLock();

    public Banco(double saldoInicialLoja1, double saldoInicialLoja2) {
        contaLoja1 = new Conta(saldoInicialLoja1);
        contaLoja2 = new Conta(saldoInicialLoja2);
        contaFuncionario1Salario = new Conta(0);
        contaFuncionario2Salario = new Conta(0);
        contaFuncionario1Investimento = new Conta(0);
        contaFuncionario2Investimento = new Conta(0);
    }

    public void transferir(double valor, Conta origem, Conta destino) {
        lock.lock();
        try {
            origem.sacar(valor);
            destino.depositar(valor);
        } finally {
            lock.unlock();
        }
    }

    public synchronized boolean verificarPagamentoFuncionarios() {
        return contaLoja1.getSaldo() >= 2800 && contaLoja2.getSaldo() >= 2800;
    }

    public synchronized void pagarFuncionarios() {
        if (contaLoja1.getSaldo() >= 2800) {
            transferir(1400, contaLoja1, contaFuncionario1Salario);
            transferir(280, contaFuncionario1Salario, contaFuncionario1Investimento); // 20% do salário
            System.out.println("Funcionário 1 recebeu salário e fez investimento.");
        }
        if (contaLoja2.getSaldo() >= 2800) {
            transferir(1400, contaLoja2, contaFuncionario2Salario);
            transferir(280, contaFuncionario2Salario, contaFuncionario2Investimento); // 20% do salário
            System.out.println("Funcionário 2 recebeu salário e fez investimento.");
        }
    }

    public Conta getContaLoja1() {
        return contaLoja1;
    }

    public Conta getContaLoja2() {
        return contaLoja2;
    }

    public Conta getContaFuncionario1Salario() {
        return contaFuncionario1Salario;
    }

    public Conta getContaFuncionario2Salario() {
        return contaFuncionario2Salario;
    }

    public Conta getContaFuncionario1Investimento() {
        return contaFuncionario1Investimento;
    }

    public Conta getContaFuncionario2Investimento() {
        return contaFuncionario2Investimento;
    }
}