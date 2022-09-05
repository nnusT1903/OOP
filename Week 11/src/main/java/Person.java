public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    /**
     * Initialization.
     */

    public Person() {
        this.name = "";
        this.address = "";
        this.age = 0;
    }

    /**
     * Constructor.
     *
     * @param name    String type Name
     * @param age     Integer type Age
     * @param address String type Address
     */

    public Person(String name, int age, String address) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    /**
     * Getter for Name.
     *
     * @return String
     */

    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     *
     * @param name String
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Age.
     *
     * @return Int
     */

    public int getAge() {
        return age;
    }

    /**
     * Setter for Age.
     *
     * @param age Int
     */

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter for Address.
     *
     * @return String
     */

    public String getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     *
     * @param address String
     */

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person person) {
        if (this.name.compareTo(person.getName()) == 0) {
            return this.age - person.getAge();
        } else {
            return this.name.compareTo(person.getName());
        }
    }
}
