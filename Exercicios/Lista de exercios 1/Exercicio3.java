import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int multiplo;

        System.err.print("Informe um número inteiro:");
        int num = entrada.nextInt();

        for(int i=1; i<=10; i++) {
            multiplo = 0;
            multiplo = num * i;
            System.err.printf("%d%s%d%s%d\n", num, " x ", i, " = ", multiplo);
        }
    }
}
