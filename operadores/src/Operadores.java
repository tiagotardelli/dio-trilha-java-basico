import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {
        atribuicaoVariaveis();
        concatenacao();;
        trabalhandoSinais();
        repeticaoNumeros();
        booleanos();
        ternario();
        relacionais();
        logicos();
    }

    public static void atribuicaoVariaveis (){
        String nome = "Tiago";
        Date dataNascimento = new Date();
        double soma = 10.5 + 15.7;
        double resultado = (10 * 7) + (20 / 4);
        String nomeCompleto = "LINGUAGEM" + " JAVA";

        System.out.println(nome);
        System.out.println(dataNascimento);
        System.out.println(soma);
        System.out.println(resultado);
        System.out.println(nomeCompleto);
    }

    public static void concatenacao(){
        
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
    
    public static void trabalhandoSinais(){
        int numero = 5;
        
        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);
    }

    public static void repeticaoNumeros (){
        int numero = 5;
        numero ++;
        //numero = numero + 1; -> mesma coisa
        System.out.println(numero);
        System.out.println(numero ++);
        System.out.println(numero);
        System.out.println(++ numero);
        System.out.println(numero --);
    }

    public static void booleanos(){
        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(variavel);
    }

    public static void ternario(){
        int a, b;
        a = 5;
        b = 6;

        String resultado1 = a == b ? "VERDADEIRO" : "FALSO";
        System.out.println(resultado1);

        a = 6;
        b = 6;
        String resultado2 = a == b ? "VERDADEIRO" : "FALSO";
        System.out.println(resultado2);
    }

    public static void relacionais(){
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Número 1 é igual ao número 2? " + simNao);
        
        simNao = numero1 > numero2;
        System.out.println("Número 1 maior que número 2?" + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 é diferente de número 2?" + simNao);

        String nomeUm = "TIAGO";
        String nomeDois = "TIAGO";
        String nomeTres = new String("TIAGO");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm == nomeTres);
        System.out.println(nomeUm.equals(nomeTres));
    }

    public static void logicos(){
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }
}
