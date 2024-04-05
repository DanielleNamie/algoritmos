package exercicios;

import java.util.Scanner;


public class exercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
            System.out.println("Digite um número inteiro");
            int num1 = scan.nextInt();
            
            System.out.println("Digite outro número inteiro");
            int num2 = scan.nextInt();
            
            if (num1 > num2) {
                System.out.println("O maior número é " + num1);
            } else {
                System.out.println("O maior número é " + num2);
            }
    }

}
