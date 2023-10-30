import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dimensions deathStarDimensions = new Dimensions(10, 10, 10);

        Cargo deathStar = new Cargo(deathStarDimensions, 6, "Алдераан", true,
                "ACDC555", false);
        System.out.println(deathStar.toString());

        Cargo newDeathStar = deathStar.setNewDeliveryAddress("Эндор");
        System.out.println(newDeathStar.toString());

        Cargo copyDeathStar = new Cargo(deathStar.getDimensions(),
                deathStar.getWeight(),
                deathStar.getDeliveryAddress(),
                deathStar.getIsFragile(),
                deathStar.getRegistrationNumber(),
                deathStar.getIsFragile());
        System.out.println(copyDeathStar.toString());

        /*
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
        */
    }
}