public class Escopo {
    static String escopoMaior; 
    public static void main(String[] args) throws Exception {
        usandoEscopoMaior();
        usandoEcopoMetodo();
        usandoEcopoForDentroMetodo();
    }

    public static void usandoEscopoMaior(){
        escopoMaior = "Declarada no início da classe";
        System.out.println(escopoMaior);
    } 

    public static void usandoEcopoMetodo(){
        String valorInternoMetodo = "somente dentro do metodo";

        System.out.println(valorInternoMetodo);
    }

    public static void usandoEcopoForDentroMetodo(){
        int valorMetodo = 1;
        for(int x=1; x<=5; x++){
            int valorInternoMetodo = x;
            System.out.println("Executando valor interno no for " + valorInternoMetodo);
            System.out.println("Somando valor interno no for " + (valorInternoMetodo + valorMetodo));
        }
    }
}
