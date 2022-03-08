public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructor.
     * @param name      String
     * @param address   String
     * @param school    String
     * @param pay       Double
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Override toString function.
     * @return String
     */
    public String toString() {
        return "Staff[Person[name=" + getName()
                + ",address=" + getAddress()
                + "],school=" + getSchool()
                + ",pay=" + getPay() + "]";
    }


}
