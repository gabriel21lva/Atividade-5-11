public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    
    private String escolaMedio;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaBasico, String escolaMedio, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasico, comissao);
        this.escolaMedio = escolaMedio;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }

    
    public String toString() {
        return super.toString() + ", Escola (Ensino Médio): " + escolaMedio;
    }
}
