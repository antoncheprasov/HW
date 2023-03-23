import java.util.Scanner;

public class Colba {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature 1: ");

        int Temperature1 = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter temperature 2: ");

        int Temperature2 = sc.nextInt();

        boolean DeviceWorksCorrect;

        if (Temperature1 > 100 && Temperature2 < 100) {
            DeviceWorksCorrect = true;
        } else {
            DeviceWorksCorrect = false;

        }
        if (DeviceWorksCorrect) {
            System.out.println("Great!");
        } else {
            System.out.println("You need to check your Colbs!");
        }

    }
}
