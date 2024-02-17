package series;

public class MaisTres implements ISeries {
    int valor;
    int inicio;

    public MaisTres() {
        valor = 0;
        inicio = 0;
    }

    @Override
    public int getNext() {
        valor += 3;
        return valor;
    }

    @Override
    public void reset() {
        valor = inicio;
    }

    @Override
    public void setStart(int x) {
        inicio = x;
        valor = x;
    }

}
