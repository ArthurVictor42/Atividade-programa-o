package services;

// usei o SRP porque essa classe é responsável somente pelo envio de emails.//
public class EmailServico {

    public void enviar(String email, String metodoPagamento) {
        System.out.println("Email enviado para " + email + " no método de pagamento: " + metodoPagamento
        );
    }
}
