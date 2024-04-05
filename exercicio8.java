package exercicios_aula4;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            int maiorIdade = 0;
            
            System.out.println("Insira a idade de 20 pessoas: ");
            
            for (int i = 1; i <= 20; i++) {
                System.out.println("Pessoa " + i + ": ");
                int idade = scan.nextInt();
            
                if (idade >= 18) {
                maiorIdade++;
                }
            }
            
            System.out.println("O número de pessoas maiores de idade é: " +maiorIdade);
    }        

}
