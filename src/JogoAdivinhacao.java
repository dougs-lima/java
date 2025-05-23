import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        int arrisca = 0;
        boolean acertou = false;

        System.out.println("Adivinhe um número de 1 a 100.");

        for (int i = 0; i < 5 && !acertou; i++) {
            System.out.println("Digite um número: ");
            arrisca = leitura.nextInt();

            if (arrisca == numero) {
                System.out.printf("Você acertou o número em %d tentativa(s)!!! Parabéns!!!", i+1);
                acertou = true;
            } else if (arrisca > numero) {
                System.out.println("Você arriscou alto!");
            } else {
                System.out.println("Você arriscou baixo!");
            }
        }
        if (!acertou){
            System.out.println("Você não conseguiu! O número era: " + numero);
        }
    }
}
