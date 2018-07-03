package ayudh;

public class Student {

    int id;
    String firstName;
    String lastName;
    int age;
    String gender;
    String branch;

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
    
}
