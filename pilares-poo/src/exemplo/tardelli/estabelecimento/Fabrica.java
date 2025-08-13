package exemplo.tardelli.estabelecimento;

import exemplo.tardelli.equipamentos.copiadora.Copiadora;
import exemplo.tardelli.equipamentos.digitalizadora.Digitalizadora;
import exemplo.tardelli.equipamentos.digitalizadora.Scanner;
import exemplo.tardelli.equipamentos.impressora.Deskjet;
import exemplo.tardelli.equipamentos.impressora.Impressora;
import exemplo.tardelli.equipamentos.impressora.Laserjet;
import exemplo.tardelli.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();

        Laserjet laserjet = new Laserjet();

        Scanner scanner = new Scanner();


        Impressora impressora = em;
        Impressora impressora2 = deskjet;
        Impressora impressora3 = laserjet;

        Digitalizadora digitalizadora = em;
        Digitalizadora digitalizadora2 = scanner;

        Copiadora copiadora = em;

        impressora.imprimir();
        impressora2.imprimir();
        impressora3.imprimir();

        digitalizadora.digitalizar();
        digitalizadora2.digitalizar();
        
        copiadora.copiar();

    
    }
}
