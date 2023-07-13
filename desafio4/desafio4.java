package desafio4;

import java.util.Scanner;

public class desafio4 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        
        System.out.println("Digite o nÚmero de casos de teste: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir o caractere de quebra de linha após o número de casos de teste

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String unscrambledLine = unscrambleLine(line);
            System.out.println(unscrambledLine);
        }
    }

    private static String unscrambleLine(String line) {
        int length = line.length();
        StringBuilder unscrambledLine = new StringBuilder(length);

        for (int i = length / 2 - 1; i >= 0; i--) {
            unscrambledLine.append(line.charAt(i));
        }

        for (int i = length - 1; i >= length / 2; i--) {
            unscrambledLine.append(line.charAt(i));
        }

        return unscrambledLine.toString();
    }
}
