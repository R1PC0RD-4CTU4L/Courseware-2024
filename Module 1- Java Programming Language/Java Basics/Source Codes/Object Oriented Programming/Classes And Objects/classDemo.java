class car {

    /* States */
    String brand;
    String model;
    String color;
    float engineCapacity;
    float fuelTankCapacity;
    int seats;

    /* Behaviours */

    public void unLockDoors() {
        System.out.println("Doors Are Unlocked!");
    }

    public void ignition() {
        System.out.println("Cranking the self start!");
    }

    public void turnOnHeadLights() {

        System.out.println("Headlights Are On!");
    }

    public void turnOnBlinkers() {
        System.out.println("Blinkers Are On!");
    }

}

public class classDemo {

    public static void main(String[] args) {

        car c1 = new car();
        System.out.println(c1.brand + " " + c1.color + " " + c1.engineCapacity + " " + c1.fuelTankCapacity);

    }
}