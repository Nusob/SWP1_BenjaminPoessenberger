package at.pob.StudentMySQL;

import at.pob.StudentMySQL.dao.StudentDao;
import at.pob.StudentMySQL.dao.StudentDaoImpl;
import at.pob.StudentMySQL.model.Student;

/**
 * Created by bpoes on 11.10.2016.
 */
public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDaoImpl myStudentDaoImpl = new StudentDaoImpl();

        for (Student s : myStudentDaoImpl.getAllStudents()){
            System.out.println("Studentenname: " + s.getName());
        }

        System.out.println(myStudentDaoImpl.getStudent(4).getName());

        myStudentDaoImpl.updateStudent(new Student("Manuel",4));

        System.out.println(myStudentDaoImpl.getStudent(4).getName());
    }
}
