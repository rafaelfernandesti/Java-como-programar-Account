
import java.util.Scanner;


public class AccountTest {
    
    public static void main(String[] args)
    {
        Account account1 = new Account("Jane Green", 50);
        Account account2 = new Account("John Blue", -10.50);
        
        //exibe saldo inicial dos objetos
        System.out.printf("%s Saldo da conta 1: %.2f %n",account1.getName(), account1.getBalance());
        System.out.printf("%s Saldo da conta 2: %.2f %n",account2.getName(),account2.getBalance());
        
        //cria um Scanner para a entrada dos dados na linha de comandos
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor do depósito para a Conta 1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdicionando %.2f ao saldo da Conta 1%n", depositAmount);
        account1.deposit(depositAmount);
        
        //exibe os saldos das duas contas
        System.out.printf("%s Saldo: %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s Saldo: %.2f %n", account2.getName(), account2.getBalance());
        
        System.out.println("Digite o valor do depósito para a Conta 2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nAdicionando %.2f ao saldo da Conta 2%n", depositAmount);
        account2.deposit(depositAmount);
        
        System.out.printf("%s Saldo: %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s Saldo: %.2f %n", account2.getName(), account2.getBalance());
        
    }
    
}
