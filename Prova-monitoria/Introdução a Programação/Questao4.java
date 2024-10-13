import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetorDiferenca = new int[5];

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

        /*

        Não entendi essa parte se era para mostrar realmente a diferença ou os valores de x que não aparecem em y
         for (int i=0; i<vetorDiferenca.length; i++) {
            for (int j=0; j<vetorDiferenca.length; j++) {
                if (vetor1[i] != vetor2[j]) {
                    vetorDiferenca = 
                }
            }

        }
         */

         for (int i=0; i<vetorDiferenca.length; i++) {
            vetorDiferenca[i] = vetor1[i] - vetor2[i];
            System.out.println("A diferença da posicão [" + (i+1) + "] é: " + vetorDiferenca[i]);
         }
    }
    
}