import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanhoVetor = 5;
        double vertor[] = new double[tamanhoVetor];
        double maiorValor = 0;
        double menorValor = 0;
        double somaValor = 0;
        double mediaValor;

        for(int i=0; i<vertor.length; i++) {
            System.out.printf("%s%d%s\n", "Informe o ", (i+1), "° número: ");
            vertor[i] = entrada.nextDouble();
            somaValor = somaValor + vertor[i];
        }

        for(int i=0; i<vertor.length; i++) {
            if(maiorValor < vertor[i]) {
                maiorValor = vertor[i];
            }
        }

        for(int i=0; i<vertor.length; i++) {
            if(menorValor > vertor[i] || menorValor == 0) {
                menorValor = vertor[i];
            }
        }

        mediaValor = somaValor / tamanhoVetor;

        System.err.printf("%s%.2f\n", "Média: ", mediaValor);
        System.err.printf("%s%.2f\n", "Maior nota: ", maiorValor);
        System.err.printf("%s%.2f\n", "Menor nota: ", menorValor);

    }
}
