import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Qual o código de seu cargo? ");
        int codigo = scanner.nextInt();
        System.out.println("Qual o seu salário? ");
        float salario = scanner.nextFloat();

        String cargo = null;
        float reajuste = 0;
        switch (codigo) {
            case 1:
                cargo = "Gerente";
                reajuste = 0.10F;
                break;
            case 2:
                cargo = "Vendedor";
                reajuste = 0.07F;
                break;
            case 3:
                cargo = "Supervisor";
                reajuste = 0.09F;
                break;
            case 4:
                cargo = "Motorista";
                reajuste = 0.06F;
                break;
            case 5:
                cargo = "Estoquista";
                reajuste = 0.05F;
                break;
            case 6:
                cargo = "Técnico de TI";
                reajuste = 0.08F;
                break;
            default:
                System.out.println("codigo invalido!");

        }

        float novoSalario = salario + (reajuste * salario);

        System.out.println("Nome do colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário reajustado: " + novoSalario);

    }
}