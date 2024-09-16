/**
 * Exercicio--01
 */
import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in); // Definindo o Scanner
        
        int primeiro_Num, segundo_Num;

        System.out.println("Digite o primeiro número: "); // Método Sistem.out 
        primeiro_Num = entrada.nextInt();
        
        System.out.println("Digite o segundo número: ");
        segundo_Num = entrada.nextInt();

        int soma, subtracao, multiplicacao;
        float divisao;

        soma = primeiro_Num + segundo_Num;
        subtracao = primeiro_Num - segundo_Num;
        multiplicacao = primeiro_Num * segundo_Num;
        divisao = (float) primeiro_Num / segundo_Num;

        // https://dev.to/linivecristine/print-vs-println-vs-printf-qual-a-diferenca-5dk0
        // https://www.bosontreinamentos.com.br/java/metodos-printf-print-e-println-curso-de-programacao-em-java/

        System.out.print("\nSoma: " + soma + "\n");
        System.out.printf("%s%d\n", "Subtração: ", subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.printf("%s%.2f", "Divisão: ", divisao);
    }

}