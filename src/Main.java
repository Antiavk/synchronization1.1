import java.awt.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Diler diler = Diler.getDiler();
        List<Car> cars = List.of(
                new Car(Color.BLUE),
                new Car(Color.RED));
        diler.addCars(cars);

        Customer petya = new Customer("Алексей", new Car(Color.RED));
        Customer vasya = new Customer("Дмитрий", new Car(Color.BLACK));
        Customer victor = new Customer("Иван", new Car(Color.BLACK));

        petya.start();
        vasya.start();
        System.out.println("Дилер ожидает поставку новых авто");
        diler.addCars(List.of(new Car(Color.BLACK)));
        victor.start();
        diler.addCars(List.of(new Car(Color.BLACK)));
    }
}