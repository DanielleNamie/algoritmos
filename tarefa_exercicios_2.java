
import java.util.Scanner;

public class tarefa_exercicios_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Insira um número para ser multiplicado por 3");
            int numero = scan.nextInt();
            
            int triplo = numero * 3;
            
            System.out.println("O triplo de " + numero + "é = " + triplo);
    }
    
}
