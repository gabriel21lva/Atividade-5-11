public class Supervisor extends Comissao {
    
    private static final double ADICIONAL_SUPERVISOR = 600.00;

    public Supervisor(double salarioBase) {
        super(salarioBase);
    }

    
    public double calcularComissaoTotal() {
        return salarioBase + ADICIONAL_SUPERVISOR;
    }
}
