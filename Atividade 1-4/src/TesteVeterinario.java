public class TesteVeterinario {
    public static void main(String[] args) {
        
        Animal cachorro = new Cachorro("Toto", 5);
        Animal cavalo = new Cavalo("Princesa", 7);
        Animal preguiça = new Preguiça("Sid", 10);
 
        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguiça);
    }
}
