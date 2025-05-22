public class DinheiroConversor {
    public static void main(String[] args){
        double valorEmDolares = 70.95;
        double reais = 4.94;
        double valor = valorEmDolares * reais;
        System.out.println(String.format("O valor em dolares é: R$%.2f", valor));

    }
}
