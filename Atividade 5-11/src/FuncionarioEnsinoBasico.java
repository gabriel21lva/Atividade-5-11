public class FuncionarioEnsinoBasico extends Funcionario {
    
    private String escolaBasico;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaBasico, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.escolaBasico = escolaBasico;
    }

    public String getEscolaBasico() {
        return escolaBasico;
    }

    public void setEscolaBasico(String escolaBasico) {
        this.escolaBasico = escolaBasico;
    }

    
    public String toString() {
        return super.toString() + ", Escola (Ensino Básico): " + escolaBasico;
    }
}
