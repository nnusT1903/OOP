public class Car extends Vehicle {

    private int numberOfDoors;

    /**
     * Constructor for objects of class Car.
     * @param brand              String
     * @param model              String
     * @param registrationNumber String
     * @param owner              Person
     * @param numberOfDoors      Integer
     */

    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Get Info.
     * @return A string with information about the car.
     */

    public String getInfo() {
        String info = "Car:";
        info += String.format("\n\tBrand: %s", this.brand);
        info += String.format("\n\tModel: %s", this.model);
        info += String.format("\n\tRegistration Number: %s", this.registrationNumber);
        info += String.format("\n\tNumber of Doors: %d", this.numberOfDoors);
        info += String.format("\n\tBelongs to %s - %s",
                this.owner.getName(), this.owner.getAddress());
        return info;
    }

    /**
     * Get the number of doors of the car.
     * @return Integer.
     */

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Set the number of doors of the car.
     * @param numberOfDoors The number of doors of the car.
     */

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

}