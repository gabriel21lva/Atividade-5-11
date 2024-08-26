public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    
    public String emitirSom() {
        return getNome() + " está relinchando.";
    }
}
