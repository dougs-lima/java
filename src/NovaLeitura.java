import java.util.Scanner;

public class NovaLeitura {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = leitura.nextInt();
        System.out.println("Digite seu peso: ");
        double peso = leitura.nextDouble();

        System.out.printf("""
                Nome: %s
                Idade: %d
                Peso: %.2f
                """, nome, idade, peso);
    }
}
