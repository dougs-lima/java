public class Desconto {
    public static void main(String[] args){
        double precoOriginal = 439.90;
        double precoDesconto = precoOriginal * 0.9;
        System.out.println(String.format("O Microondas no valor de R$%.2f, sairá por apenas R$%.2f.", precoOriginal, precoDesconto));
    }
}
