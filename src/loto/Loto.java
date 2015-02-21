package loto;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ana on 2/21/2015.
 */
public class Loto {
    public static final int NR_BILE_EXTRASE = 6;

    public static void main(String[] args) {
        int[] variantaJucata = {1, 15, 22, 17, 41, 6};
        int[] variantaGenerata = new int[NR_BILE_EXTRASE];
        ArrayList<Integer> sirCastigator= new ArrayList<Integer>();

        Random aleatoriu = new Random();
        for (int i = 0; i < 6; i++) {
            variantaGenerata[i] = 1 + aleatoriu.nextInt(48);
            for (int u = 0; u < i; u++) {
                if (variantaGenerata[u] == variantaGenerata[i]) {
                    variantaGenerata[i] = 1 + aleatoriu.nextInt(48);
                }

            }

            System.out.println(variantaGenerata[i]);


        }
        int scor = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (variantaJucata[i] == variantaGenerata[j]) {
                    sirCastigator.add(variantaJucata[i]);
                    scor++;
                }
            }
        }
        System.out.println("Numerele castigatoare sunt: " +sirCastigator);
        if (scor < 4) {
            System.out.println("Nu ai castigat:( Mai incearca!");
        }
        if (scor == 4) {
            System.out.println("Ai castigat! Categoria III");
        }
        if (scor == 5) {
            System.out.println("Ai castigat! Categoria II");
        }
        if (scor == 6) {
            System.out.println("Ai castigat! Categoria I");
        }
    }
}
