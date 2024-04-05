package exercicios;

import java.util.Scanner;


public class exercicio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            System.out.println("Insira a sua idade");
            int idade = scan.nextInt();
            
            System.out.println("Insira a sua altura");
            double altura = scan.nextDouble();
            
            System.out.println("Insira o seu peso");
            double peso = scan.nextDouble();
            
            if ((idade >= 18 && idade <= 35)&&(altura >= 1.65)&&(peso <= 100)) {
                System.out.println("Você está dentro dos limites para testar o protótipo de avião");
            } else {
                System.out.println("Você não está dentro dos limites para testar o protótipo de avião");
            } 
    }

}
