import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("É a sua primeira doação? (sim ou não)");
        String primeira = scanner.next();

        boolean vez;
        vez = Objects.equals(primeira, "sim");

        if (idade < 18 || idade > 69) {
            System.out.println(nome + " não está apto para doar sangue!");

        } else if (idade > 60) {
            if (vez) {
                System.out.println(nome + " não está apto para doar sangue!");

            } else {
                System.out.println(nome + " está apto para doar sangue!");

            }

        } else {
            System.out.println(nome + " está apto para doar sangue!");

        }

    }
}