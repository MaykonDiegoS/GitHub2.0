package Exemplos;

public class desafio {
    public static void main(String[] args) {
        System.out.println(
                forbiddenLetter(new String[]{"abc", "def", "ghi"}, 'b')
        );
    }

    public static boolean forbiddenLetter(String[] words, double letraProibida) {
        boolean achou = false;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                achou = (word.charAt(i) == letraProibida);
                if (achou) {
                    break;
                }

            }
            if (achou) {
                break;
            }
        }
     return achou;
    }
}
//    public static boolean forbiddenDigit(int[] numbers, int digitoProibido) {
//        boolean achou = false;
//        for (int num : numbers) {
//            achou = num == digitoProibido;
//            if (achou) {
//                break;
//            }
//        }
//        return achou;
//    }