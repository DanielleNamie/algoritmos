package exercicios_aula4;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Insira seu nome: ");
            String nome = scan.next();
            
            for (int i = 1; i <= 10; i++) {
                System.out.println(i +" "+nome);
            }
    }

}
