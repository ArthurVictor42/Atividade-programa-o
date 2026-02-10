package entity;

import interfaces.PaymentType;

public class BoletoPagamento implements PaymentType {
    public void pagamento(double quantidade){
        System.out.println("Pagamento realizado no boleto no valor de: " + quantidade);
    }
}
