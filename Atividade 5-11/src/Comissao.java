public abstract class Comissao {
    
    protected double salarioBase;

    public Comissao(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularComissaoTotal();

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
