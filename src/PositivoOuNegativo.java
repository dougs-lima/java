import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

        if (numero >= 0){
            System.out.println(String.format("O número %d é positivo.", numero));
        } else {
            System.out.println(String.format("O número %d é negativo.", numero));
        }
    }
}
