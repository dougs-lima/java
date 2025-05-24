import java.util.Scanner;

public class Transacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoInicial = 2500.0;
        double receberValor;
        double transferirValor;
        int escolha = 0;
        System.out.println(String.format("""
                    *********************************************
                    Dados iniciais do cliente:
                    
                    Nome:           Douglas Lima
                    Tipo conta:     Corrente
                    Saldo inicial:  R$%.2f
                    *********************************************
                    """, saldoInicial));
        while (escolha != 4) {
            System.out.print(String.format("""
                    Operações:
                    
                    [1] - Consultar saldos
                    [2] - Receber valor
                    [3] - Tranferir valor
                    [4] - Sair
                    
                    Digite a opção desejada:
                    """));
            escolha = scanner.nextInt();
            switch (escolha){
                case 1:
                    System.out.println(String.format("O Saldo atual é R$%.2f", saldoInicial));
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    receberValor = scanner.nextDouble();
                    saldoInicial += receberValor;
                    System.out.println(String.format("O saldo atual é R$%.2f", saldoInicial));
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    transferirValor = scanner.nextDouble();
                    if (transferirValor > saldoInicial || transferirValor <= 0){
                        System.out.println("Saldo negado!");
                    } else {
                        saldoInicial -= transferirValor;
                        System.out.println(String.format("O saldo atual é R$%.2f", saldoInicial));
                    }
                    break;
                case 4:
                    System.out.println("Sessão encerrada.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
