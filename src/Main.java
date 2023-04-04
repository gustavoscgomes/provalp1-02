import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Conta c = new Conta();

        System.out.println("Bem vindo ao banco java");


        do {
            System.out.println("Digite 1 para deposito e 2 para saque: ");
            int x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.print("Quanto voce deseja depositar? ");
                    c.setValor(input.nextDouble());
                    System.out.println(c.deposito());
                    break;
                case 2:
                    System.out.println("Quanto voce deseja sacar? ");
                    c.setValor(input.nextDouble());
                    if (c.getValor() > c.getSaldo()) {
                        System.out.println("Saldo isuficiente");
                    } else {
                        System.out.println(c.saque());
                    }break;

            }


        } while (true);
    }
}
