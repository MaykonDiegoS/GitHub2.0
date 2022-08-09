package classes;

public interface MeioTransporte {

    //Método
    boolean verificaOcupacao(String verifica);

    int quantidadeLivre();

    void mostrarAssentos();

    Assento getAssento(String add);

}
