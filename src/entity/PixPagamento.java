package entity;

import interfaces.TipoPagamento;
//Como dito anteriomente, aplicamos SRP porque essa classe cuida somente do pagamento via PIX.
//O LSP é respeitado, já que essa classe pode ser usada no lugar de qualquer metodo de pagamento.

public class PixPagamento implements TipoPagamento {

    @Override
    public String getNome() {
        return "PIX";
    }

    @Override
    public void pagamento(double quantidade) {
        System.out.println(
                "Pagamento no PIX no total:" + quantidade
        );
    }
}
