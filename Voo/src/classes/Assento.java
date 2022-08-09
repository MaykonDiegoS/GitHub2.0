package classes;
public abstract class Assento {

    //Atributos
    private boolean ocupado;
    private double valor;

    //Método
    public void ocupar() {
        this.setOcupado(true);
    }

    //Getters e Setters
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}