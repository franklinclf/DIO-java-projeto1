import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o numero da agencia: ");
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o numero da conta: ");
        numero = entrada.nextInt();

        System.out.println("Por favor, digite o saldo inicial: ");
        saldo = entrada.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f ja está disponível para saque", nomeCliente, agencia, numero, saldo);

        entrada.close();
    }
}
