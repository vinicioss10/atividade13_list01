import java.util.Scanner;

/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7 */

public class App {
    public static void main(String[] args) throws Exception {
        double h;
        double m;
        double f;
        Scanner dig;
        dig = new Scanner(System.in);
        System.out.println("Informe a altura para o cauculo do peso ideal dos homens e mulheres");
        h = dig.nextDouble();

        m = (72.7 * h) - 58;
        f = (62.1 * h) - 44.7;

        System.out.println("O peso ideal para os homens é " + m + "Kg" + " e para as mulheres é " + f + " Kg");

    }
}
