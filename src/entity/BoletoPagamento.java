package entity;

import interfaces.PaymentType;

/**
 * Usamos SRP porque essa classe tem apenas a responsabilidade de pagar via boleto.
 *
 * O LSP permite que ela seja usada sem mudar nada na classe principal.
 */
public class BoletoPagamento implements PaymentType {
    public void pagamento(double quantidade){
        System.out.println("Pagamento realizado no boleto no valor de: " + quantidade);
    }
}
