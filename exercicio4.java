package exercicios_aula4;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Insira seu nome: ");
            String nome = scan.next();
            
            System.out.println("Insira um número: ");
            int num = scan.nextInt();
            
                for (int i = 1; i <= num; i++) {
                    System.out.println(i+" "+nome);
                }
    }

}
