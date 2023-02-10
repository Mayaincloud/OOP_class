package db;

import dto.Student;

public class StudentTable extends Table<Student> {
    public boolean deleteStudentByFirstName(String firstName) {
       // int count = 0;
       // for(int i = 0; i < elements.size(); i++)
        for (Student student: elements) {
            if (student.getFirstName().equals(firstName)) {
                elements.remove(student);
                return true;
//                count++;
//                i--;
           }
//        }
//        for (Student student : elements) {
//            System.out.println(student);
//        }
//        if (count > 0)
        }
        return false;
        }

    }

//    public boolean deleteStudent(Student studentForDelete) {
//        for (Student student : elements) {
//            if(student.equals(studentForDelete)) {
//                elements.remove(studentForDelete);
//                return true;
//            }
//        }
//        return false;
//    }
//}
