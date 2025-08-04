public class ResultadoEscolar {
    public static void main(String[] args) {
        estruturaCondicionalComposta();
        estruturaCondicionalEncadeada();
        estruturaCondicionalTernaria();
    }

    public static void estruturaCondicionalComposta(){
        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }

    public static void estruturaCondicionalEncadeada(){
        int nota = 8;

        if(nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }

    public static void estruturaCondicionalTernaria(){
        int nota = 7;
    
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
    }
}
