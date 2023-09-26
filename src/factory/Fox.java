package factory;

public class Fox  implements Carro {

    private double preco;
    private String modelo;

    @Override
    public double getPreco() {
        return preco;
    }

    public Fox(double preco, String modelo) {
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
