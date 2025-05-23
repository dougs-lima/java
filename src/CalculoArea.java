import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.printf("""
                Escolha o que quer calcular!
                [1] - Area quadrado.
                [2] - Area circulo.
                [3] - Area triângulo.
                """);
        int selecao = leitura.nextInt();
        double area;
        switch (selecao) {
            case 1: // Calculo área quadrado //
                System.out.println("Digite um dos lados do quadrado: ");
                double lado1 = leitura.nextDouble();
                System.out.println("Digite o segundo lado do quadrado: ");
                double lado2 = leitura.nextDouble();
                area = lado1 * lado2;
                System.out.println(String.format("A área do quadrado é %.2f.", area));
                break;
            case 2: // Cálculo área circulo //
                System.out.println("Digite o raio do circulo");
                double raio = leitura.nextDouble();
                area = 3.14 * (raio * raio);
                System.out.println(String.format("A áre do circulo é %.2f.", area));
                break;
            case 3: // Cálculo área triângulo //
                System.out.println("Digite a base do triângulo: ");
                double base = leitura.nextDouble();
                System.out.println("Digite a altura do triangulo: ");
                double altura = leitura.nextDouble();
                area = (base * altura)/2;
                System.out.println(String.format("A área do triângulo é %.2f", area));
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
