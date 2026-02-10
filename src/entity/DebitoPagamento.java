package entity;
import interfaces.TipoPagamento;

// Mesma explicações para os anteriores
public class DebitoPagamento implements TipoPagamento {
    @Override
    public void pagamento(double quantidade) {
        System.out.println("Pagamento no debito no valor de: " + quantidade);
    }

}
