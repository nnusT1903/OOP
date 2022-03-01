public class Student {
    //attributes:
    private String name;
    private String id;
    private String email;
    private String group;
    /**
     * Constructor.
     */

    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * Full Constructor.
     * @param name getName()
     * @param id    getId()
     * @param email getEmail()
     * @param group getGroup()
     */
    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    /**
     * Getters.
     */
    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Setters.
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Get information.
     */
    public String getInfo() {
        String temp = name + " - " + id + " - " + group + " - " + email;
        return temp;
    }

    /**
     * Copy Data.
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

}