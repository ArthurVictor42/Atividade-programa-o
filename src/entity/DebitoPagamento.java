package entity;
import interfaces.PaymentType;

// Mesma explicações para os anteriores
public class DebitoPagamento implements PaymentType {
    @Override
    public void pagamento(double quantidade) {
        System.out.println("Pagamento no debito no valor de: " + quantidade);
    }

}
