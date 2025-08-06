import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         //TODO: Receber via terminal dois parâmetros inteiros
         System.out.println("Digite o primeiro parâmetro");
         int primeiroParametro = scanner.nextInt();

         System.out.println("Digite o segundo parâmetro");
         int segundoParametro = scanner.nextInt();

        try {
            
            contar(primeiroParametro, segundoParametro);

        } catch (ParametroInvalidoException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametroInvalidoException {
        if(primeiroParametro > segundoParametro)
            throw new ParametroInvalidoException();
        
        int contagem = segundoParametro - primeiroParametro;

        for(int i =1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
