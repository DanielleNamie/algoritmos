package exercicios_aula4;

public class exercicio14 {

    public static void main(String[] args) {
        int n = 100;
        long f1 = 0;
        long f2 = 1;
        
        System.out.println("Série de Fibonacci até a " + n + " posição: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.println(f1);
            long soma = f1 + f2;
            f1 = f2;
            f2 = soma;
        }
    }

}
