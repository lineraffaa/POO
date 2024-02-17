package carro;

public class Carro {
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;
    private Banco banco;

    public Carro(String marca, String modelo, String fabricante, Motor motor, Banco banco) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
        this.banco = banco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getTipoMotor() {
        return motor.getTipo();
    }

    public String getTipoBanco() {
        return banco.getTipo();
    }

    public String toString() {
        return marca + " " + fabricante + " " + motor + " " + banco;

    }
}
