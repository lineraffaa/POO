package esporte;

import java.util.ArrayList;

public class AppEsportes {
    public static void main(String[] args) {
        ArrayList<Esporte> esportes = new ArrayList<Esporte>();
        esportes.add(new Corrida());
        esportes.add(new Natacao());
        praticarEsportes(esportes);
    }

    private static void praticarEsportes(ArrayList<Esporte> esportes) {
        for (Esporte b : esportes) {
            b.praticar();
        }
    }
}