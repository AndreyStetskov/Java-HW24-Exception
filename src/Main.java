import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Entered number of vacation days");
            int days = scan.nextInt();
            System.out.println("Entered number of people vacationing");
            int people = scan.nextInt();

            System.out.printf("Your current running cost is %d \n", Vacation.cost(days, people));
        }
        catch (Exception e) {
            throw new IllegalArgumentException("Unacceptable value", e);
        }
        finally {
            System.out.println("Good luck!!))");
        }
    }
}