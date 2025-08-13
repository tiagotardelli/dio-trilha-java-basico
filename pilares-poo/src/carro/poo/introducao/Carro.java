package carro.poo.introducao;

public class Carro extends Veiculo {

    @Override
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel(){
        System.out.println("CONFERINDO COMBUSTÍVEL");
    }

    private void confereCambio(){
        System.out.println("CONFERINDO CAMBIO EM P");
    }
}
