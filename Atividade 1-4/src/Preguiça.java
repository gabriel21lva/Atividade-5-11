public class Preguiça extends Animal {

    public Preguiça(String nome, int idade) {
        super(nome, idade);
    }

    public String emitirSom() {
        return getNome() + " está emitindo um som baixo e lento.";
    }
    
    public String subirArvore() {
        return getNome() + " está subindo em uma árvore.";
    }
}
