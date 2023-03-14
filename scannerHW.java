import java.util.Scanner;

public class scannerHW {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter interger value: ");
        int value = sc.nextInt();
        System.out.println("Decimal value: " + value);
        System.out.println("Binary value: " + Integer.toBinaryString(value));
        System.out.println("Octal value: " + Integer.toOctalString(value));
        System.out.println("Hex value: " + Integer.toHexString(value));
    }
}
