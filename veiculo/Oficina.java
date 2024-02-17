package veiculo;

import java.util.Random;

public class Oficina {
    Random random = new Random();

    public Veiculo proximo() {
        Veiculo veiculo;
        int codigo = random.nextInt(100); // gerou número aleatório entre 0 e 99
        if (codigo % 2 == 0) // se codigo par
            veiculo = new Automovel(); // criar um objeto Automovel e armazená-lo em veiculo
        else
            veiculo = new Bicicleta();
        return veiculo;
    }

    public void revisar(Veiculo veiculo) {
        veiculo.verificar(); // polimorfismo
        veiculo.ajustar(); // polimorfismo
        veiculo.limpar(); // polimorfismo
    }
}
