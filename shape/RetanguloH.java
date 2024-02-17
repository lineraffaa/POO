package shape;

public class RetanguloH extends TwoDShape {

    public boolean quadrado() {
        if (this.largura == this.altura) {
            return true;
        } else
            return false;
    }

    public double area() {
        return largura * altura;
    }

}
