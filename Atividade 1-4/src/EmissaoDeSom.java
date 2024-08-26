public class EmissaoDeSom {
    
    public static void main(String[] args) {
        
        Animal cachorro = new Cachorro("Toto", 5);
        Animal cavalo = new Cavalo("Princesa", 7);
        Animal preguiça = new Preguiça("Sid", 10);

        Animal[] animais = {cachorro, cavalo, preguiça};

        for (Animal animal : animais) {
            System.out.println(animal.emitirSom());
        }
    }
}
