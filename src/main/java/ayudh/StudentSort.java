package ayudh;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSort {
    ArrayList<Student> sort(int filterBy, ArrayList<Student> studentList) {
    if (filterBy == 1) {
      Collections.sort(studentList, Student.FirstNameComparator);
    } else if (filterBy == 2) {
      Collections.sort(studentList, Student.LastNameComparator);
    } else if (filterBy == 3) {
      Collections.sort(studentList, Student.AgeComparator);
    } else if (filterBy == 7) {
      Collections.sort(studentList, Student.IDComparator);
    }
    return studentList;
  }
}
