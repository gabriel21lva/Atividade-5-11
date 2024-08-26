public class FuncionarioGraduaçao extends FuncionarioEnsinoMedio {

    private String universidade;

    public FuncionarioGraduaçao(String nome, String codigoFuncional, String escolaBasico, String escolaMedio, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio, comissao);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    
    public String toString() {
        return super.toString() + ", Universidade: " + universidade;
    }
}
