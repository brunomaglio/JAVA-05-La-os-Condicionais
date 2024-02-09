import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float saldo = 1000.00F;
        System.out.println("Qual operação deseja realizar? ");
        System.out.println("(1 = Saldo; 2 = Saque; 3 = Depósito)");
        int codigo = scanner.nextInt();

        if (codigo > 3 || codigo < 1) {
            System.out.println("Operação Inválida!");
        } else {

            switch (codigo) {
                case 1:
                    System.out.println("Operação - saldo");
                    System.out.println("saldo : R$" + saldo);
                    break;
                case 2:
                    System.out.println("Qual o valor do saque? ");
                    float saque = scanner.nextFloat();
                    if (saque > saldo) {
                        System.out.println("Operação - saque");
                        System.out.println("Saldo Insuficiente!");

                    } else {
                        saldo = saldo - saque;
                        System.out.println("Operação - saque");
                        System.out.println("Novo saldo: R$" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Qual o valor do depósito? ");
                    float deposito = scanner.nextFloat();
                    saldo = deposito + saldo;
                    System.out.println("Operação - depósito");
                    System.out.println("Novo saldo: R$" + saldo);


            }
        }


    }
}