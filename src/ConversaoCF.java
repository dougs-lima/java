public class ConversaoCF {
    public static void main(String[] args) {
        double celsius = 31;
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(String.format("A temperatura de %.1f Celsius é equivalente a %.1f Fahrenheit.", celsius, fahrenheit));

        int temperaturaFahrenheitInteira = (int) fahrenheit;
        System.out.println("A temperatura Fahrenheit em um número inteiro é: " + temperaturaFahrenheitInteira);
    }
}
