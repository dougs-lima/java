public class Taboada {
    public static void main(String[] args){
        int n1;
        int n2;
        int taboada = 0;

        for (n1 = 1; n1 <= 10; n1++) {
            for (n2 = 1; n2 <= 10; n2++) {
                taboada = n1 * n2;
                System.out.println(n1 + " x " + n2 + " = " + taboada);

            }
            System.out.println();
        }
    }
}
