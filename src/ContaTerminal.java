import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner accountInfo = new Scanner(System.in);
        System.out.print("Bem vindo ao seu Banco Digital! \n Por favor, digite o número da sua conta: \n");
        var accountNumber = accountInfo.nextInt();
        System.out.println("Agora digite o número da sua Agência: ");
        var accountAgency = accountInfo.next();
        System.out.println("Digite seu nome completo: ");
        var accoountOwner = accountInfo.next();
        System.out.println();
    }

}
