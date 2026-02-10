package entity;
import interfaces.PaymentType;

public class PixPagamento implements PaymentType {

    public void pagamento(double quantidade){
        System.out.println("Pagamento no pix realizado no valor de: " + quantidade);
    }

}
