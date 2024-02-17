package luz;

public class TestaLuz {
    public static void main(String[] args) {
        Palestra[] palestra = new Palestra[3];
        palestra[0] = new Palestra(Luz.VERDE);
        palestra[1] = new Palestra(Luz.AMBAR);
        palestra[2] = new Palestra(Luz.VERMELHO);

        for (Palestra p : palestra) {
            p.acessa();

        }

    }

}
