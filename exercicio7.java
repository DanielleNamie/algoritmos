package exercicios_aula4;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int somaIdades = 0;
            
            System.out.println("Insira a idade de 20 pessoas: ");
            
            for (int i = 1; i <= 20; i++) {
                System.out.println("Pessoa " + i + ": ");
                int idade = scan.nextInt();
                somaIdades = somaIdades + idade;
            }
            
            double mediaIdades = (double) somaIdades/20;
            
            System.out.println("A média das idades das 20 pessoas é: " +mediaIdades);
    }

}