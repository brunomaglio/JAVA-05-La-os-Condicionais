import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Me de o primeiro número: ");
        float n1 = scanner.nextFloat();
        System.out.println("Me de o segundo número: ");
        float n2 = scanner.nextFloat();
        System.out.println("Qual operação deseja realizar? ");
        System.out.println("(1 = soma, 2 = subtração, 3 = multiplicação, 4 = divisão) ");
        int conta = scanner.nextInt();
        float resultado = 0;

        if (conta > 4 || conta < 1) {
            System.out.println("Operação Inválida!");

        } else {

            switch (conta) {

                case 1:
                    resultado = n1 + n2;
                    System.out.println(n1 + " + " + n2 + " = " + resultado);
                    break;
                case 2:
                    resultado = n1 - n2;
                    System.out.println(n1 + " - " + n2 + " = " + resultado);
                    break;
                case 3:
                    resultado = n1 * n2;
                    System.out.println(n1 + " X " + n2 + " = " + resultado);
                    break;
                case 4:
                    resultado = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + resultado);
                    break;

            }
        }
    }
}