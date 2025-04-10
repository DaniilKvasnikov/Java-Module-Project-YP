import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];
        for (int i = 0; i < 3; i++) {
            String name;
            int speed;
            while (true){
                System.out.println("Введите название машины №" + (i + 1) + ":");
                name = scanner.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Ошибка: Пустое имя");
                } else {
                    break;
                }
            }
            while (true) {
                System.out.println("Введите скорость машины №" + (i + 1) + " (целое число от 0 до 250):");
                String speedInput = scanner.nextLine().trim();
                try {
                    speed = Integer.parseInt(speedInput);
                    if (speed > 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Неправильная скорость");
                    }
                } catch (NumberFormatException e){
                    System.out.println("Ошибка: Скорость - целое число от 0 до 250");
                }
            }
            cars[i] = new Car(name, speed);
        }
        Race race = new Race(cars);
        System.out.println("Самая быстрая машина: " + race.leader.name);
    }
}