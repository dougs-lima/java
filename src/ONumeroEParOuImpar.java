import java.util.Scanner;

public class ONumeroEParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número maior que 0: ");
        int numero = leitura.nextInt();

        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println(String.format("%d é um número par.", numero));
            } else {
                System.out.println(String.format("%d é um número impar.", numero));
            }
        } else {
                System.out.println(String.format("%d é um número inválido!", numero));
        }
    }
}


