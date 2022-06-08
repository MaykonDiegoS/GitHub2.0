import Classes.itens.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Harry Potter e a Autora Transfóbica");
        livro.avaliar();
        livro.avaliar();
        livro.avaliar();
        System.out.println(livro.getTotalRating());
    }
}
