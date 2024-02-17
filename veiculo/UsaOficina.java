package veiculo;

public class UsaOficina {
    public static void main(String[] args) {
        Oficina oficina = new Oficina(); // cria objeto do tipo Oficina
        Veiculo veiculo; // veiculo referencia Veiculo
        for (int i = 0; i < 4; i++) {
            veiculo = oficina.proximo(); // retornar o objeto criado em Oficina para veiculo
            oficina.revisar(veiculo); // objeto oficina chama método revisar enviando como argumento o objeto veiculo
        }
    }
}