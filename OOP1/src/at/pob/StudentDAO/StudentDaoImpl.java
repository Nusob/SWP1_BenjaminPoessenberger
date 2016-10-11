package at.pob.StudentDAO;

import java.util.ArrayList;

/**
 * Created by bpoes on 11.10.2016.
 */
public class StudentDaoImpl implements StudentDao {
    private ArrayList<Student> students;

    public StudentDaoImpl() {
        this.students = new ArrayList<Student>();
        students.add(new Student("Sandro",1));
        students.add(new Student("Kevin",2));
        students.add(new Student("Daniel",3));
        students.add(new Student("Benjamin",4));
    }

    public ArrayList<Student> getAllStudents() {
         return students;
    }

    public Student getStudent(int mNr) {
        for (Student s : students){
            if (s.getmNr() == mNr){
                return s;
            }
        }
        return null;
    }

    public void deleteStudent(int mNr) {
        for (Student s : students){
            if (s.getmNr() == mNr){
                students.remove(s);
            }
        }
    }

    public void updateStudent(Student neu) {
        for (Student s: students){
            if(neu.getmNr() == s.getmNr()){
                students.set(students.indexOf(s),new Student(neu.getName(),neu.getmNr()));
            }
        }
    }
}
