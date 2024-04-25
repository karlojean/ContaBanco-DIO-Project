import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    System.out.println("Digite o numero da agencia: ");
    agencia = scanner.next();

    System.out.println("Digite o numero da conta: ");
    numero = scanner.nextInt();

    System.out.println("Digite seu nome: ");
    nomeCliente = scanner.next();

    System.out.println("Digite seu saldo: ");
    saldo = scanner.nextDouble();


    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
  }
  

}
