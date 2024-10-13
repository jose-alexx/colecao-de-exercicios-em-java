import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int valorA = entrada.nextInt();

        System.out.println("Digite o valor de B: ");
        int valorB = entrada.nextInt();

        System.out.println("Digite o valor de C: ");
        int valorC = entrada.nextInt();

        if ((valorA + valorB > valorC) && (valorA + valorC > valorB) && (valorB + valorC > valorA)) {

            double p = (valorA + valorB + valorC) / 2.0;

            double areaTriangulo = Math.sqrt(p * (p - valorA) * (p - valorB) * (p - valorC));

            System.out.println("Os três lados formam um triângulo");
            System.out.printf("A área é igual a: %.2f", areaTriangulo);

        } else {
            System.out.println("Os três lados não formam um triângulo.");
        }
        entrada.close();
    }
}