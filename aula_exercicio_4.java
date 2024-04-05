
import java.util.Scanner;

public class aula_exercicio_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Insira o valor do produto");
            int valor = scan.nextInt();
            
            System.out.println("Insira a porcentagem de desconto");
            int porcentagem = scan.nextInt();
            
            int valorDesconto = (valor*porcentagem)/100;
            int valorComDesconto = valor - valorDesconto;
            
            System.out.println("O valor do desconto é: " + valorDesconto);
            System.out.println("O valor do produto com desconto é: " + valorComDesconto);
    }
    
}
