package entity;

import interfaces.PaymentType;

/**
 * Usamos SRP aqui porque essa classe é responsável apenas pelo pagamento com cartão de crédito
 * Também aplicamos LSP, pois ela pode substituir qualquer outro método de pagamento sem afetar o funcionamento dele.
 */

public class CreditoPagamento implements PaymentType {
    @Override
    public void pagamento(double quantidade){
        System.out.println("Pagamento realizado no credito no valor de: " + quantidade);
    }
}
