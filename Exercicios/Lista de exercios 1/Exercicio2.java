import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade_pessoa;

        System.out.println("Informe a sua idade: ");
        idade_pessoa = entrada.nextInt();

        if (idade_pessoa >= 1 && idade_pessoa < 18) {
            System.out.println("Você é menor de idade");
        } else if (idade_pessoa >= 18 && idade_pessoa < 65) {
            System.out.println("Você é maior de idade");
        } else if (idade_pessoa >= 65) {
            System.out.println("Você é idoso(a)");
        }
    }
} 