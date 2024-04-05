
import java.util.Scanner;

public class tarefa_exercicios_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Insira um número");
            int numero = scan.nextInt();
            
            int antecessor = numero - 1;
            int sucessor = numero + 1;
            
            System.out.println("O antecessor de " + numero + " é = " + antecessor);
            System.out.println("O sucessor de " + numero + " é = " + sucessor);
    }
    
}
