package array;

import java.util.Scanner;

public class Arrypositivo {
    public static void main(String[] args) {
        int[] vet = { 2, 4, 0, 8, 10, 12 };
        int x = 0, dif = 0, max = 0, maiores = 0, menores = 0;
        int maior = 0, menor = 0, igual = 0;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        sc.close();

        for (int i = 0; i < 5; i++) {
            if (Math.abs(vet[i]) > Math.abs(vet[i + 1])) {
                maiores = vet[i];
                menores = vet[i + 1];
            } else {
                maiores = vet[i + 1];
                menores = vet[i];
            }
            dif = Math.abs(maiores) - Math.abs(menores);

            if (Math.abs(dif) > max) {
                max = Math.abs(dif);

            }
        }
        System.out.println(" " + max);
        // System.out.printf("\n "+dif);

        for (int e : vet) {

            if (e > x) {
                maior++;
            } else if (e < x) {
                menor++;
            } else if (e == x) {
                igual++;
            }
        }
        System.out.printf("maior: " + maior + "\nmenor: " + menor + "\nigual: " + igual);

    }

}
