import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a population: ");
        int population = scanner.nextInt();

        System.out.print("Enter an country identifier: ");
        String countryId = scanner.next();

        if (countryId.equals("DE")) {
            if (population > 0 && population < 100_000)
                System.out.println("this city is small in Germany");
            else if (population >= 100_000 && population < 400_000)
                System.out.println("this city is middle in Germany");
            else if (population >= 400_000 && population < 1_000_000)
                System.out.println("this city in Germany with undefined parameter");
            else if (population >= 1_000_000)
                System.out.println("this city is big in Germany");
            else
                System.out.println("wrong information about population");

        } else if (countryId.equals("FR")) {
            if (population > 0 && population < 200_000)
                System.out.println("this city is small in France");
            else if (population >= 200_000 && population < 500_000)
                System.out.println("this city is middle in France");
            else if (population >= 400_000 && population < 1_000_000)
                System.out.println("this city in France with undefined parameter");
            else if (population >= 1_500_000)
                System.out.println("this city is big in France");
            else
                System.out.println("wrong information about population");
        } else {
            System.out.println("wrong country id");
        }


        scanner.close();

    }
}
