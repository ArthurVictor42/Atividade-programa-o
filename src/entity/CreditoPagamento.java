package entity;

import interfaces.PaymentType;

public class CreditoPagamento implements PaymentType {
    @Override
    public void pagamento(double quantidade){
        System.out.println("Pagamento realizado no credito no valor de: " + quantidade);
    }
}
