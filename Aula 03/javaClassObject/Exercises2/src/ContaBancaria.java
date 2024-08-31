public class ContaBancaria {
    public int numeroConta;
    public float saldo;

    public ContaBancaria() {
    }

    public void depositarDinheiro(float valorDeposito) {
        saldo += valorDeposito;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Valor do saldo atualizado após o depósito: R$ " + saldo);
    }

    public void sacarDinheiro(float valorSaque) {
        if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Valor do saldo atualizado após o saque: R$ " + saldo);
        }
    }

    @Override
    public String toString() {
        return "Número da Conta: " + numeroConta + "\nSaldo: R$ " + saldo;
    }
}

