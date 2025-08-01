import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Exibir as mensagens para o nosso usuario
        System.out.println("Por favor, digite o número da conta");
        //TODO: Obter pela scanner os valores digitados no terminal
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o código da Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo");
        double saldo = scanner.nextDouble();

        //TODO: Exibir a mensagem conta criada
        System.out.println("Olá ".concat(nomeCliente) + ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) 
                          + ", conta" + numero + " e seu saldo " + saldo + "já está disponível" );

        scanner.close();
    }
}