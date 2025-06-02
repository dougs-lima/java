package metodos2;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultaSaldo();
        } else {
            System.out.println("Não vai ser possível realizar saque. Saldo insuficiente");
        }

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de R$500,00");
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultaSaldo();
        } else {
            System.out.println("Não vai ser possível realizar saque. Saldo insuficiente");
        }
        System.out.println("Depósito de 500 reais");
        conta.depositar(500);
        conta.consultaSaldo();

        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não esta usando cheque especial");
        }

        conta.realizarSaque(600);

        conta.consultaSaldo();
        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não esta usando cheque especial");
        }
    }
}
