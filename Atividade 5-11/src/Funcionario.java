public class Funcionario {
    
    private String nome;
    private String codigoFuncional;
    private double rendaBase = 1000.00;
    private Comissao comissao; // Adiciona o atributo de comissão

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getRendaBase() {
        return rendaBase;
    }

    public void setRendaBase(double rendaBase) {
        this.rendaBase = rendaBase;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public double calcularRendaTotal() {
        double rendaTotal = rendaBase;
        if (comissao != null) {
            rendaTotal += comissao.calcularComissaoTotal() - comissao.getSalarioBase(); // Subtrai o salário base da comissão para evitar duplicação
        }
        return rendaTotal;
    }

    @Override
    public String toString() {
        double rendaTotal = calcularRendaTotal();
        String tipoComissao = comissao.getClass().getSimpleName();
        return String.format("Nome: %s, Comissão: %s, Salário Total: R$ %.2f",
                nome, tipoComissao, rendaTotal);
    }
}
