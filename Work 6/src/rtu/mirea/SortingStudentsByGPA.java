package rtu.mirea;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getMark() != student2.getMark())
            if (student1.getMark() > student2.getMark())
                return 1;
            else
                return -1;
        else if (student1.getCourse() != student2.getCourse()) {
            if (student1.getCourse() > student2.getCourse())
                return 1;
            else
                return -1;
        }
        else if (student1.getGroup() != student2.getGroup()) {
            if (student1.getGroup().equals(student2.getGroup()))
                return 1;
            else
                return -1;
        }
        else if (student1.getSpeciality() != student2.getSpeciality()) {
            if (student1.getSpeciality().equals(student2.getSpeciality()))
                return 1;
            else
                return -1;
        }
        else if (student1.getSurname() != student2.getSurname()) {
            if (student1.getSurname().equals(student2.getSurname()))
                return 1;
            else
                return -1;
        }
        else
            return student1.compareTo(student2);
    }
}
