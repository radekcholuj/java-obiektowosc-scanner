public class CarRepo {
    Car [] cars;
    double distanceHoliday=0;
    double fuelHoliday;
    double avr;
    int quantity ;
    public CarRepo(int size) {
        this.cars = new Car[size];
    }

    void add(Car car,  int quantity ){


        cars[quantity ] = car;
        distanceHoliday = distanceHoliday + cars[quantity ].distance;
        fuelHoliday = fuelHoliday + cars[quantity ].fuel;
        avr = fuelHoliday*100/distanceHoliday;
    }


    void displayAll(){
        for (int i = 0; i < cars.length & cars[i] != null; i++) {
            cars[i].display();
            System.out.println("DistSum: " + distanceHoliday);
            System.out.println("Avr: " +avr);
        }
    }
}

