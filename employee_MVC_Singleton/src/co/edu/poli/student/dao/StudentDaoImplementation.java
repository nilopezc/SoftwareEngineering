package co.edu.poli.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.poli.student.model.Student;

public class StudentDaoImplementation implements StudentDao {

	static Connection con = DatabaseConnection.getConnection();

	@Override
	public Student add(Student stu) throws SQLException {
		String query = "insert into student(stu_id, stu_name, stu_address) VALUES (?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, stu.getStu_id());
		ps.setString(2, stu.getStu_name());
		ps.setString(3, stu.getStu_address());
		ps.executeUpdate();
		return stu;
	}

	@Override
	public Student delete(String id) throws SQLException {
		Student e = getStudent(id);
		if (e != null) {
			String query = "delete from student where stu_id =?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, id);
			ps.executeUpdate();
		}
		return e;
	}

	@Override
	public Student getStudent(String id) throws SQLException {
		String query = "select * from student where stu_id= ?";
		PreparedStatement ps = con.prepareStatement(query);
		Student emp = null;
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		boolean check = false;
		while (rs.next()) {
			check = true;
			emp = new Student(
					rs.getString("stu_id"),
					rs.getString("stu_name"), 
					rs.getString("stu_address"));
		}

		if (check)
			return emp;
		else
			return null;
	}

	@Override
	public List<Student> getStudent() throws SQLException {
		String query = "select * from student";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		List<Student> ls = new ArrayList<Student>();

		while (rs.next()) {
			Student emp = new Student(
					rs.getString("stu_id"),
					rs.getString("stu_name"), 
					rs.getString("stu_address"));
			ls.add(emp);
		}
		return ls;
	}

	@Override
	public Student update(String id, Student emp) throws SQLException {

		Student e = getStudent(id);
		if (e != null) {

			String query = "update student set stu_name=?, " + " stu_address= ? where stu_id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, emp.getStu_name());
			ps.setString(2, emp.getStu_address());
			ps.setString(3, emp.getStu_id());
			ps.executeUpdate();
		}

		return e;
	}
}
