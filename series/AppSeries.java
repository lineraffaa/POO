package series;

public class AppSeries {
    public static void main(String[] args) {
        ISeries[] series = new ISeries[2];
        series[0] = new MaisDois();
        series[1] = new MaisTres();
        executa(series);
    }

    public static void executa(ISeries[] series) {

        for (int i = 0; i < series.length; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.println("Próximo valor: " + series[i].getNext());
            }
            series[i].reset();
            for (int k = 0; k < 5; k++) {

                System.out.println("Próximo valor: " + series[i].getNext());
            }
            series[i].setStart(100);
            for (int l = 0; l < 5; l++) {

                System.out.println("Próximo valor: " + series[i].getNext());
            }
        }
    }

}
