package services;

// usei o SRP porque essa classe é responsável somente pelo envio de emails.//
public class EmailServico {

    public void enviar(String email) {
        System.out.println("Enviando para " + email);
    }

}
