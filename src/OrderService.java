import java.util.*;

import interfaces.TipoPagamento;
import repository.PedidoRepositorio;
import services.Calculartotal;
import services.EmailServico;

// Aqui usei o SRP por motivos de que essa classe apenas coordena o fluxo do pedido. Usamos OCP porque novos métodos de pagamento
// podem ser adicionados sem alterar essa classe. Aplicamos DIP porque ela depende da interface  PaymentMethod e não de implementações concretas.
public class OrderService {

    private final TipoPagamento tipoPagamento;
    private final Calculartotal calculator;
    private final PedidoRepositorio repository;
    private final EmailServico emailService;

    // Injeção de dependência manual
    public OrderService(
            TipoPagamento tipoPagamento,
            Calculartotal calculator,
            PedidoRepositorio repository,
            EmailServico emailService
    ) {
        this.tipoPagamento = tipoPagamento;
        this.calculator = calculator;
        this.repository = repository;
        this.emailService = emailService;
    }

    public void processOrder(String customerEmail, List<String> items) {
        double total = calculator.calculateTotal(items);

        System.out.println("Método escolhido: " + tipoPagamento.getNome());

        tipoPagamento.pagamento(total);

        repository.armazenar();

        emailService.enviar(customerEmail, tipoPagamento.getNome());
    }
}

