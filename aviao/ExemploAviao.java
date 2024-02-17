package aviao;

public class ExemploAviao {
    public static void main(String[] args) {
        Aviao aviao1 = new Aviao();
        aviao1.fabricante = "Boegin";
        aviao1.modelo = "777";
        aviao1.quantAssentos = 235;

        aviao1.ligar();
    }
}
