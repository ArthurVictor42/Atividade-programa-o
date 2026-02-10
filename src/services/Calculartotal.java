package services;

import java.util.List;

// Aqui aplicamos SRP separando a responsabilidade do cálculo do pedido da classe principal. Dessa forma, se a regra de cálculo mudar, só sera afertado essa classe.

public class Calculartotal {

    public double calculateTotal(List<String> items) {
        double quantidadetotal = 0;
        for (String item : items) {
            quantidadetotal += 10.0;
        }
        return quantidadetotal;
    }
}
