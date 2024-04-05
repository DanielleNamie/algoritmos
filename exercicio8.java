package exercicios;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scan.nextDouble();

        System.out.print("Digite a forma de pagamento (dinheiro, cartao de credito, debito): ");
        String formaPagamento = scan.next();

        double precoTotal;

        if (formaPagamento.equalsIgnoreCase("dinheiro")) {
            precoTotal = valorCompra * 0.95; // Desconto de 5%
        } else if (formaPagamento.equalsIgnoreCase("cartao de credito")) {
            precoTotal = valorCompra * 1.10; // Acréscimo de 10%
        } else if (formaPagamento.equalsIgnoreCase("debito")) {
            precoTotal = valorCompra; // Sem acréscimo ou desconto
        } else {
            System.out.println("Opção de pagamento inválida. Certifique-se de digitar uma das opções válidas.");
            return;
        } 
        
        System.out.printf("O preço total da compra é R$ %.2f%n", precoTotal);*/
        
        //Exemplo professor
        System.out.println("Digite o preço total da compra: ");
        double preco = scan.nextDouble();
        
        System.out.println("Digite a forma de pagamento (dinheiro, cartão ou débito): ");
        String formaPagamento = scan.next();
        
        double desconto = 0.0;
        double acrescimo = 0.0;
        
        if (formaPagamento.equals("dinheiro")) {
            desconto = 0.05 * preco;
        } else if (formaPagamento.equals("cartão")) {
            acrescimo = 0.10;
        } else if (formaPagamento.equals("débito")) {
            acrescimo = 0;
        } else {
            System.out.println("Forma de pagamento inválida!");
            return;
        }
        
        double precoFinal = preco - desconto + acrescimo;
        System.out.println("Preço final da compra: " + precoFinal);
    }
}

