package services;

import java.util.List;

public class Calculartotal {

    public double calculateTotal(List<String> items) {
        double total = 0;
        for (String item : items) {
            total += 10.0;
        }
        return total;
    }
}
