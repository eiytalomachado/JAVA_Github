import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Qual é o seu nome? ");
        String nome = scanner.next();

        System.out.println("Qual é o seu nome sobrenome? ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da sua agência! ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta! ");
        int conta = scanner.nextInt();

        System.out.println("Qual é o seu saldo? ");
        double saldo = scanner.nextDouble();

        System.out.println (" \nOlá " + nome + " " + sobrenome + "! Obrigado por criar uma conta em nosso banco!");
        System.out.println( "Sua Agência é, "+ agencia + " Conta " + conta + " e seu Saldo " + saldo);
        System.out.println("Já está disponível para saque!");


    }
}
