import java.util.Scanner;

public class LiftHW {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите высоту здания: ");
            int h = scanner.nextInt();

            System.out.print("Введите количество этажей, на которое поднимается лифт: ");
            int n = scanner.nextInt();

            System.out.print("Введите количество этажей, на которое опускается лифт: ");
            int m = scanner.nextInt();

            int currentFloor = 0;
            int trips = 0;

            while (currentFloor < h) {
                trips++;
                currentFloor += n;
                if (currentFloor >= h) {
                    break;
                }
                currentFloor -= m;
            }

            System.out.println("Количество подъемов: " + trips);

        }
    }

}
