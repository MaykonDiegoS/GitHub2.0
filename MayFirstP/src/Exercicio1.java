public class Exercicio1 {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;

        System.out.println("A=" + A + " e " + "B=" + B);

        int x = A;
        A = B;
        B = x;

        System.out.println("A=" + A + " e " + "B=" + B + "\n");

        String C = "10";
        String D = "20";

        System.out.println("C=" + C + " e " + "D=" + D);

        String z = C;
        C = D;
        D = z;

        System.out.println("C=" + C + " e " + "D=" + D);
    }

}
