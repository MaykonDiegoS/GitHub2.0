import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.sql.SQLOutput;

public class Main {

    //Comentário de linha
    /* Comentário de bloco
        Aqui pode ter
        Qualquer coisa
     */
    static int var1 = 10;
    //float "não existe" normalmente na programação
    //double var2 = 25.8;
    //char var3 = 'a';
    //char só tem uma letra
    String var4 = "abcdefghij";
    //Classe é sempre com a primeira letra maiúscula
    //boolean var5 = true;
    //true = 1, false = 0, boolean só trabalha com isso

    public static void main(String[] args) {
        System.out.println(var1);
        System.out.println(++var1);
        /*System.out.println(var1++); vai fazer a ação depois
            System.out.println(++var1); vai fazer a ação antes
         */

    }

    }
    //public pode ser acessada de qualquer lugar do teu programa
    //private vai ser vista só pela classe que ela foi declarada
    //protected só por classes que estão no mesmo pacote (Package)
