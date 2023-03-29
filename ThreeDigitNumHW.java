import java.util.Random;

public class ThreeDigitNumHW {

    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100,999);
        int maxDigit = 0;

        System.out.println("Random three digit Number: " + number);

        while (number > 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }

            number /= 10;

        }

        System.out.println("Biggest digit in Number: " + maxDigit);

    }

}
