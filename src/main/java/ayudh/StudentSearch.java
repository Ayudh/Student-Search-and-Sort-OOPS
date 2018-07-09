package ayudh;

import java.util.ArrayList;

public class StudentSearch {
    ArrayList<Student> search(int filterBy, String searchItem, ArrayList<Student> studentList) {
    ArrayList<Student> searchResult = new ArrayList<Student>();
    for (int index = 0; index < studentList.size(); index++) {
      Student s = studentList.get(index);
      String dataFound = "";
      if (filterBy == 1) {
        dataFound = s.getFirstName();
      } else if (filterBy == 2) {
        dataFound = s.getLastName();
      } else if (filterBy == 3) {
        dataFound = s.getAge() + "";
      } else if (filterBy == 4) {
        dataFound = Integer.toString(s.getAge());
      }
      if (dataFound.equalsIgnoreCase(searchItem)) {
        searchResult.add(s);
      }
    }
    return searchResult;
  }
}
