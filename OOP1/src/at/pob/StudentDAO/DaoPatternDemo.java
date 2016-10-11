package at.pob.StudentDAO;

import java.util.ArrayList;

/**
 * Created by bpoes on 11.10.2016.
 */
public class DaoPatternDemo {
    public static void main(String[] args) {
         StudentDaoImpl myStudentDaoImpl = new StudentDaoImpl();

        System.out.println(myStudentDaoImpl.getAllStudents());
        System.out.println(myStudentDaoImpl.getStudent(1).getName());

        myStudentDaoImpl.deleteStudent(3);
        myStudentDaoImpl.updateStudent(new Student("Bernhard",1));

        System.out.println(myStudentDaoImpl.getAllStudents());
        System.out.println(myStudentDaoImpl.getStudent(1).getName());
    }
}
