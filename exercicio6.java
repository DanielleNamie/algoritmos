package exercicios;

import java.util.Scanner;


public class exercicio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            System.out.println("Qual foi a sua nota na prova?");
            int nota = scan.nextInt();
            
            if (nota >= 7) {
                System.out.println("Você foi aprovado");
            } else if (nota < 5) {
                System.out.println("Você foi reprovado");
            } else {
                System.out.println("Você está em recuperação");
            }
    }

}
