public class Car {
    int distance;
    int fuel;

    public Car(int distance, int fuel) {
        this.distance = distance;
        this.fuel = fuel;
    }
    void display(){
        System.out.println("Distance: " + distance+ " Fuel: " + fuel);
    }
}

