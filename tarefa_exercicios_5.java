
import java.util.Scanner;

public class tarefa_exercicios_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Qual é a quantidade de vitórias do líder do campeonato?");
            int vitLider = scan.nextInt();
            
            System.out.println("Qual é a quantidade de vitórias do time lanterna?");
            int vitLanterna = scan.nextInt();
            
            int pontosLider = vitLider * 3;
            int pontosLanterna = vitLanterna * 3;
            
            System.out.println("O total de pontos do líder é: " + pontosLider);
            System.out.println("O total de pontos do time lanterna é: " + pontosLanterna);
            
            int pontosFalta = (pontosLider - pontosLanterna)/3;
            
            System.out.println("A quantidade de vitórias necessárias para que o time lanterna alcance o líder do campeonato é: " + pontosFalta);
    }
    
}
