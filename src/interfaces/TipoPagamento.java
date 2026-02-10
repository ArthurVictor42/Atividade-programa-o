package interfaces;

//Aqui usei ISP criando uma interface pequena, só com o método necessário que é pagamento
//Também usei OCP, porque novos tipos de pagamento podem ser criados sem alterar essa interface.
//utilizei DIP porque a classe principal vai depender dessa abstração, e não de uma classe concreta.
//O LSP é aplicado porque qualquer classe que implemente PaymentMethod pode ser usada no lugar de outra sem quebrar o sistema.

public interface TipoPagamento {

    // Ele pega o tipo de pagamento
    String getNome();

    void pagamento(double quantidade);
}