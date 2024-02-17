package animal;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal ch = new Cachorro();
        Animal gt = new Gato();
        Animal pr = new Preguica();

        ch.emitirSom();
        gt.emitirSom();
        pr.emitirSom();

    }

}
