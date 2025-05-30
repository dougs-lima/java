import java.util.Scanner;

public class Array3 {
    public static void main(String[] args){
        int[] vetA = new int[15];
        int[] vetB = new int[15];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetA.length; i++) {
            System.out.println("Digite valor da porsição " + i);
            vetA[i] = scan.nextInt();

            vetB[i] = vetA[i] * vetA[i];
        }
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");

        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetB[i] + " ");
        }
    }
}
