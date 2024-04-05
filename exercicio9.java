package exercicios_aula4;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int par = 0;
            int impar = 0;
                    
            System.out.println("Insira 20 números: ");
                for (int i = 1; i <= 20; i++) {
                    System.out.println("número " + i + ": ");
                    int num = scan.nextInt();
                    
                    int restoDivisao = num % 2;
                    
                    if (restoDivisao == 0) {
                        par++;
                    } else {
                        impar++;
                    }
                }
                
            System.out.println(par + " de 20 números são pares");
            System.out.println(impar + " de 20 números são ímpares");
            
    }

}
