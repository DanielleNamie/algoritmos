package exercicios_aula4;

import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Insira um número: ");
            int num = scan.nextInt();
            
            int soma = 0;
            
            for (int i = 1; i <= num; i++) {
                soma = soma + i;
            }
            
            System.out.println("A soma é: " + soma);
    }

}
