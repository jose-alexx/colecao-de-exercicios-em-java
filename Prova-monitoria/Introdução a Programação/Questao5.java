import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        int fatorial[] = new int[5];

        for (int i=0; i<vetorA.length; i++) {
            System.err.println("Imprima o valor da " + (i+1) + "° posição: ");
            vetorA[i] = entrada.nextInt();
        }

        for (int i=0; i<vetorB.length; i++) {
            
            /** Não lembro o que é um fatorial */
        }
    }
}