public class Elevator {
    public int currentFloor = 1;
    public int minFloor;
    public int maxFloor;

    public Elevator(int a, int b) {
        minFloor = a;
        maxFloor = b;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveDown() {
        currentFloor = currentFloor - 1;
        return currentFloor;
    }

    public int moveUp() {
        currentFloor = currentFloor + 1;
        return currentFloor;
    }

    public void move(int floor) {
        if (!(minFloor <= floor && floor <= maxFloor)) {
            System.out.println("Этого этажа не существует(");
        } else if (floor == currentFloor) {
            System.out.println("Вы уже на этом этаже...");
        } else if (currentFloor < floor) {
            while (currentFloor != floor) {
                moveUp();
                System.out.println("Вы на этаже: " + getCurrentFloor());
            }
            System.out.println("Вы прибыли)");
        } else if (currentFloor > floor) {
            while (currentFloor != floor) {
                moveDown();
                System.out.println("Вы на этаже: " + getCurrentFloor());
            }
            System.out.println("Вы прибыли)");
        }
    }
}