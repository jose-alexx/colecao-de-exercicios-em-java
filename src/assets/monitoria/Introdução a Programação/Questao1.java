public class Questao1 {
    public static void main(String[] args) {
        double a = 5;
        double b = 50;
        double c = 10;
        double x1, x2;

        double raizReal = Math.pow(b, 2) -4 * a * c;

        if (raizReal >= 0) {
            x1 = (-b + Math.sqrt(raizReal)) / (2*a);
            x2 = (-b - Math.sqrt(raizReal)) / (2*a);

            System.out.println("O valor de X1 é igaul a: " + x1);
            System.out.println("O valor de X2 é igaul a: " + x2);
        } else {
            System.out.println("Não é uma raiz real");
        }
    }
}