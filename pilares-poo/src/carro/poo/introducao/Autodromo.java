package carro.poo.introducao;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeta = new Carro();
        jeta.setChassi("123312123");
        //jeta.ligar();

        Motocicleta fazer = new Motocicleta();
        fazer.setChassi("12313212");
        //fazer.ligar();

        Veiculo coringa = jeta;
        coringa.ligar();
    }
}
