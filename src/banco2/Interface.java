package banco2;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();

        System.out.println("TIPO DE CONTA QUE DESEJA ABRIR");
        System.out.println("[1] - Conta Corrente");
        System.out.println("[2] - Conta Poupança");
        System.out.print("Digite a opção: ");
        int tipo = scan.nextInt();
        conta.setTipoConta(tipo);
    }
}
