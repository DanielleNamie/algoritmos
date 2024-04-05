package exercicios_aula4;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
        
            System.out.println("Insira 10 números: ");
            for (int i = 1; i <= 10; i++) {
                System.out.println("número " + i + ": ");
                int num = scan.nextInt();
                
                if (num > maior) {
                    maior = num;
                }
                
                if (num < menor) {
                    menor = num;
                }
            }
            
            System.out.println("O maior número digitado é: " + maior);
            System.out.println("O menor número digitado é: " + menor);
    }

}
