import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leituraFatorial = new Scanner(System.in);
        System.out.println("Digite um número para ser fatorado! ");
        int numero = leituraFatorial.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
        }
    }
