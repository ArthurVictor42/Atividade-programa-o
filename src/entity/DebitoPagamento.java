package entity;
import interfaces.PaymentType;

public class DebitoPagamento implements PaymentType {
    @Override
    public void pagamento(double quantidade) {
        System.out.println("Pagamento no debito no valor de: " + quantidade);
    }

}
