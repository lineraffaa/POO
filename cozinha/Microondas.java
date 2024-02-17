package cozinha;

public class Microondas {
    private boolean ligado;

    public void ligar() {
        this.ligado = true;
    }

    public void desligado() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void observar() {
        if (isLigado() == true) {
            System.out.print("Microondas esta ligado");
        } else
            System.out.print("Microondas esta desligado");

    }

}
