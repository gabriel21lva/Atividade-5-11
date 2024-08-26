public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        
        jaulas = new Animal[10];
    }

    public void colocarNaJaula(int index, Animal animal) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        } else {
            System.out.println("Índice fora dos limites das jaulas.");
        }
    }

    public void percorrerJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            Animal animal = jaulas[i];
            if (animal != null) {
                System.out.println("Jaula " + (i + 1) + ": " + animal.emitirSom());
                
                if (animal instanceof Preguiça) {
                    System.out.println(((Preguiça) animal).subirArvore());
                } else {
                    System.out.println(animal.correr());
                }
            } else {
                System.out.println("Jaula " + (i + 1) + ": Está vazia.");
            }
        }
    }
}
