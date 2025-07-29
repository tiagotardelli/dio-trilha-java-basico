public class App {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada ? " + (smartTV.ligada ? "Sim" : "Não"));
        System.out.println("Canal Atual " + smartTV.canal);
        System.out.println("Volume Atual " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + (smartTV.ligada ? "Sim" : "Não"));

        smartTV.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + (smartTV.ligada ? "Sim" : "Não"));

        smartTV.escolherCanal(20);
        System.out.println("Novo Status -> Canal Atual " + smartTV.canal);

        smartTV.diminuirCanal();
        smartTV.diminuirCanal();
        System.out.println("Novo Status -> Canal Atual " + smartTV.canal);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Novo Status -> Volume Atual " + smartTV.volume);

        smartTV.diminuirVolume();
        System.out.println("Novo Status -> Volume Atual " + smartTV.volume);
    }
}