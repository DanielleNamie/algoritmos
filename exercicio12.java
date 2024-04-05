package exercicios_aula4;

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {
        int positivo = 0;
        int negativo = 0;
        int zero = 0;
        
        Scanner scan = new Scanner(System.in);
            System.out.println("Insira 10 números: ");
            
            for (int i = 1; i <= 10; i++) {
                System.out.println("número " + i + ": ");
                int num = scan.nextInt();
            
                if (num > 0) {
                    positivo++;
                } else if (num < 0) {
                    negativo++;
                } else if (num == 0) {
                    zero++;
                }
            }
            
            System.out.println("Foram digitados: " + positivo + " números positivos, " + negativo + " números negativos, e " + zero + " zeros.");
    }

}
