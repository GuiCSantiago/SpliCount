package splitec.splicount.entities;

public class Material {

    private double valor;

    public Material() {
    }

    public Material(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Material{" +
                "valor=" + valor +
                '}';
    }
}
