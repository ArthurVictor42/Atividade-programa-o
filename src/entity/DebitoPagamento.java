package entity;

import interfaces.TipoPagamento;

// Mesma explicações para os anteriores
public class DebitoPagamento implements TipoPagamento {

    @Override
    public String getNome() {
        return "Débito";
    }

    @Override
    public void pagamento(double quantidade) {
        System.out.println("Pagamento no débito no Total: " + quantidade);
    }
}
