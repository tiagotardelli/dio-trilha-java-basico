public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero ++){

            if(numero == 2)
                continue;
            if(numero == 4)
                break;

            System.out.println(numero);
        }
    }
}
