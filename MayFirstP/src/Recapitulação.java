
import java.util.Locale;
import java.util.Scanner;

public class Recapitulação {
    public static void main(String[] args) {
        String var3 = "Did you know about the aclaimed MMO FFXIV?";
        int qtde = 0;
        for (int i = 0; i < var3.length(); i++) {
            //if (var3.toLowerCase().chatAt(i); i++)
            if (var3.charAt(i) == 'a') {
                qtde++;
            }
        }
        System.out.println((qtde));

        //inteiros
        int var1 = 10;
        //caractere unico
        char var2 = 'a';
        //texto
        String var7 = "ABCDUEFG";
        //valor logico
        boolean var4 = true;
        //decimais, números quebrados
        double var5 = 5.6;


        //saída - mensagem ao usuário
        System.out.println(); // exibe mensagem e quebra linha
        System.out.print(""); // exibe mensagem sem quebra de linha
        System.out.printf("%d, %.2f, %s", 10, 4.67888, "texto"); // exibe mensagem formatada sem quebra de linha

        //entrada - entrada de usuário PELO CONSOLE
        Scanner sc = new Scanner(System.in);
        sc.next(); // espera o usuário digitar, pega um caracter o que foi digitado.
        sc.nextInt(); // espera o usuário digitar, pega valores inteiros.
        sc.nextDouble(); //espera o usuário digitar, pega valores decimais.
        sc.nextLine(); //retorna tudo que tiver digitado, e avança

        //operações aritméticas
        var1 = 10 + 10; //soma
        var1 = 10 - 10; //subtração
        var1 = 10 / 10; //divisão
        var1 = 10 * 10; // multiplicação
        var1 = 10 % 10; //resto de divisão - módulo

        //operadores relacionais - SEMPRE RETORNAM VALOR BOOLEAN
        var4 = 10 > 10;//maior que
        var4 = 10 >= 10;//maior ou igual
        var4 = 10 < 10;//menor que
        var4 = 10 <= 10;//menor ou igual
        var4 = 10 == 10;//igualdade
        var4 = 10 != 10;//diferença

        //operadores lógicos - COMPARAÇÃO ENTRE VALORES BOOLEANOS
        var4 = true && false;//true e false
        var4 = true || false;//true ou false
        var4 = !true; //NÃO false

        //condicionais - estruturas de seleção
        //if -> Analisa uma condição e executar os determinados códigos
        if(true) {
            //se a condição for verdade executa esse trecho de código
        } else {
            //senão executa esse
        }

        //if aninhado
        if(var1 <= 10) {
            //se a condição for verdade executa esse trecho de código
            if(var4){

            }
        }
        //if encadeado
        if (var4) {
            //se a primeira condição for verdade executa esse trecho de código
        }else if (var1 == 10) {
            //senão se a segunda condição for verdade executa esse trecho de código
        }else {
            //senão executa esse
        }

        //switch
        switch(var1) {
            case 1:
                System.out.println("um");break;
            case 2:
                System.out.println("dois");break;
            case 3:
                System.out.println("três");break;
            case 4:
                System.out.println("quatro");break;
            case 5:
                System.out.println("cinco");break;
                //se o valor não for igual a nenhum caso, o padrão é executado
            default:
                System.out.println("não sei");break;
        }

        //repetição
        //irá repetir um trecho de código
        //enquanto a condição for verdade
        //for (inicialização da variável; checagem de condição; incremento/decremento do valor da variável) {
        //comando a ser executado/declaração
        //}
        for(int i = 0;i <= 10; i++) {

        }

        //while - Irá repetir um trecho de código por um número de vezes desconhecidos.
        //enquanto a condição for verdade
        int i = 0;
        while(var1 != 0); {
            System.out.println("i");
            i++;
        }
        while(var1 != 0) {
            System.out.println("Teste");
            var1 = sc.nextInt(); //atualização da variável utilizada na
            // condição do while, caso esse valor não seja atualizado
            // irá gerar um loop infinito
        }
        while(true) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            } else {
                switch (a) {

                }
            }
        }
        //String - LISTA DE CHAR
        var3 = "Did u know 'bout the aclaimed MMO FFXIV?";
        System.out.println(var3.charAt(var3.length()-1)); //length() retorna a quantidade total de caracteres no texto

        System.out.println(var3.charAt(6)); // charAt() retorna o caractere de caracteres no texto

        System.out.println(var3.equals("teste"));//equals() realiza comparação entre Strings

        System.out.println(var3.toLowerCase()); //toLowerCase() converte todos os caracteres da string para minusculo

        System.out.println(var3.toUpperCase());// toUpperCase() converte todos os caracteres da string para maiusculo

        System.out.println(var3.contains("teste"));//contains() checa se o texto informado contém a String do parâmetro

        System.out.println(var3.strip());// strip() remove espaços do final e do começo do texto

        String[] splitted = var3.split(" ");//irá quebrar o texto no delimitador informado e
                                                    // retornar uma lista dos textos adquiridos
        for(String word : splitted) {
       System.out.println(word);
        }
        System.out.println(var3.substring(5, 8));// primeiro é inclusivo, segundo é exclusivo
    }

//        int[] numbers = {0,1,2,3,4,5,6,7,8,9}; //iniciando uma lista com valores
//        int[] numbers = new int[10];//iniciando lista vazia
//
//        System.out.println(numbers[6]); //recuperando um valor da lista
//        numeros2[4] = sc.nextInt(); // inserindo um valor no array
//        System.out.println(numeros.length);//pegando a quantidade de itens
//        System.out.println(numeros); //dá erro ao imprimir
//        for(int i = 0; 1 < numeros.length; 1++) {
//        System.out.println(numeros[i]);
//        }
//
//        int[][] numeros3 = {{0,1,2,3,4},{56789}}; //iniciando uma matriz com valores
//        int[][] numeros4 = new int[2][5];//iniciando uma matriz sem valores
//        System.out.println(numeros3[0][2]);//recurperando um valor de uma matriz
//        numeros4[1] = new int[]{7,8,9,0}; //inserindo uma lista em uma linha da matriz
//        numeros4[0][0] = 9; //inserindo dados em uma posição da matriz
//
//        System.out.println(numeros3.length);//numero de linhas da matriz
//        System.out.println(numeros3[0].length);//quantidade de itens na linha da matriz
//
//        for(int = 0; i < numeros3.length; i++){
//        for(int j = 0; j < numeros3[i].length; j++ {
//    System.out.println(numeros3[i][j]);
        }