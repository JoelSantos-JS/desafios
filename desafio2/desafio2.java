package desafio2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class desafio2 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        System.out.println("Digite o valor: ");
        double valor = scanner.nextDouble();
        int valorInteiro = (int) valor;
        int centavos = (int) ((valor - valorInteiro) * 100);

        int[] notas = { 100, 50, 20, 10, 5, 2 };
        int[] moedas = { 100, 50, 25, 10, 5, 1 };

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidadeNotas = valorInteiro / nota;
            valorInteiro %= nota;
            System.out.printf("%d nota(s) de R$ %d.00\n", quantidadeNotas, nota);
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidadeMoedas = centavos / moeda;
            centavos %= moeda;
            System.out.printf("%d moeda(s) de R$ %s\n", quantidadeMoedas, decimalFormat.format(moeda / 100.0));
        }
    }

        
}
