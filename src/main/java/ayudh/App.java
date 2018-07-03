package ayudh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws IOException {
        String dataPath = getHomeDirPath() + "\\src\\main\\resources\\data.csv";
        String line;
        BufferedReader bufferedReader = null;
        ArrayList<Student> students = new ArrayList<>();
        try {
            Path path = Paths.get(dataPath);
            bufferedReader = Files.newBufferedReader(path);
            while ((line = bufferedReader.readLine()) != null)
                students.add(Student.createStudent(line));
        } catch(FileNotFoundException e) {
            System.out.println("File Not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            bufferedReader.close();
        }



    }

    static String getHomeDirPath () {
        return System.getProperty("user.dir");
    }

}
