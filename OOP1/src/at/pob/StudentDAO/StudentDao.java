package at.pob.StudentDAO;

import java.util.ArrayList;

/**
 * Created by bpoes on 11.10.2016.
 */
public interface StudentDao {
    public ArrayList<Student> getAllStudents();
    public Student getStudent(int mNr);
    public void updateStudent(Student neu);
    public void deleteStudent(int mNr);
}
