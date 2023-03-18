package co.edu.poli.student.view;

import java.util.Scanner;

import co.edu.poli.student.controller.StudentController;

public class Cliente {
		
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Input id student");
		String txtId = s.nextLine();
		System.out.println("Input name student");
		String txtName = s.nextLine();
		System.out.println("Input address student");
		String txtAddress = s.nextLine();
		
		StudentController ec = new StudentController(txtId, txtName, txtAddress);
		
		ec.eventAdd();	
		System.out.println(ec.eventReadAll());
		
		s.close();
	}

}