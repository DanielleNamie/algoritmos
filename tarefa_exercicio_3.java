
import java.util.Scanner;

public class tarefa_exercicio_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Insira o comprimento do retângulo");
            float base = scan.nextFloat();
            
            System.out.println("Insira a altura do retângulo");
            float altura = scan.nextFloat();
            
            float area = base*altura;
            
            System.out.println("A área do retângulo é = " + area);
    }
    
}
