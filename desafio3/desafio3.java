package desafio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class desafio3 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int n = scanner.nextInt();

        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifferenceK(arr, k);
        System.out.println(count);
    }

    private static int countPairsWithDifferenceK(int[] arr, int k) {
        int count = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            // Verifica se existe um par com a diferença k
            if (frequencyMap.containsKey(num - k)) {
                count += frequencyMap.get(num - k);
            }

            // Verifica se existe um par com a diferença -k
            if (frequencyMap.containsKey(num + k)) {
                count += frequencyMap.get(num + k);
            }

            // Atualiza a frequência do número no mapa
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
