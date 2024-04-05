package exercicios_aula4;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Insira um número inteiro positivo: ");
            int num = scan.nextInt();
            
            int resultado;
            
                for (int i = 0; i <= 10; i++) {
                    resultado = num * i;
                    System.out.println(num + " x " + i + " = " +resultado);
                }
    }

}
