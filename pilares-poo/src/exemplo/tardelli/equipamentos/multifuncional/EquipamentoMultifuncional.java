package exemplo.tardelli.equipamentos.multifuncional;

import exemplo.tardelli.equipamentos.copiadora.Copiadora;
import exemplo.tardelli.equipamentos.digitalizadora.Digitalizadora;
import exemplo.tardelli.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
}

