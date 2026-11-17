import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Vehicle(
                "My car",
                "2024-01-15",
                new BigDecimal("20000"),
                "Ford",
                2024,
                120000
        );

        System.out.println("Original cost: " + car.getOriginalCost());
        System.out.println("Current value: " + car.getValue());
    }
}