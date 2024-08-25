import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int numeroUm = scan.nextInt();
        
        System.out.println("Digite o segundo número:");
        int nuemroDois = scan.nextInt();
        
        try {
            contar(numeroUm, nuemroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int numeroUm, int nuemroDois) throws ParametrosInvalidosException {
        if (numeroUm > nuemroDois) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
        }

        int contagem = nuemroDois - numeroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
