package co.edu.poli.student.dao;

import java.sql.SQLException;
import java.util.List;

import co.edu.poli.student.model.Student;
  
public interface StudentDao {
  
    public Student add(Student emp)
        throws SQLException;
    
    public Student delete(String id)
        throws SQLException;
    
    public Student getStudent(String id)
        throws SQLException;
    
    public List<Student> getStudent()
        throws SQLException;
    
    public Student update(String id, Student emp)
        throws SQLException;
    

}