import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual numero do produto? ");
        int codigo = scanner.nextInt();
        String nome = null;
        float valor = 0;

        switch (codigo) {
            case 1:
                nome = "Cachorro quente";
                valor = 10.00F;
                break;
            case 2:
                nome = "X-Salada";
                valor = 15.00F;
                break;
            case 3:
                nome = "X-Bacon";
                valor = 18.00F;
                break;
            case 4:
                nome = "Bauru";
                valor = 12.00F;
                break;
            case 5:
                nome = "Refrigerante";
                valor = 8.00F;
                break;
            case 6:
                nome = "Suco de laranja";
                valor = 13.00F;
                break;
            default:
                System.out.println("codigo invalido!");

        }
        System.out.println("Qual a quantidade do produto? ");
        int quantidade = scanner.nextInt();

        float valorTotal = valor * quantidade;

        System.out.println("produto: " + nome + "\nValor total: " + valorTotal);

    }
}