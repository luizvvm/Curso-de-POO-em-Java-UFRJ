public class SistemaDeAlertas{
    public static void main(String[] args) {
        NotificacaoEmail email1 = new NotificacaoEmail("luizvitorvieira.mattos@gmail.com");
        NotificacaoSMS numero1 = new NotificacaoSMS(999937841);

        email1.enviarNotificacao("você é brabo mlk");
        numero1.enviarNotificacao("Você é o cara mais brabo namoral");
    }
}