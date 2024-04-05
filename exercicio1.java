package exercicios;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            System.out.println("Digite um número");
            int num = scan.nextInt();

            int restoDivisao = num % 2;

            if (restoDivisao == 0){
                System.out.println(num + " é par");
            } else {
                System.out.println(num + " é ímpar");
            }
    }

}
   
