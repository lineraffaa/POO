package luz;

public class Palestra {
    Luz luz;

    public Palestra(Luz luz) {
        this.luz = luz;

    }

    public void acessa() {
        switch (luz) {
            case VERMELHO:
                System.out.println("Palestra indisponivel");
                break;
            case AMBAR:
                System.out.println("Palestra sendo liberada");
                break;
            case VERDE:
                System.out.println("Palestra disponivel");
                break;

            default:
                break;
        }
    }
}
