package ayudh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {
        String dataPath = getHomeDirPath() + "\\src\\main\\resources\\data.csv";
        String line;
        BufferedReader bufferedReader = null;
        ArrayList<Student> studentList = new ArrayList<>();
        try {
            Path path = Paths.get(dataPath);
            bufferedReader = Files.newBufferedReader(path);
            while ((line = bufferedReader.readLine()) != null)
                studentList.add(Student.createStudent(line));
        } catch(FileNotFoundException e) {
            System.out.println("File Not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            bufferedReader.close();
        }

        Scanner consoleScanner = new Scanner(System.in);

        do {
      System.out.println("*---MENU---*");
      System.out.println("1. Search");
      System.out.println("2. Sort");
      System.out.println("3. Exit");

      System.out.println("Enter your choice");
      int choice = consoleScanner.nextInt();

      if (choice == 3) {
        System.out.print("Program exited");
        break;
      }

      if (choice == 1) {
        System.out.println("Search?");
      } else if (choice == 2) {
        System.out.println("Sort By?");
      } else {
        System.out.println("Invalid choice");
        continue;
      }

      System.out.println("1. First Name");
      System.out.println("2. Last Name");
      System.out.println("3. Age");
      System.out.println("4. Id");

      int filterBy = consoleScanner.nextInt();
      if (filterBy > 8 || filterBy < 1) {
        System.out.println("Invalid filter");
        continue;
      }
      if (choice == 1) {
        consoleScanner.nextLine();// leaving the current line
        String searchItem = consoleScanner.nextLine(); // reading the next line as a string
        StudentSearch searchObject = new StudentSearch();
        ArrayList<Student> result = searchObject.search(filterBy, searchItem, studentList);
        if (result.size() == 0) {
          System.out.println("No record found");
        }
        for (int index = 0; index < result.size(); index++) {
          System.out.println(result.get(index));
        }
      }

      if (choice == 2) {
        StudentSort sortObject = new StudentSort();
        ArrayList<Student> result = sortObject.sort(filterBy, studentList);
        for (int index = 0; index < result.size(); index++) {
          System.out.println(result.get(index));
        }
      }

    } while (true);

    }

    static String getHomeDirPath () {
        return System.getProperty("user.dir");
    }

}
