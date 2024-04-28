package atividade1;

class Funcionario extends Thread {
    private Banco banco;
    private Conta contaSalario;
    private Conta contaInvestimento;
    private String nome;

    public Funcionario(String nome, Banco banco) {
        this.nome = nome;
        this.banco = banco;
        this.contaSalario = nome.equals("Funcionário 1") ? banco.getContaFuncionario1Salario() : banco.getContaFuncionario2Salario();
        this.contaInvestimento = nome.equals("Funcionário 1") ? banco.getContaFuncionario1Investimento() : banco.getContaFuncionario2Investimento();
    }

    public void run() {
        while (!banco.verificarPagamentoFuncionarios()) {
            // Espera até que o pagamento seja possível
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        banco.pagarFuncionarios();
    }
}
