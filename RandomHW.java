import java.util.Random;

public class RandomHW {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(0, 28801);

        System.out.println("Осталось " + x + " секунд");

        int hours = x / 3600;
        if (hours > 1) {
            System.out.println("Осталось " + hours + " часов");
        } else if (hours == 1) {
            System.out.println("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        }

    }

}
