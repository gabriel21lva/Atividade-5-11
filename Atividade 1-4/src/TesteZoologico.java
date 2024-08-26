public class TesteZoologico {
    public static void main(String[] args) {
        
        Animal cachorro1 = new Cachorro("Toto", 5);
        Animal cavalo1 = new Cavalo("Princesa", 7);
        Animal preguiça1 = new Preguiça("Sid", 10);
        Animal cachorro2 = new Cachorro("Max", 3);
        Animal cavalo2 = new Cavalo("Principe", 10);
        Animal preguiça2 = new Preguiça("Flash", 8);
        Animal cachorro3 = new Cachorro("Buddy", 2);
        Animal cavalo3 = new Cavalo("Machador", 6);
        Animal preguiça3 = new Preguiça("Lentinho", 12);
        Animal cachorro4 = new Cachorro("Rex", 4);

        
        Zoologico zoologico = new Zoologico();

        
        zoologico.colocarNaJaula(0, cachorro1);
        zoologico.colocarNaJaula(1, cavalo1);
        zoologico.colocarNaJaula(2, preguiça1);
        zoologico.colocarNaJaula(3, cachorro2);
        zoologico.colocarNaJaula(4, cavalo2);
        zoologico.colocarNaJaula(5, preguiça2);
        zoologico.colocarNaJaula(6, cachorro3);
        zoologico.colocarNaJaula(7, cavalo3);
        zoologico.colocarNaJaula(8, preguiça3);
        zoologico.colocarNaJaula(9, cachorro4);

        
        zoologico.percorrerJaulas();
    }
}
