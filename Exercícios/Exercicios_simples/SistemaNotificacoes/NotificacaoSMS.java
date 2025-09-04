public class NotificacaoSMS implements Notificavel{
    private int numeroTelefone;

    public NotificacaoSMS(int numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviarNotificacao(String mensagem){
        System.out.println("Enviando a mensagem " + mensagem + " para o número " + this.numeroTelefone);
    }
}
