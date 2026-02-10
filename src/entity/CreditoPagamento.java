package entity;

import interfaces.TipoPagamento;

// usei SRP aqui porque essa classe é responsável apenas pelo pagamento com cartão de crédito
//Também aplicamos LSP, pois ela pode substituir qualquer outro método de pagamento sem afetar o funcionamento dele.

public class CreditoPagamento implements TipoPagamento {
    @Override
    public void pagamento(double quantidade) {
        System.out.println("Pagamento no credito no valor de: " + quantidade);
    }
}
