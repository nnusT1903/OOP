import java.util.Objects;

public class StudentManagement {
    static Student[] students = new Student[100];
    Integer count = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        students[count] = new Student(newStudent);
        count++;
    }

    /**
     * Group students.
     */
    public String studentsByGroup() {
        if (students[0] == null) {
            return "";
        }

        int n = count;
        boolean[] used = new boolean[100];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (used[i]) {
                continue;
            }
            String tmpGroup = students[i].getGroup();
            ans.append(tmpGroup);
            ans.append("\n");
            for (int j = i; j < n; j++) {
                if (students[j].getGroup().equals(tmpGroup)) {
                    used[j] = true;
                    ans.append(students[j].getInfo()).append("\n");
                }
            }
        }
        return ans.toString();
    }

    /**
     *  Remove id-th student from list.
     */
    public void removeStudent(String id) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.err.println("Invalid");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        //reduce count by 1.
        count--;
    }

    /**
     * Main.
     */

    public static void main(String[] args) {
        StudentManagement solution = new StudentManagement();
        Student s1 = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        Student s2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        Student s3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        Student s4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        solution.addStudent(s1);
        solution.addStudent(s2);
        solution.addStudent(s3);
        solution.addStudent(s4);
        System.out.println(solution.studentsByGroup());
    }
}

