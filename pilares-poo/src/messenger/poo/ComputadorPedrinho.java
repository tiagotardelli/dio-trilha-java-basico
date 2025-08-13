package messenger.poo;

import messenger.poo.apps.FacebookMessenger;
import messenger.poo.apps.MSNMessenger;
import messenger.poo.apps.ServicoMensagemInstantanea;
import messenger.poo.apps.TelegramMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        /*
            NÃO SE SABE QUAL APP
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGENS
        */
        String appEscolhido = "tlg";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new TelegramMessenger();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}