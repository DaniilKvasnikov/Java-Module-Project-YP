
public class Race {
    Car leader;

    Race(Car[] cars){
        if (cars.length == 0)
            return;
        leader = cars[0];
        for (Car car : cars){
            leader = distance(car) > distance(leader) ? car : leader;
        }
    }

    int distance(Car car){
        return 24 * car.speed;
    }
}
