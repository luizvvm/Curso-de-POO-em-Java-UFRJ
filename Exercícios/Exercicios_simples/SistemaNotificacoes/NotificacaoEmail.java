public class NotificacaoEmail implements Notificavel{
    private String enderecoEmail;

    public NotificacaoEmail(String enderecoEmail){
        this.enderecoEmail = enderecoEmail;
    }

    @Override
    public void enviarNotificacao(String mensagem){
        System.out.println("Enviando a mensagem " + mensagem + " para o email " + this.enderecoEmail);
    }
}