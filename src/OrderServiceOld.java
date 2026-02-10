import java.util.*;

class OrderServiceOld {

    public void processOrder(String customerEmail, List<String> items, String paymentType)
    {
        // Primeiro erro foi SRP
        // Aqui a classe já começa calculando o valor do pedido, porem isso deveria ser responsabilidade de outra classe.
        double total = 0;
        for (String item : items) {
            total += 10.0;
        }

        // Segundo erro, OCP + DIP
        // Uso de if/else para decidir o tipo de pagamento. Para adicionar uma nova forma de pagamamento, essa classe teria que ser modificada.
        // Além disso, a classe depende de detalhes concretos, e não de abstrações.
        if (paymentType.equals("credit")) {
            System.out.println("Pagando com cartão de crédito: " + total);
        } else if (paymentType.equals("pix")) {
            System.out.println("Pagando com PIX: " + total);
        } else if (paymentType.equals("boleto")) {
            System.out.println("Pagando com boleto: " + total);
        }

        // novamente erro de srp
        // Persistência do pedido está misturada com outras responsabilidade. Se mudar a forma de armazenar, essa classe precisa ser modificada.
        System.out.println("Salvando pedido no banco");

        //Tbm erro de srp Envio de email também é responsabilidade diferente.
        System.out.println("Enviando email para " + customerEmail);
    }
}

