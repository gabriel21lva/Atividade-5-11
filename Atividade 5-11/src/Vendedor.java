public class Vendedor extends Comissao {
    
    private static final double ADICIONAL_VENDEDOR = 250.00;

    public Vendedor(double salarioBase) {
        super(salarioBase);
    }

    
    public double calcularComissaoTotal() {
        return salarioBase + ADICIONAL_VENDEDOR;
    }
}
