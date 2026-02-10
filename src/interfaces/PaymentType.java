package interfaces;

/**
 * Aqui usamos ISP criando uma interface pequena, só com o método necessário que é pagamento
 * Também usamos OCP, porque novos tipos de pagamento podem ser criados sem alterar essa interface.
 * Aplicamos DIP porque a classe principal vai depender dessa abstração, e não de uma classe concreta.
 * O LSP é aplicado porque qualquer classe que implemente PaymentMethod pode ser usada no lugar de outra sem quebrar o sistema.
 */

public interface PaymentType {

    void pagamento(double quantidade);
}
