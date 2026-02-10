import entity.DebitoPagamento;
import entity.PixPagamento;
import interfaces.TipoPagamento;
import repository.PedidoRepositorio;
import services.Calculartotal;
import services.EmailServico;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TipoPagamento payment = new DebitoPagamento();

        TipoPagamento payment2 = new PixPagamento();

        OrderService service = new OrderService(
                payment2,
                new Calculartotal(),
                new PedidoRepositorio(),
                new EmailServico()
        );

        service.processOrder(
                "Arthur@email.com",
                List.of("Produto 32", "Produto 21")
        );
    }
}
