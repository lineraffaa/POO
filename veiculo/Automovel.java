package veiculo;

public class Automovel extends Veiculo {
    public Automovel() {
        System.out.println("� um autom�vel");
    }

    @Override
    public void verificar() {
        System.out.println("Verificar autom�vel");
    }

    @Override
    public void ajustar() {
        System.out.println("Ajustar autom�vel");
    }

    @Override
    public void limpar() {
        System.out.println("Limpar autom�vel");
    }
}