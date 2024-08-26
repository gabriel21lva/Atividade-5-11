public class Gerente extends Comissao {
    
    private static final double ADICIONAL_GERENTE = 1500.00;

    public Gerente(double salarioBase) {
        super(salarioBase);
    }

    
    public double calcularComissaoTotal() {
        return salarioBase + ADICIONAL_GERENTE;
    }
}
