
import java.util.Scanner;

public class aula_exercicio_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Qual é o seu nome?");
            String nome = scan.nextLine();
            
            System.out.println("Informe seu endereço");
            String endereco = scan.nextLine();
            
            System.out.println("Informe seu telefone");
            String telefone = scan.nextLine();
            
            System.out.println("Em que área você atua profissionalmente?");
            String area = scan.nextLine();
            
            System.out.println("Olá, " + nome
                              +"\nVocê mora em " + endereco + " e atua na área de " + area
                              +"\nSeu telefone é " + telefone);
    }
    
}
