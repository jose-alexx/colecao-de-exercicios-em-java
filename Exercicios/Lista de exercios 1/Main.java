import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        int soma = 0;
        int n;

        for(int i=0; i<contador; i++) {

            System.err.println("Informe um numero: ");
            n = entrada.nextInt();

            if(n > 0) {
                for(int j=1; j<=n; j++) {
                    if(j % 3 == 0) {
                        soma += j;
                    }
                }
            } else {
                contador++;
            }
        }
        System.err.println("Soma dos múltiplos de 3: " + soma);
        entrada.close();
    }
}
