package exercicios_aula4;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            int zeroCem = 0;
            
            System.out.println("Insira 20 números: ");
            
            for (int i = 1; i <= 20; i++) {
                System.out.println("número " + i + ": ");
                int num = scan.nextInt();
            
                if (num >= 0 && num <= 100) {
                zeroCem++;
                }
            }
            
            System.out.println(+zeroCem + " de 20 números estão entre 0 e 100");
    }        

}
