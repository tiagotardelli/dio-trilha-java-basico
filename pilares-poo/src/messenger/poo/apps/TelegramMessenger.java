package messenger.poo.apps;

public class TelegramMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram Messenger");
    }
}
