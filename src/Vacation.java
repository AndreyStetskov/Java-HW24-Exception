import java.io.IOException;

public class Vacation {

    public static int cost(int days, int people) {
        if (days <= 0 || people <= 0) {
            throw new IllegalArgumentException("Negative number was entered");
        }

        int cost;
        return cost = days * people;
    }
}
