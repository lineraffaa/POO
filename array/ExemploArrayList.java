package array;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        System.out.println("Tamanho inicial: " + al.size());
        // Adiciona elementos ao fim da lista, um de cada vez.
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("\nTamanho após as adições: " + al.size());
        // Exibe a lista de array usando sua representação toString().
        System.out.println("Conteúdos: " + al);
        // Esvazia a lista.
        al.clear();
        System.out.println("\nApós limpar a lista.");
        // Exibe a lista de array usando sua representação toString().
        System.out.println("Conteúdos: " + al);
        System.out.println("\nTamanho após as deleções: " + al.size());
        System.out.println("Conteúdos: " + al);
        // Adiciona os números de 0 até 9
        for (int i = 0; i < 10; i++)

            al.add(i);
        // Exibe a lista de array usando sua representação toString().
        System.out.println("Conteúdos: " + al);
        // Localiza e remove um valor
        int idx = al.indexOf(2);

        if (idx >= 0)
            al.remove(idx);
        System.out.println("\nApós localizar e remover o número 2.");
        System.out.println("Conteúdos: " + al);
        // Esvazia a lista.
        al.clear();
        System.out.println("\nApós limpar a lista.");
        // Exibe a lista de array usando sua representação toString().
        System.out.println("Conteúdos: " + al);
        // Adiciona os números de 0 até 9

        for (int i = 0; i < 10; i++)
            al.add(i);
        // Mostra alguns elementos da lista.
        System.out.print("\nAqui estão alguns números: ");

        for (int i = 0; i < al.size(); i += 2)
            System.out.print(al.get(i) + " ");
    }
}