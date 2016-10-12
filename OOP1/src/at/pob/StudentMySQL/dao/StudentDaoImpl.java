package at.pob.StudentMySQL.dao;

import at.pob.StudentMySQL.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bpoes on 11.10.2016.
 */
public class StudentDaoImpl implements StudentDao {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdao","root", "");
    }

    private void  closeConnection(Connection connection){
        if (connection == null)
            return;
        try {
            connection.close();
        } catch (SQLException ex){
        }
    }

    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> result = new ArrayList<>();
        Connection connection = null;
        try {
            connection = getConnection();

            String sql = "select * from student";

            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Student student = new Student(resultSet.getString("name"),resultSet.getInt("mNr"));
                result.add(student);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            closeConnection(connection);
        }
        return result;
    }

    public Student getStudent(int mNr) {
        Connection connection = null;
        try {
            connection = getConnection();

            String sql = "select * from student where mNr = " + mNr;

            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Student student = new Student(resultSet.getString("name"),resultSet.getInt("mNr"));
                return student;
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            closeConnection(connection);
        }
        return null;
    }

    public void deleteStudent(int mNr) {
        Connection connection = null;
        try {
            connection = getConnection();

            String sql = "delete from student where mNr = " + mNr;

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            closeConnection(connection);
        }
    }

    public void updateStudent(Student neu) {
        Connection connection = null;
        try {
            connection = getConnection();

            String sql = "UPDATE `student` SET `mNr`="+ neu.getmNr() +",`Name`='"+ neu.getName() +"' where mNr = " + neu.getmNr();

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            closeConnection(connection);
        }
    }
}
