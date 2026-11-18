import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        Vehicle car = new Vehicle(
                "My car",
                "2024-01-15",
                new BigDecimal("20000"),
                "Ford",
                2024,
                120000
        );

        House house = new House(
                "My house",
                "2020-05-10",
                new BigDecimal("250000"),
                "123 Main Street",
                1,
                1500,
                4000
        );


        Cash cash = new Cash(
                "My cash",
                "2026-11-18",
                new BigDecimal("100")
        );



        assets.add(car);
        assets.add(house);
        assets.add(cash);

        BigDecimal total = BigDecimal.ZERO;

        for (Asset item : assets) {
            System.out.println(item);
            System.out.println();

            total = total.add(item.getValue());
        }

        System.out.println("Total value: " + total);
    }
}