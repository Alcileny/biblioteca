public class NotificacaoLembreteLivro implements Notificacao {
    @Override
    public void enviarEmail(String destinatario, String mensagem) {
        
        String assunto = "Lembrete de Prazo de Livro";
        String corpoEmail = String.format("Olá %s,\n\n%s\n\nNão se esqueça de devolver o livro até o prazo estipulado.", destinatario, mensagem);
        System.out.println(String.format("Enviando email para %s - Assunto: %s\nCorpo: %s", destinatario, assunto, corpoEmail));
    }
}
    

