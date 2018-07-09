package ayudh;

import java.util.Comparator;

public class Student {

    int id;
    String firstName;
    String lastName;
    int age;
    String gender;
    String branch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    Student(int id, String firstName, String lastName, int age, String gender, String branch) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.branch = branch;
    }

    public static Student createStudent(String line) {
        String[] inputData = line.split(",");
        return new Student(Integer.parseInt(inputData[0]),
                inputData[1],
                inputData[2],
                Integer.parseInt(inputData[3]),
                inputData[4],
                inputData[5]);
    }

    public static Comparator<Student> FirstNameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    };

    public static Comparator<Student> LastNameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    };

    public static Comparator<Student> IDComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getId() - o2.getId();
        }
    };

    public static Comparator<Student> AgeComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge() - o2.getAge();
        }
    };

}
