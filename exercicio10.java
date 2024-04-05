package exercicios;

import java.util.Scanner;


public class exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
            System.out.println("Insira um número");
            int num = scan.nextInt();
           
            if (num % 2 == 0 && num % 3 == 0) {
                System.out.println("O número é par e múltiplo de 3");
            } else if (num % 2 == 0) {
                System.out.println("O número é par, mas não é múltiplo de 3");
            } else if (num % 3 == 0) {
                System.out.println("O número não é par, mas é múltiplo de 3");
            } else {
                System.out.println("O número não é par e nem múltiplo de 3");
            }
    }

}
