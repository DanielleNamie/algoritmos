package exercicios;

import java.util.Scanner;


public class exercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*System.out.println("Digite três números:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        ordenarNumerosCrescente(num1, num2, num3);
    }
    
    public static void ordenarNumerosCrescente(int num1, int num2, int num3) {
        int temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Os números em ordem crescente são:");
        System.out.println(num1 + ", " + num2 + ", " + num3);*/
        
        //exemplo professor
        System.out.println("Digite o primeiro número: ");
        int a = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = scan.nextInt();
        System.out.println("Digite o terceiro número: ");
        int c = scan.nextInt();
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        System.out.println("Números em ordem crescente: " +a+", "+b+", "+c);
    }

}
