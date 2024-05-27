import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o Número da Conta: ");
        int numero = sc.nextInt();

        System.out.print("Por favor, digite a Agência da Conta: ");
        String agencia = sc.next();
        sc.nextLine();
        
        System.out.print("Por favor, digite o Nome do Cliente da Conta: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o Saldo da Conta: ");
        double saldo = sc.nextDouble();

        ContaBancaria cb = new ContaBancaria(numero, agencia, nomeCliente, saldo);

        sc.close();

        System.out.println(cb);
        

    }
}
