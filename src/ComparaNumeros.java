import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args){
        Scanner leituraNumeros = new Scanner(System.in);
        int n1, n2;

        System.out.println("Insira o primeiro número: ");
        n1 = leituraNumeros.nextInt();
        System.out.println("Insira o segundo número: ");
        n2 = leituraNumeros.nextInt();

        if (n1 == n2){
            System.out.println(String.format("%d e %d são iguais", n1, n2));
        } else if (n1 > n2){
            System.out.println(String.format("%d é maior que %d", n1, n2));
        } else {
            System.out.println(String.format("%d é maior que %d", n2, n1));
        }
    }
}
