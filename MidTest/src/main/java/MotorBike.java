public class MotorBike extends Vehicle {

    private boolean hasSidecar;

    /**
     * Constructor for objects of class MotorBike.
     * @param brand              String
     * @param model              String
     * @param registrationNumber String
     * @param owner              Person
     * @param hasSidecar         boolean
     */

    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Get Info.
     * @return String.
     */

    public String getInfo() {
        String info = "Motor Bike:";
        info += String.format("\n\tBrand: %s", this.brand);
        info += String.format("\n\tModel: %s", this.model);
        info += String.format("\n\tRegistration Number: %s", this.registrationNumber);
        info += String.format("\n\tHas Side Car: %b", this.hasSidecar);
        info += String.format("\n\tBelongs to %s - %s",
                this.owner.getName(), this.owner.getAddress());
        return info;
    }

    /**
     * Boolean to check If Vehicle has Side car.
     * @return Whether the motorbike has a sidecar or not.
     */

    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    /**
     * Set If Vehicle has Side car.
     * @param hasSidecar boolean
     */

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
