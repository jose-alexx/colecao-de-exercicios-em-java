import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean numeroPrimo = true;

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero <= 1) {
            numeroPrimo = false; 
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    numeroPrimo = false;
                    break;
                }
            }
        }

        if (numeroPrimo) {
            System.out.println("O numero " + numero + " eh primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}