import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner accountInfo = new Scanner(System.in);
        System.out.print("Bem vindo ao seu Banco Digital! \nPor favor, digite o número da sua conta: \n");
        var accountNumber = accountInfo.nextInt();
        accountInfo.nextLine();
        System.out.println("Agora digite o número da sua Agência: ");
        var accountAgency = accountInfo.nextLine();
        System.out.println("Digite seu nome completo: ");
        var accountOwner = accountInfo.nextLine();
        System.out.println("Digite o saldo desejado para saque: ");
        var withdrawValue = accountInfo.nextFloat();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", accountOwner, accountAgency, accountNumber, withdrawValue);
        accountInfo.close();
    }

}
