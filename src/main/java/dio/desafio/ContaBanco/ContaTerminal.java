package dio.desafio.ContaBanco;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        Scanner ENTRADA = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numero = ENTRADA.nextInt();
        ENTRADA.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = ENTRADA.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = ENTRADA.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = ENTRADA.nextDouble();

        ENTRADA.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
                nomeCliente, agencia, numero, saldo);

    }
}
