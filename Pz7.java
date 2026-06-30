abstract class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;

    }
    public void start() {
        System.out.println("Транспорт заведён");
    }
}

class Car extends Vehicle{
    private int numberOfDoors ;
    public Car (String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + brand + " заведён");
    }
}
class Motorcycle extends Vehicle {
    public Motorcycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("Мотоцикл " + brand + " заведён");
    }
}
public class Pz7 {
    public static void main(String[] args) {
        Vehicle myCar = new Car("ВАЗ 2107", 2006, 4);
        Vehicle myMoto = new Motorcycle("Восход 3М", 1988);

        System.out.println("~~~~ Заводи Шарманку ~~~~~");
        myCar.start();
        myMoto.start();
    }
}