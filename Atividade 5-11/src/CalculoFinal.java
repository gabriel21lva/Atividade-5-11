public class CalculoFinal {
    public static void main(String[] args) {
        
        Funcionario[] funcionarios = new Funcionario[10];

        
        Comissao gerenteComissao = new Gerente(0); 
        Comissao supervisorComissao = new Supervisor(0);
        Comissao vendedorComissao = new Vendedor(0);

        funcionarios[0] = new Funcionario("Gerente 1", "001", gerenteComissao);

        for (int i = 1; i <= 2; i++) {
            funcionarios[i] = new Funcionario("Supervisor " + i, "00" + (i + 1), supervisorComissao);
        }

        
        for (int i = 3; i < 10; i++) {
            funcionarios[i] = new Funcionario("Vendedor " + (i - 2), "00" + (i + 1), vendedorComissao);
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
