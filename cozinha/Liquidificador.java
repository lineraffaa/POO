package cozinha;

public class Liquidificador {
    private boolean ligado;

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public void observar() {
        if (isLigado() == true) {
            System.out.print("Liquidificador esta ligado");
        } else
            System.out.print("Liquidificador esta desligado");

    }

}
