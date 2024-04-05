package exercicios_aula4;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int soma = 0;
            
            System.out.println("Insira 10 números: ");
            
            for (int i = 0; i < 10; i++) {
                System.out.println("número "+(i + 1)+": ");
                int numero = scan.nextInt();
                soma = soma + numero;
            }
            
            System.out.println("A soma dos números é: " +soma);
    }

}
