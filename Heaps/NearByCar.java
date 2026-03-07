import java.util.*;
public class NearByCar{
    static class Car implements Comparable<Car>{
        int id;
        int x;
        int y;

        public Car(int id, int x, int y){
            this.id = id;
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Car c2) {
            return (this.x * this.x + this.y * this.y) - (c2.x * c2.x + c2.y * c2.y);
        }
    }
    public static void main(String[] args) {
        Car[] cars = {
            new Car(1, 3, 4),
            new Car(2, 1, 2),
            new Car(3, 5, 6)
        };
        Arrays.sort(cars);
        for(Car car : cars){
            System.out.println("Car ID: " + car.id + ", Distance: " + (car.x * car.x + car.y * car.y));
        }
    }
}