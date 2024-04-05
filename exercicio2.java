package exercicios;

import java.util.Scanner;


public class exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
            System.out.println("Digite um número");
            int num = scan.nextInt();
            
            if (num < 0) {
                System.out.println("O número é negativo");
            } else if (num > 0) {
                System.out.println("O número é positivo");
            } else {
                System.out.println("O número é zero");
            }
    }

}
