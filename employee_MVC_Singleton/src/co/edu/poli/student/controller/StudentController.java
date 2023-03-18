package co.edu.poli.student.controller;

import java.sql.SQLException;
import java.util.List;

import co.edu.poli.student.dao.StudentDao;
import co.edu.poli.student.dao.StudentDaoImplementation;
import co.edu.poli.student.model.Student;

public class StudentController {

	Student e;
	StudentDao edao;

	public StudentController(String i, String n, String a) {
		e = new Student(i, n, a);
		edao = new StudentDaoImplementation();
	}

	public Student eventAdd() {
		try {
			return edao.add(e);
		} catch (SQLException e) {
			return null;
		}
	}

	public Student eventRead(String id) {
		try {
			return edao.getStudent(id);
		} catch (SQLException e) {
			return null;
		}
	}

	public List<Student> eventReadAll() {
		try {
			return edao.getStudent();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Student eventUpdate(String id, Student emp) {
		try {
			return edao.update(id, emp);
		} catch (SQLException e) {
			return null;
		}
	}

	public Student eventDelete(String id) {
		try {
			return edao.delete(id);
		} catch (SQLException e) {
			return null;
		}
	}

}
