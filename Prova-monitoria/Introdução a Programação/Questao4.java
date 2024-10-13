import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        boolean diferenca;

        System.err.println("---------Primeiro Vetor---------\n");

        for (int i=0; i<vetor1.length; i++) {
            System.err.println("Imprima o valor da " + (i+1) + "° posição: ");
            vetor1[i] = entrada.nextInt();
        }

        System.err.println("\n---------Segundo Vetor---------\n");

        for (int i=0; i<vetor2.length; i++) {
            System.err.println("Imprima o valor da " + (i+1) + "° posição: ");
            vetor2[i] = entrada.nextInt();
        }

        System.err.println("\nValores do Primeiro vetor que não estão no segundo vetor\n");

        for (int i=0; i<vetor1.length; i++) {
            diferenca = false;

            for (int j=0; j<vetor2.length; j++) {

                if (vetor1[i] == vetor2[j]) {
                    diferenca = true;
                    break;
                }
            }

            if (!diferenca) {
                System.out.println(vetor1[i]);
            }

        }    
    }
}