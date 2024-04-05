package exercicios;

import java.util.Scanner;


public class exercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            System.out.println("Insira a temperatura atual em Celsius");
            int temp = scan.nextInt();
            
            if (temp > 30) {
                System.out.println("Está quente");
            } else if (temp > 15 && temp <= 30) {
                System.out.println("Está morno");
            } else if (temp <= 15) {
                System.out.println("Está frio");
            }
    }

}
