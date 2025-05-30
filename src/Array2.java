public class Array2 {
    public static void main(String[] args){
        int[] vetA = new int[5];
        vetA[0] = 3;
        vetA[1] = 5;
        vetA[2] = 2;
        vetA[3] = 7;
        vetA[4] = 8;
        int[] vetB = new int[5];
        vetB[0] = vetA[0];
        vetB[1] = vetA[1];
        vetB[2] = vetA[2];
        vetB[3] = vetA[3];
        vetB[4] = vetA[4];

        for (int i = 0; i < vetA.length; i++) {
            System.out.println("Colocação " + (i+1) + " de A é " +  vetA[i]);
            System.out.println("Colocação " + (i+1) + " de B é " +  vetB[i]);
        }
    }
}
