
public class Exercicio5 {
    public static void main(String[] args) {
        int numInteiro[] = new int[10];
        int numPar[] = new int[10];
        int numImpar[] = new int[10];
        int contPar = 0;
        int contImpar = 0;

        for(int i=0; i<10; i++) {
            numInteiro[i] = i+1;
        }

        for (int i = 0; i < numInteiro.length; i++) {
            if (numInteiro[i] % 2 == 0) {
                numPar[contPar] = numInteiro[i];
                contPar++;
            } else {
                numImpar[contImpar] = numInteiro[i];
                contImpar++;
            }
        }

        System.err.print("Pares: ");
        for(int i=0; i<contPar; i++) {
            System.err.print(numPar[i] + " ");
        }

        System.err.print("\nImpares: ");
        for(int i=0; i<contImpar; i++) {
            System.err.print(numImpar[i] + " ");
        }
    }
}
