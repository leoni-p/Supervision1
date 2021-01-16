package uk.ac.cam.lxp20.supo3;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class CarCollection  {
    public static class Car implements Comparable{
        private String manufacturer;
        private int age;

        Car(String manufacturer, int age){
            this.manufacturer = manufacturer;
            this.age = age;
        }

        @Override
        public int compareTo(Object o) {
            Car other = (Car) o;
            return manufacturer.compareTo(other.manufacturer);
        }

        static class CarComparator implements Comparator<Car> {
            public int compare(Car car1, Car car2) {
                if (car1.manufacturer == car2.manufacturer) {
                    return car1.getAge() - car2.age;
                }
                return car1.manufacturer.compareTo(car2.manufacturer);
            }
        }

        public int getAge() {
            return age;
        }

        @Override
            public String toString(){ return manufacturer + Integer.toString(age);}

    }

   ArrayList<Car> cars;

    CarCollection(ArrayList<Car> cars) {
        this.cars = cars;
    }

    void NoComparator(){
        Collections.sort(cars);
    }

    void WithComparator(){
        Collections.sort(cars, new Car.CarComparator());

    }


    public static void main(String[] args) {
        Car[] c = {new Car("A",2),new Car("A",1), new Car("C",2),new Car("B",1)};
        CarCollection cars = new CarCollection(new ArrayList(List.of(c)));
        cars.NoComparator();
        System.out.println(cars.cars);
        cars.WithComparator();
        System.out.println(cars.cars);
    }
}
