import java.util.Locale;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        try{

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o seu primeiro nome?");
        String nome = scan.next();

        System.out.println("Qual é o seu sobrenome?");
        String sobrenome = scan.next();

        System.out.println("Qual é a sua idade?");
        int idade = scan.nextInt();

        System.out.println("Qual é a sua altura");
        int altura = scan.nextInt();
        scan.close();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " "  + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm ");
        }catch(java.util.InputMismatchException e){
            System.err.println("Os campos IDADE e ALTURA precisam ser numéricos");
        }
        
    }
}
