public class tarefa_exercicios_1 {

    public static void main(String[] args) {
        int x = 5;
        int z = 3;
        
        System.out.println("Valores originais:");
        System.out.println("x = " +x);
        System.out.println("z = " +z);
        
        int troca = x;
        x = z;
        z = troca;
        
        System.out.println("Valores trocados:");
        System.out.println("x = " +x);
        System.out.println("z = " +z);
    }
    
}
