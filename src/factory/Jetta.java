package factory;

public class Jetta implements Carro {

    private double preco;
    private String modelo;

    @Override
    public double getPreco() {
        return preco;
    }

    public Jetta(double preco, String modelo) {
        this.preco = preco;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "preco=" + preco +
                ", modelo=" + modelo +
                '}';
    }
}
