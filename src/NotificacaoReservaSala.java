public class NotificacaoReservaSala implements Notificacao {
    @Override
    public void enviarEmail(String destinatario, String mensagem) {
        String assunto = "Confirmação de Reserva de Sala";
        String corpoEmail = String.format("Olá %s,\n\n%s\n\nSua reserva de sala foi confirmada.", destinatario, mensagem);  
        System.out.println(String.format("Enviando email para %s - Assunto: %s\nCorpo: %s", destinatario, assunto, corpoEmail));
    }
}  