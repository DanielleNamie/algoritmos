
import java.util.Scanner;

public class aula_exercicio_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Insira a quantidade de cavalos comprados");
            int cavalos = scan.nextInt();
            
            int ferraduras = cavalos * 4;
            
            System.out.println("A quantidade de ferraduras necessárias é: " + ferraduras);
    }
    
}
