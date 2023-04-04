import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
        Conta c = new Conta();

        String continuar;

        System.out.println("Bem vindo ao banco java");


        do {
            System.out.println("Digite 1 para deposito e 2 para saque: ");
            int x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.print("Quanto voce deseja depositar? ");
                    c.setValor(input.nextDouble());
                    System.out.printf("Seu saldo e: %.2f%n", c.deposito());
                    break;
                case 2:
                    System.out.println("Quanto voce deseja sacar? ");
                    c.setValor(input.nextDouble());
                    if (c.getValor() > c.getSaldo()) {
                        System.out.println("Saldo isuficiente");
                    } else {
                        System.out.printf("Seu saldo e: %.2f%n", c.saque());
                    }break;

            }
            System.out.print("Deseja continuar? S/N");
            continuar = input.next().toUpperCase();


        } while (!continuar.equals("N"));

        System.out.println("Encerando programa...");
    }
}
