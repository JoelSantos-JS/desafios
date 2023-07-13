package desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class desafio1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            numeros.add(valor);
        }

        // Ordenação dos pares em ordem crescente e dos ímpares em ordem decrescente
        Collections.sort(numeros, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a % 2 == 0 && b % 2 != 0) {
                    return -1; // 'a' é par e 'b' é ímpar, 'a' vem antes de 'b'
                } else if (a % 2 != 0 && b % 2 == 0) {
                    return 1; // 'a' é ímpar e 'b' é par, 'a' vem depois de 'b'
                } else if (a % 2 == 0 && b % 2 == 0) {
                    return a.compareTo(b); // ambos são pares, ordenação crescente
                } else {
                    return b.compareTo(a); // ambos são ímpares, ordenação decrescente
                }
            }
        });

        // Impressão dos valores ordenados
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
