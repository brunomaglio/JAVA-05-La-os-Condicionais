import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Me de um número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("O numero " + numero + " é par e positivo!");
            } else {
                System.out.println("O numero " + numero + " é impar e positivo!");
            }
        } else if (numero < 0) {
            if (numero % 2 == 0) {
                System.out.println("O numero " + numero + " é par e negativo!");
            } else {
                System.out.println("O numero " + numero + " é impar e negativo!");
            }

        } else {

            System.out.println("O numero é 0!");
        }


    }
}