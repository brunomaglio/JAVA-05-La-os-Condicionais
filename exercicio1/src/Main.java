import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Me de um número: ");
        int A = scanner.nextInt();
        System.out.println("Me de um número: ");
        int B = scanner.nextInt();
        System.out.println("Me de um número: ");
        int C = scanner.nextInt();

        int soma = A + B;

        if (soma > C) {
            System.out.println("A Soma de A + B é Maior do que C! " + A + "+" + B + "=" + soma + ">" + C);

        } else if (soma == C) {
            System.out.println("A Soma de A + B é igual ao valor C! " + A + "+" + B + "=" + soma + "=" + C);

        } else {
            System.out.println("A Soma de A + B é menor que C! " + A + "+" + B + "=" + soma + "<" + C);
        }

    }
}